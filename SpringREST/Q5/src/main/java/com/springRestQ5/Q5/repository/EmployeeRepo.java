package com.springRestQ5.Q5.repository;

import org.springframework.stereotype.Repository;

import com.springRestQ5.Q5.model.Employee;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

}
