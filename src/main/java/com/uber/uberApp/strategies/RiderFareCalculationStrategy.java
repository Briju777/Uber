package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.RideRequestDto;

public interface RiderFareCalculationStrategy {
    double calculateFare(RideRequestDto requestDto);


}
