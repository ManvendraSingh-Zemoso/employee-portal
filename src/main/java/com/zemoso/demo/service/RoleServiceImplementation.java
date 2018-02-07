package com.zemoso.demo.service;

import com.zemoso.demo.model.Role;
import com.zemoso.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImplementation implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllEmployeeRoles(){
        return (List<Role>) roleRepository.findAll();
    }
}
