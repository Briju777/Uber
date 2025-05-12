package com.uber.uberApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private Double rating;

    @OneToOne
    @JoinColumn(name ="user_id")
    private User user;

    private Boolean available;

    @Column(columnDefinition = "Geometry(Point, 4326")
    Point currentLocation;



}
