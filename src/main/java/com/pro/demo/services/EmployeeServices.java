package com.pro.demo.services;

import com.pro.demo.entity.Employee;

public interface EmployeeServices {

	Employee createEmployee(Employee emp);

	Employee getEmployee(int id);

	Employee updateEmployeeById(int id, Employee emp);

	void deleteEmployeeById(int id);




	



}
