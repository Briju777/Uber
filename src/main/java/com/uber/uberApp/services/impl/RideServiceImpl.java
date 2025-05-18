package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.Ride;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.enums.RideStatus;
import com.uber.uberApp.services.RideService;
import com.uber.uberApp.services.RiderService;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {


    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driveId, PageRequest pageRequest) {
        return null;
    }
}
