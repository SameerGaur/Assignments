package com.springRestQ5.Q5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRestQ5.Q5.model.Employee;
import com.springRestQ5.Q5.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public List<Employee>getAllEmployees()
	{
		List<Employee> emp=new ArrayList<>();
		empRepo.findAll().forEach(emp::add);
		return emp;
	}

	public Employee getEmployee(Long id) {
		return empRepo.findOne(id);
	}

	public void addEmployee(Employee emp) {
		
		empRepo.save(emp);
	}

	public void updateEmployee(Long id, Employee emp) {
		
		empRepo.save(emp);
	}

	public void deleteEmployee(Long id, Employee emp) {
		
		empRepo.delete(id);
		
	}

}
