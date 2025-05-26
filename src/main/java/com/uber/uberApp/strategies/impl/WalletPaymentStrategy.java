package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.entities.Payment;
import com.uber.uberApp.services.WalletService;
import com.uber.uberApp.strategies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Rider -> 100%
//  Deduct 30% from wallet
@Service
@RequiredArgsConstructor
public class WalletPaymentStrategy implements PaymentStrategy {
    private final WalletService walletService;

    @Override
    public void processPayment(Payment payment) {

    }
}
