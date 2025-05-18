package com.uber.uberApp.strategies;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideRequestDto;

import java.util.List;

public interface DriverMatchingStrategy {
    List<DriverDto> findMatchingDriver(RideRequestDto rideRequestDto);

}
