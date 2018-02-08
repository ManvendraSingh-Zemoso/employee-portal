package com.zemoso.demo.service;

import com.zemoso.demo.model.Skill;
import com.zemoso.demo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImplementation implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    /**
     * Method to get list of skills
     * @return
     */
    public List<Skill> getAllEmployeeSkills(){
        return (List<Skill>) skillRepository.findAll();
    }
}
