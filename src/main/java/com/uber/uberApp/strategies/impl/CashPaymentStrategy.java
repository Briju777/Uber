package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.Payment;
import com.uber.uberApp.entities.enums.PaymentStatus;
import com.uber.uberApp.entities.enums.TransactionMethod;
import com.uber.uberApp.services.PaymentService;
import com.uber.uberApp.services.WalletService;
import com.uber.uberApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CashPaymentStrategy implements PaymentStrategy {
    private final WalletService walletService;
    private final PaymentService paymentService;
    @Override
    public void processPayment(Payment payment) {
        Driver driver = payment.getRide().getDriver();

        double platformCommission = payment.getAmount();

        walletService.deductMoneyFromWallet(driver.getUser(), platformCommission, null,
                payment.getRide(), TransactionMethod.RIDE);

        paymentService.updatePaymentMethod(payment, PaymentStatus.CONFIRMED);

    }
}
