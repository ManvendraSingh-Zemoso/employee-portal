package com.zemoso.demo.controller;

import com.zemoso.demo.model.Department;
import com.zemoso.demo.service.DepartmentService;
import com.zemoso.demo.utils.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class to wright rest api calls for department
 */
@Controller
@RequestMapping(path = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * Method to get the list of departments
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Map<String,List<Map<String,String>>>> getAllDepartments(){
        List<Department> departmentList = departmentService.getAllEmployeeDepartments();
        List<Map<String,String>> response = new ArrayList<>();
        departmentList.forEach(item ->{
            Map<String,String> department = departmentMapper.departmentToMap(item);
            response.add(department);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("departments",response);
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }
}
