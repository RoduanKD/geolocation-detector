package com.anas.geolocation.web.controllers;

import com.anas.geolocation.data.models.Location;
import com.anas.geolocation.services.LocationService;
import com.anas.geolocation.web.requests.StoreLocationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/locations")
public class LocationController {
    LocationService locationService;

    @PostMapping
    public Location store(@RequestBody StoreLocationRequest request) {
        return locationService.store(
                Location
                        .builder()
                        .userId(request.getUser_id())
                        .caseId(request.getCase_id())
                        .lat(request.getLat())
                        .lon(request.getLon())
                        .build()
        );
    }
}
