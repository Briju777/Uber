package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.Payment;
import com.uber.uberApp.entities.Ride;
import com.uber.uberApp.entities.enums.PaymentStatus;
import com.uber.uberApp.repositories.PaymentRepository;
import com.uber.uberApp.services.PaymentService;
import com.uber.uberApp.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl  implements PaymentService {
    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;
    @Override
    public void processPayment(Payment payment) {

    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment = Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public Payment updatePaymentMethod(Payment payment, PaymentStatus paymentStatus) {
        return null;
    }
}
