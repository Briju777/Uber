package com.uber.uberApp.services;

import com.uber.uberApp.entities.Payment;
import com.uber.uberApp.entities.Ride;

public interface PaymentService {
    void processPayment(Payment payment);

    Payment createNewPayment(Ride ride);
}
