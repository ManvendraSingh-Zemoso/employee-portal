package com.zemoso.demo.service;

import com.zemoso.demo.model.EmployeeDepartment;
import com.zemoso.demo.model.EmployeeLocation;
import com.zemoso.demo.repository.EmployeeLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeLocationServiceImplementation implements EmployeeLocationService {

    @Autowired
    private EmployeeLocationRepository employeeLocationRepository;

    public List<EmployeeLocation> getAllEmployeeLocations(){
        return (List<EmployeeLocation>)employeeLocationRepository.findAll();
    }
}
