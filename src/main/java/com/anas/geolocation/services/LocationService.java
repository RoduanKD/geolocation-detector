package com.anas.geolocation.services;

import com.anas.geolocation.data.models.Location;
import com.anas.geolocation.data.repositories.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LocationService {
    LocationRepository locationRepository;
    public Location store(Location location) {
        return locationRepository.save(location);
    }
}
