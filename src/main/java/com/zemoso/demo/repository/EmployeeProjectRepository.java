package com.zemoso.demo.repository;

import com.zemoso.demo.model.EmployeeProject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeProjectRepository extends CrudRepository<EmployeeProject,Long> {
}
