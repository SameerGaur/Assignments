package com.springRestQ5.Q5.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRestQ5.Q5.model.Employee;
import com.springRestQ5.Q5.service.EmployeeService;

import org.springframework.http.MediaType;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping(value="/findAll")
	public List<Employee> getAllOrders(){
		return empService.getAllEmployees();
	}
	
	@GetMapping("getEmp/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return empService.getEmployee(id);
	}

	@PostMapping(value="/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOrder(@RequestBody Employee emp) {
		empService.addEmployee(emp);
	}
	
	@PutMapping("/update/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable Long id) {
		empService.updateEmployee(id,emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmlpoyee(@RequestBody Employee emp, @PathVariable Long id) {
		empService.deleteEmployee(id,emp);
	}
}
