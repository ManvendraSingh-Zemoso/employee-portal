package com.zemoso.demo.utils;

import com.zemoso.demo.model.Project;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * class to convert project to map type
 */
@Component
public class ProjectMapper {

    /**
     *  Method to convert project to map type
     * @param project
     * @return
     */
    public Map<String,String> projectToMap(Project project){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(project.getId()));
        map.put(Constant.NAME,project.getName());
        map.put(Constant.DESCRIPTION,project.getDescription());
        return map;
    }
}
