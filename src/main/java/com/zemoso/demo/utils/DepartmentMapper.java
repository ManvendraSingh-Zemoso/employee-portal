package com.zemoso.demo.utils;

import com.zemoso.demo.model.Department;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * class to convert department to map type
 */
@Component
public class DepartmentMapper {

    /**
     * Method to convert department to map type
     * @param department
     * @return
     */
    public Map<String,String> departmentToMap(Department department){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(department.getId()));
        map.put(Constant.NAME,department.getName());
        map.put(Constant.DESCRIPTION,department.getDescription());
        return map;
    }
}
