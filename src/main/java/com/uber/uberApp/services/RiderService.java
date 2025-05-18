package com.uber.uberApp.services;

import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;

import java.util.List;


public interface RiderService {
    RideRequestDto requestRide(Long rideId);

    RideRequestDto cancelRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
