package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.RideRequest;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.User;
import com.uber.uberApp.services.RiderService;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        log.info(rideRequest.toString());
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

    @Override
    public Rider createNewRider(User user) {
        return null;
    }

    @Override
    public Rider getCurrentRider() {
        return null;
    }
}
