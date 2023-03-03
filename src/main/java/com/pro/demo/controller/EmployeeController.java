package com.pro.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pro.demo.entity.Employee;
import com.pro.demo.services.EmployeeServices;

@RestController
@RequestMapping("/emp-base")
public class EmployeeController {
	
	@Autowired
	EmployeeServices services;
	@PostMapping("/insert")
	public Employee createEmployee(@RequestBody Employee emp) {
	return services.createEmployee(emp);	
	}
	@GetMapping("/get-emp/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return services.getEmployee(id);
	}
	@PutMapping("/update-emp/{id}")
	public Employee updateEmployeeById(@PathVariable("id") int id,@RequestBody Employee emp ) {
		return services.updateEmployeeById(id,emp);
	}
	@DeleteMapping("/delete-emp/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id ) {
		System.out.println("Id is :: "+id );
		//return services.deleteEmployeeById(id);
	}
}
