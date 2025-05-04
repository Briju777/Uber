package com.uber.uberApp.entities;

import com.uber.uberApp.entities.enums.RideStatus;
import jakarta.persistence.*;

@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
}
