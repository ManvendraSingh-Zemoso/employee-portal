package com.zemoso.demo.utils;

import com.zemoso.demo.model.Role;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * class to convert role to map type
 */
@Component
public class RoleMapper {

    /**
     *  Method to convert role to map type
     * @param role
     * @return
     */
    public Map<String,String> roleToMap(Role role){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(role.getId()));
        map.put(Constant.NAME,role.getName());
        map.put(Constant.DESCRIPTION,role.getDescription());
        return map;
    }
}
