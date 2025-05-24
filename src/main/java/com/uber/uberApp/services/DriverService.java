package com.uber.uberApp.services;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.entities.Driver;

import java.util.List;


public interface DriverService {

    RideDto acceptRide(Long rideRequestId);
    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

    Driver getCurrentDriver();

}
