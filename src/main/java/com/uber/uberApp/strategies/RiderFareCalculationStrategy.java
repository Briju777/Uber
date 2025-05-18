package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.entities.RideRequest;

public interface RiderFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;
    double calculateFare(RideRequest request);


}
