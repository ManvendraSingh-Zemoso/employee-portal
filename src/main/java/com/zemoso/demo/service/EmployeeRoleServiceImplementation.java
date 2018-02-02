package com.zemoso.demo.service;

import com.zemoso.demo.model.EmployeeRole;
import com.zemoso.demo.repository.EmployeeProjectRepository;
import com.zemoso.demo.repository.EmployeeRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRoleServiceImplementation implements EmployeeRoleService {

    @Autowired
    private EmployeeRoleRepository employeeRoleRepository;

    public List<EmployeeRole> getAllEmployeeRoles(){
        return (List<EmployeeRole>)employeeRoleRepository.findAll();
    }
}
