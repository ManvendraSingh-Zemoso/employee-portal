package com.zemoso.demo.controller;

import com.zemoso.demo.model.Location;
import com.zemoso.demo.service.LocationService;
import com.zemoso.demo.utils.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationMapper locationMapper;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Map<String,List<Map<String,String>>>> getAllLocations(){
        List<Location> locationList = locationService.getAllEmployeeLocations();
        List<Map<String,String>> response = new ArrayList<>();
        locationList.forEach(item ->{
            Map<String,String> location = locationMapper.locationToMap(item);
            response.add(location);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("locations",response);
        return ResponseEntity.ok().body(responseMap);
    }
}
