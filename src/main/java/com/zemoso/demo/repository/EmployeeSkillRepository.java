package com.zemoso.demo.repository;

import com.zemoso.demo.model.EmployeeSkill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSkillRepository extends CrudRepository<EmployeeSkill,Long>{
}
