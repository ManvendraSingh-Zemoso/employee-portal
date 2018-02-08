package com.zemoso.demo.utils;

import com.zemoso.demo.model.Location;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * class to convert location to map type
 */
@Component
public class LocationMapper {
    /**
     *  Method to convert location to map type
     * @param location
     * @return
     */
    public Map<String,String> locationToMap(Location location){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(location.getId()));
        map.put(Constant.NAME,location.getName());
        map.put(Constant.DESCRIPTION,location.getDescription());
        return map;
    }
}
