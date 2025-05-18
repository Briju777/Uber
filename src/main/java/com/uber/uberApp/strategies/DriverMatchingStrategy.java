package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {
    List<DriverDto> findMatchingDriver(RideRequest rideRequest);

}
