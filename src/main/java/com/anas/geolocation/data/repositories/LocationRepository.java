package com.anas.geolocation.data.repositories;

import com.anas.geolocation.data.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LocationRepository extends JpaRepository<Location, Long>, JpaSpecificationExecutor<Location> {
}