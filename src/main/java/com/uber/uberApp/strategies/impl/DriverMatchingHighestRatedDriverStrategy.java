package com.uber.uberApp.strategies.impl;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.entities.RideRequest;
import com.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy  implements DriverMatchingStrategy {

    @Override
    public List<DriverDto> findMatchingDriver(RideRequest rideRequest) {
        return null;
    }
}
