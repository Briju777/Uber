package com.uber.uberApp.Services.impl;

import com.uber.uberApp.Services.RiderService;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(Long rideId) {
        return null;
    }

    @Override
    public RideRequestDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RiderDto> getAllMyRides() {
        return null;
    }
}
