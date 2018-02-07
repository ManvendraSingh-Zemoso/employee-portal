package com.zemoso.demo.utils;

import com.zemoso.demo.model.Employee;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeMapper {

    public Employee mapToEmployee(Map<String,String> map){
        Employee employee = new Employee();
        employee.setFirstName(map.get(Constant.FIRSTNAME));
        employee.setMiddleName(map.get(Constant.MIDDLENAME));
        employee.setLastName(map.get(Constant.LASTNAME));
        employee.setEmailId(map.get(Constant.EMAIL_ID));
        employee.setPhoneNo(map.get(Constant.PHONE_NO));
        employee.setRole(map.get(Constant.ROLE));
        employee.setLocation(map.get(Constant.LOCATION));
        employee.setJoinDate(map.get(Constant.JOIN_DATE));
        employee.setPicture(map.get(Constant.PICTURE));
        employee.setBio(map.get(Constant.BIO));
        employee.setSkills(map.get(Constant.SKILLS));
        employee.setDepartment(map.get(Constant.DEPARTMENT));
        employee.setProject(map.get(Constant.PROJECT));
        employee.setReportEmployee(map.get(Constant.REPORT_EMPLOYEE));
        return employee;
    }

    public Map<String,String> employeeToMap(Employee employee){
        Map<String,String> map = new HashMap<>();
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
        map.put(Constant.SKILLS,employee.getSkills());
        map.put(Constant.DEPARTMENT,employee.getDepartment());
        map.put(Constant.PROJECT,employee.getProject());
        map.put(Constant.REPORT_EMPLOYEE,employee.getReportEmployee());
        return map;
    }

}
