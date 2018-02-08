package com.zemoso.demo.controller;

import com.zemoso.demo.model.Employee;
import com.zemoso.demo.service.EmployeeService;
import com.zemoso.demo.utils.Constant;
import com.zemoso.demo.utils.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to wright rest api calls for employee
 */
@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * Method to get Employee having particular id
     * @param id
     * @return
     */
    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public ResponseEntity <Map<String,Map<String,Object>>> getEmployee(@PathVariable Long id){
        Employee employee = employeeService.getEmployee(id);
        Map<String,Map<String,Object>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(employee));
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }

    /**
     * Method to save/add a new employee
     * @param map
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity <Map<String,Map<String,Object>>> addEmployee(@RequestBody Map<String,Map<String,Object>> map){
        Map<String,Object> employee = map.get(Constant.EMPLOYEE);
        Employee newEmployee = employeeService.saveEmployee(employeeMapper.mapToEmployee(employee));
        Map<String,Map<String,Object>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(newEmployee));
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }

    /**
     * Method to get all employees
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity <Map<String,List<Map<String,Object>>>> getAllEmployees(){
        List<Employee> employeeList = employeeService.getAllEmployees();
        List<Map<String,Object>> response = new ArrayList<>();
        employeeList.forEach(item ->{
            Map<String,Object> employee = employeeMapper.employeeToMap(item);
            response.add(employee);
        });
        Map<String,List<Map<String,Object>>> responseMap = new HashMap();
        responseMap.put("employees",response);
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }

    /**
     * Method to update an employee
     * @param map
     * @param id
     * @return
     */
    @RequestMapping(path = "/{id}",method = RequestMethod.PUT)
    private ResponseEntity <Map<String,Map<String,Object>>> updateEmployee(@RequestBody Map<String,Map<String,Object>> map, @PathVariable Long id){
        Employee updateEmployee = employeeService.getEmployee(id);
        Map<String,Object> employee = map.get(Constant.EMPLOYEE);
        updateEmployee = employeeMapper.setUpdateEmployee(employee,updateEmployee);
        employeeService.saveEmployee(updateEmployee);
        Map<String,Map<String,Object>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(updateEmployee));
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }
}
