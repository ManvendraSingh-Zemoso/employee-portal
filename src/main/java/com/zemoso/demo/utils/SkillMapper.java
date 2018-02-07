package com.zemoso.demo.utils;

import com.zemoso.demo.model.Skill;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SkillMapper {
    public Map<String,String> skillToMap(Skill skill){
        Map<String,String> map = new HashMap<>();
        map.put(Constant.ID,Long.toString(skill.getId()));
        map.put(Constant.NAME,skill.getName());
        map.put(Constant.DESCRIPTION,skill.getDescription());
        return map;
    }
}
