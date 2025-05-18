package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.strategies.RiderFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RiderFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto requestDto) {
        return 0;
    }
}
