package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.Payment;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.enums.PaymentStatus;
import com.uber.uberApp.entities.enums.TransactionMethod;
import com.uber.uberApp.services.PaymentService;
import com.uber.uberApp.services.WalletService;
import com.uber.uberApp.strategies.PaymentStrategy;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class WalletPaymentStrategy implements PaymentStrategy {
    private final WalletService walletService;
    private final PaymentService paymentService;

    @Override
    @Transactional
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();
        Rider rider = payment.getRide().getRider();

        walletService.deductMoneyFromWallet(rider.getUser(), payment.getAmount(), null, payment.getRide(), TransactionMethod.RIDE);
        double driverCut = payment.getAmount() * (1 - PLATFORM_COMMISSION);
        walletService.addMoneyToWallet(driver.getUser(), driverCut, null, payment.getRide(), TransactionMethod.RIDE);

        paymentService.updatePaymentStatus(payment, PaymentStatus.CONFIRMED);
    }
}
