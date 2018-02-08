package com.zemoso.demo.utils;

import com.zemoso.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Class to convert map to employee type and vice-versa
 */
@Component
public class EmployeeMapper {

    /**
     * Method to convert map to Employee type
     * @param map
     * @return
     */
    public Employee mapToEmployee(Map<String,Object> map){
        Employee employee = new Employee();
        employee.setFirstName((String) map.get(Constant.FIRSTNAME));
        employee.setMiddleName((String)map.get(Constant.MIDDLENAME));
        employee.setLastName((String)map.get(Constant.LASTNAME));
        employee.setEmailId((String)map.get(Constant.EMAIL_ID));
        employee.setPhoneNo((String)map.get(Constant.PHONE_NO));
        employee.setRole((String)map.get(Constant.ROLE));
        employee.setLocation((String)map.get(Constant.LOCATION));
        employee.setJoinDate((String)map.get(Constant.JOIN_DATE));
        employee.setPicture((String)map.get(Constant.PICTURE));
        employee.setBio((String)map.get(Constant.BIO));
        employee.setSkills(String.join(",",(ArrayList)map.get(Constant.SKILLS)));
        employee.setDepartment((String)map.get(Constant.DEPARTMENT));
        employee.setProject((String)map.get(Constant.PROJECT));
        employee.setReportEmployee((String)map.get(Constant.REPORT_EMPLOYEE));
        return employee;
    }

    /**
     * Method to Convert Employee to map type
     * @param employee
     * @return
     */
    public Map<String,Object> employeeToMap(Employee employee){
        Map<String,Object> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(employee.getId()));
        map.put(Constant.FIRSTNAME,employee.getFirstName());
        map.put(Constant.MIDDLENAME,employee.getMiddleName());
        map.put(Constant.LASTNAME,employee.getLastName());
        map.put(Constant.EMAIL_ID,employee.getEmailId());
        map.put(Constant.PHONE_NO,employee.getPhoneNo());
        map.put(Constant.ROLE,employee.getRole());
        map.put(Constant.LOCATION,employee.getLocation());
        map.put(Constant.JOIN_DATE,employee.getJoinDate());
        map.put(Constant.PICTURE,employee.getPicture());
        map.put(Constant.BIO,employee.getBio());
        if(employee.getSkills()!=null){
            map.put(Constant.SKILLS,employee.getSkills().split(","));
        }
        map.put(Constant.DEPARTMENT,employee.getDepartment());
        map.put(Constant.PROJECT,employee.getProject());
        map.put(Constant.REPORT_EMPLOYEE,employee.getReportEmployee());
        return map;
    }

    /**
     * method to set employee
     * @param employee
     * @param updateEmployee
     * @return
     */
    public Employee setUpdateEmployee(Map<String,Object> employee,Employee updateEmployee){
        updateEmployee.setFirstName((String) employee.get(Constant.FIRSTNAME));
        updateEmployee.setMiddleName((String)employee.get(Constant.MIDDLENAME));
        updateEmployee.setLastName((String)employee.get(Constant.LASTNAME));
        updateEmployee.setEmailId((String)employee.get(Constant.EMAIL_ID));
        updateEmployee.setPhoneNo((String)employee.get(Constant.PHONE_NO));
        updateEmployee.setRole((String)employee.get(Constant.ROLE));
        updateEmployee.setLocation((String)employee.get(Constant.LOCATION));
        updateEmployee.setJoinDate((String)employee.get(Constant.JOIN_DATE));
        updateEmployee.setPicture((String)employee.get(Constant.PICTURE));
        updateEmployee.setBio((String)employee.get(Constant.BIO));
        updateEmployee.setSkills(String.join(",",(ArrayList)employee.get(Constant.SKILLS)));
        updateEmployee.setDepartment((String)employee.get(Constant.DEPARTMENT));
        updateEmployee.setProject((String)employee.get(Constant.PROJECT));
        updateEmployee.setReportEmployee((String)employee.get(Constant.REPORT_EMPLOYEE));
        return updateEmployee;
    }
}
