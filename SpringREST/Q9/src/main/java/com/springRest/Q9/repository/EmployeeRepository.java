package com.springRest.Q9.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springRest.Q9.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	
	
}