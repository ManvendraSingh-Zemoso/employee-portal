package com.zemoso.demo.repository;

import com.zemoso.demo.model.EmployeeDepartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDepartmentRepository extends CrudRepository<EmployeeDepartment,Long> {
}
