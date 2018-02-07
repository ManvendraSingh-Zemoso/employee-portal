package com.zemoso.demo.controller;

import com.zemoso.demo.model.Project;
import com.zemoso.demo.service.ProjectService;
import com.zemoso.demo.utils.ProjectMapper;
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
@RequestMapping(path = "/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectMapper projectMapper;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Map<String,List<Map<String,String>>>> getAllProjects(){
        List<Project> projectList = projectService.getAllEmployeeProjects();
        List<Map<String,String>> response = new ArrayList<>();
        projectList.forEach(item ->{
            Map<String,String> project = projectMapper.projectToMap(item);
            response.add(project);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("projects",response);
        return ResponseEntity.ok().body(responseMap);
    }
}
