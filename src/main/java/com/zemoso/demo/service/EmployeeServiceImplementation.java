package com.zemoso.demo.service;

import com.zemoso.demo.model.Employee;
import com.zemoso.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){ return (List<Employee>)employeeRepository.findAll();}

    public Employee getEmployee(Long id){return employeeRepository.findOne(id);}
}
