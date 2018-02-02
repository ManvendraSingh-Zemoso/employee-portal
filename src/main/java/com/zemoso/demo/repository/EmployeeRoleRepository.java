package com.zemoso.demo.repository;

import com.zemoso.demo.model.EmployeeRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRoleRepository extends CrudRepository<EmployeeRole,Long> {
}
