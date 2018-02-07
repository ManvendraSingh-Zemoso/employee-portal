package com.zemoso.demo.service;

import com.zemoso.demo.model.Department;
import com.zemoso.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllEmployeeDepartments(){ return (List<Department>) departmentRepository.findAll();}
}
