package com.zemoso.demo.service;

import com.zemoso.demo.model.EmployeeDepartment;
import com.zemoso.demo.repository.EmployeeDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDepartmentServiceImplementation implements EmployeeDepartmentService {

    @Autowired
    private EmployeeDepartmentRepository employeeDepartmentRepository;

    public List<EmployeeDepartment> getAllEmployeeDepartments(){ return (List<EmployeeDepartment>)employeeDepartmentRepository.findAll();}
}
