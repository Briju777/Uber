package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.DriverDto;
import com.uber.uberApp.dto.RideDto;
import com.uber.uberApp.dto.RiderDto;
import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.Rating;
import com.uber.uberApp.entities.Ride;
import com.uber.uberApp.entities.Rider;
import com.uber.uberApp.exceptions.ResourceNotFoundException;
import com.uber.uberApp.repositories.DriverRepository;
import com.uber.uberApp.repositories.RatingRepository;
import com.uber.uberApp.repositories.RiderRepository;
import com.uber.uberApp.services.RatingService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;
    private final DriverRepository driverRepository;
    private final RiderRepository riderRepository;
    private final ModelMapper modelMapper;


    @Override
    public DriverDto rateDriver(Ride ride, Integer rating) {
        Driver driver =ride.getDriver();
        Rating ratingObj = ratingRepository.findByRide(ride)
                .orElseThrow(() -> new ResourceNotFoundException("Rating not found for ride with id: " + ride.getId()));

        ratingObj.setDriverRating(rating);
        ratingRepository.save(ratingObj);
        Double newRating = ratingRepository.findByDriver(driver)
                .stream()
                .mapToDouble(rating1 -> rating1.getDriverRating())
                .average().orElse(0.0);
        driver.setRating(newRating);

        Driver savedDriver = driverRepository.save(driver);

        return modelMapper.map(savedDriver, DriverDto.class);

    }

    @Override
    public RideDto rateRider(Ride ride, Integer rating) {
        Rider rider = ride.getRider();
        Rating ratingObj = ratingRepository.findByRide(ride)
                .orElseThrow(() -> new ResourceNotFoundException("Rating not found for ride with id: " + ride.getId()));

        ratingObj.setRiderRating(rating);
        ratingRepository.save(ratingObj);
        Double newRating = ratingRepository.findByRider(rider)
                .stream()
                .mapToDouble(rating1 -> rating1.getRiderRating())
                .average().orElse(0.0);
        rider.setRating(newRating);

        Rider savedRider = riderRepository.save(rider);
        return modelMapper.map(savedRider, RideDto.class);
    }

    @Override
    public void createNewRating(Ride ride) {
        Rating rating = Rating.builder()
                .rider(ride.getRider())
                .driver(ride.getDriver())
                .ride(ride)
                .build();

        ratingRepository.save(rating);

    }
}
