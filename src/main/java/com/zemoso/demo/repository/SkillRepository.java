package com.zemoso.demo.repository;

import com.zemoso.demo.model.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends CrudRepository<Skill,Long>{
}
