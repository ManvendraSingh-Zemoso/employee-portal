package com.zemoso.demo.service;

import com.zemoso.demo.model.EmployeeSkill;
import com.zemoso.demo.repository.EmployeeSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillServiceImplementation implements EmployeeSkillService{

    @Autowired
    private EmployeeSkillRepository employeeSkillRepository;

    public List<EmployeeSkill> getAllEmployeeSkills(){
        return (List<EmployeeSkill>)employeeSkillRepository.findAll();
    }
}
