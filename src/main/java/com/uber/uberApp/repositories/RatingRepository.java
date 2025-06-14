package com.uber.uberApp.repositories;

import com.uber.uberApp.entities.Driver;
import com.uber.uberApp.entities.Rating;
import com.uber.uberApp.entities.Ride;
import com.uber.uberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);

    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);

}
