package com.uber.uberApp.services;

import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.User;

import java.util.List;


public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideRequestDto cancelRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RiderDto> getAllMyRides();

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
