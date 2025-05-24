package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RideRequestDto;
import com.uber.uberApp.dto.RiderDto;
import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.RideRequest;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.enums.RideRequestStatus;
import com.uber.uberApp.exceptions.ResourceNotFoundException;
import com.uber.uberApp.repositories.RideRequestRepository;
import com.uber.uberApp.repositories.RiderRepository;
import com.uber.uberApp.services.RiderService;
import com.uber.uberApp.strategies.RideStrategyManager;
import jakarta.transaction.Transactional;
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
    private final RideStrategyManager rideStrategyManager;
    private final RideRequestRepository rideRequestRepository;

    private final RiderRepository riderRepository;

    @Override
    @Transactional
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {

        Rider rider = getCurrentRider();
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);
        rideRequest.setRider(rider);


        Double fare = rideStrategyManager.riderFareCalculationStrategy().calculateFare(rideRequest);
        rideRequest.setFare(fare);
        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        // Broadcast the message to all driver
        List<Driver> drivers = rideStrategyManager.driverMatchingStrategy(rider.getRating()).findMatchingDriver(rideRequest);
        // TODO Send notification to all driver about the ride request
        return modelMapper.map(savedRideRequest, RideRequestDto.class);
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
        Rider rider = Rider.builder()
                .user(user)
                .rating(0.0)
                .build();

        return riderRepository.save(rider);
    }

    @Override
    public Rider getCurrentRider() {
        return riderRepository.findById(1L).orElseThrow(() ->
                new ResourceNotFoundException("Rider not found with id: " + 1));
    }
}
