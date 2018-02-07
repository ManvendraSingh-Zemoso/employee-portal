package com.zemoso.demo.controller;

import com.zemoso.demo.model.Skill;
import com.zemoso.demo.service.SkillService;
import com.zemoso.demo.utils.SkillMapper;
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
@RequestMapping(path = "/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @Autowired
    private SkillMapper skillMapper;

    @RequestMapping(method = RequestMethod.GET)
    private ResponseEntity<Map<String,List<Map<String,String>>>> getAllSkills(){
        List<Skill> skillList = skillService.getAllEmployeeSkills();
        List<Map<String,String>> response = new ArrayList<>();
        skillList.forEach(item ->{
            Map<String,String> skill = skillMapper.skillToMap(item);
            response.add(skill);
        });
        Map<String,List<Map<String,String>>> responseMap = new HashMap();
        responseMap.put("skills",response);
        return ResponseEntity.ok().body(responseMap);
    }
}
