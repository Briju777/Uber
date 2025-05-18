package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.entities.RideRequest;
import com.uber.uberApp.services.DistanceService;
import com.uber.uberApp.strategies.RiderFareCalculationStrategy;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Primary
public class RideFareSurgePricingFareCalculationStrategy implements RiderFareCalculationStrategy {

    private final DistanceService distanceService;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(), rideRequest.getDropOffLocation());

        return distance;
    }
}
