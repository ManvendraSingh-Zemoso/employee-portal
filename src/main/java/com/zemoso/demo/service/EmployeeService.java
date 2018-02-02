package com.zemoso.demo.service;

import com.zemoso.demo.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long id);
}
