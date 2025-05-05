package com.uber.uberApp.Services;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
