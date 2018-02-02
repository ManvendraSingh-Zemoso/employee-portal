package com.zemoso.demo.service;

import com.zemoso.demo.model.EmployeeProject;
import com.zemoso.demo.repository.EmployeeProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectServiceImplementation implements EmployeeProjectService {

    @Autowired
    private EmployeeProjectRepository employeeProjectRepository;

    public List<EmployeeProject> getAllEmployeeProjects(){
        return (List<EmployeeProject>)employeeProjectRepository.findAll();
    }
}
