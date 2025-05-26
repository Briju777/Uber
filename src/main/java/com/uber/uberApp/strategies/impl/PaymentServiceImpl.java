package com.uber.uberApp.strategies.impl;

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
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Payment payment) {
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        return null;
    }

    @Override
    public Payment updatePaymentStatus(Payment payment, PaymentStatus paymentStatus) {
      payment.setPaymentStatus(paymentStatus);
      return paymentRepository.save(payment);
    }
}
