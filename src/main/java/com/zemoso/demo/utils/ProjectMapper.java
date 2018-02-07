package com.zemoso.demo.utils;

import com.zemoso.demo.model.Project;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProjectMapper {

    public Map<String,String> projectToMap(Project project){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(project.getId()));
        map.put(Constant.NAME,project.getName());
        map.put(Constant.DESCRIPTION,project.getDescription());
        return map;
    }
}
