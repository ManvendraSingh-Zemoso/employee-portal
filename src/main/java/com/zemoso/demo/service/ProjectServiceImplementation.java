package com.zemoso.demo.service;

import com.zemoso.demo.model.Project;
import com.zemoso.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImplementation implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllEmployeeProjects(){
        return (List<Project>) projectRepository.findAll();
    }
}
