package com.springRest.Q9.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.Q9.model.Employee;
import com.springRest.Q9.repository.EmployeeRepository;



@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee>getAllEmployees()
	{
		List<Employee> emp=new ArrayList<>();
		empRepo.findAll().forEach(emp::add);
		return emp;
	}

	public Employee getEmployee(Long id) {
		return empRepo.findById(id).get();
	}

	public void addEmployee(Employee emp) {
		
		empRepo.save(emp);
	}

	public void updateEmployee(Long id, Employee emp) {
		
		empRepo.save(emp);
	}

	public void deleteEmployee(Long id, Employee emp) {
		
		empRepo.deleteById(id);
		
	}
}