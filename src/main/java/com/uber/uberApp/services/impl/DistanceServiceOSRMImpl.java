package com.uber.uberApp.services.impl;

import com.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        // Call the third party OSRM to fetch the distance
        return 0;
    }
}
