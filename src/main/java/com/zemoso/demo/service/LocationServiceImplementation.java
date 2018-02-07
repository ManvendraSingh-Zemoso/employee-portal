package com.zemoso.demo.service;

import com.zemoso.demo.model.Location;
import com.zemoso.demo.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllEmployeeLocations(){
        return (List<Location>) locationRepository.findAll();
    }
}
