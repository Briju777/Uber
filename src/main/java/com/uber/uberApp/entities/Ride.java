package com.uber.uberApp.entities;

import com.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(columnDefinition = "Geometry(Point, 4326")
    private Point pickupLocation;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
}
