package com.zemoso.demo.repository;

import com.zemoso.demo.model.EmployeeLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeLocationRepository extends CrudRepository<EmployeeLocation,Long> {
}
