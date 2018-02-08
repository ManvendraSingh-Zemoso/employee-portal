package com.zemoso.demo.controller;

import com.zemoso.demo.model.Role;
import com.zemoso.demo.service.RoleService;
import com.zemoso.demo.utils.RoleMapper;
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
 * Class to wright rest api calls for roles
 */
@Controller
@RequestMapping(path = "/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleMapper roleMapper;

    /**
     * Method to get the list of roles
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Map<String,List<Map<String,String>>>> getAllRoles(){
        List<Role> roleList = roleService.getAllEmployeeRoles();
        List<Map<String,String>> response = new ArrayList<>();
        roleList.forEach(item ->{
            Map<String,String> role = roleMapper.roleToMap(item);
            response.add(role);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("roles",response);
        return ResponseEntity.status(HttpStatus.OK).body(responseMap);
    }
}
