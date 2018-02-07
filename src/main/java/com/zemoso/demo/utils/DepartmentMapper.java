package com.zemoso.demo.utils;

import com.zemoso.demo.model.Department;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DepartmentMapper {

    public Map<String,String> departmentToMap(Department department){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(department.getId()));
        map.put(Constant.NAME,department.getName());
        map.put(Constant.DESCRIPTION,department.getDescription());
        return map;
    }
}
