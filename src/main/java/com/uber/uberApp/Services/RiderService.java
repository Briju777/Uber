package com.uber.uberApp.Services;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RiderService {
    RideRequestDto requestRide(Long rideId);

    RideRequestDto cancelRide(Long rideId);

    RideDto rateRider(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
