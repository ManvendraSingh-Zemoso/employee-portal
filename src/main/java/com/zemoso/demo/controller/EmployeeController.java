package com.zemoso.demo.controller;

import com.zemoso.demo.model.Employee;
import com.zemoso.demo.service.EmployeeService;
import com.zemoso.demo.utils.Constant;
import com.zemoso.demo.utils.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public ResponseEntity <Map<String,Map<String,String>>> getEmployee(@PathVariable Long id){
        Employee employee = employeeService.getEmployee(id);
        Map<String,Map<String,String>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(employee));
        return ResponseEntity.ok().body(responseMap);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity <Map<String,Map<String,String>>> addEmployee(@RequestBody Map<String,Map<String,String>> map){
        Map<String,String> employee = map.get(Constant.EMPLOYEE);
        Employee newEmployee = employeeService.saveEmployee(employeeMapper.mapToEmployee(employee));
        Map<String,Map<String,String>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(newEmployee));
        return ResponseEntity.ok().body(responseMap);
    }

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity <Map<String,List<Map<String,String>>>> getAllEmployees(){
        List<Employee> employeeList = employeeService.getAllEmployees();
        List<Map<String,String>> response = new ArrayList<>();
        employeeList.forEach(item ->{
            Map<String,String> employee = employeeMapper.employeeToMap(item);
            response.add(employee);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("employees",response);
        return ResponseEntity.ok().body(responseMap);
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.PATCH)
    private ResponseEntity <Map<String,Map<String,String>>> updateEmployee(@RequestBody Map<String,Map<String,String>> map, @PathVariable Long id){
        Employee updateEmployee = employeeService.getEmployee(id);
        Map<String,String> employee = map.get(Constant.EMPLOYEE);
        updateEmployee.setFirstName(employee.get(Constant.FIRSTNAME));
        updateEmployee.setMiddleName(employee.get(Constant.MIDDLENAME));
        updateEmployee.setLastName(employee.get(Constant.LASTNAME));
        updateEmployee.setEmailId(employee.get(Constant.EMAIL_ID));
        updateEmployee.setPhoneNo(employee.get(Constant.PHONE_NO));
        updateEmployee.setRole(employee.get(Constant.ROLE));
        updateEmployee.setLocation(employee.get(Constant.LOCATION));
        updateEmployee.setJoinDate(employee.get(Constant.JOIN_DATE));
        updateEmployee.setPicture(employee.get(Constant.PICTURE));
        updateEmployee.setBio(employee.get(Constant.BIO));
        updateEmployee.setSkills(employee.get(Constant.SKILLS));
        updateEmployee.setDepartment(employee.get(Constant.DEPARTMENT));
        updateEmployee.setProject(employee.get(Constant.PROJECT));
        updateEmployee.setReportEmployee(employee.get(Constant.REPORT_EMPLOYEE));
        employeeService.saveEmployee(updateEmployee);
        Map<String,Map<String,String>> responseMap = new HashMap<>();
        responseMap.put(Constant.EMPLOYEE,employeeMapper.employeeToMap(updateEmployee));
        return ResponseEntity.ok().body(responseMap);
    }
}
