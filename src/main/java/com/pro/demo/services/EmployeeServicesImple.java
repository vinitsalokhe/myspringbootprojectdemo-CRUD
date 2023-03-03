package com.pro.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.demo.dao.EmployeeDao;
import com.pro.demo.entity.Employee;
//import com.pro.wing.entity.Student;

@Service
public class EmployeeServicesImple implements EmployeeServices{
	
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee createEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee getEmployee(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Employee updateEmployeeById(int id, Employee emp) {
	 Employee e = dao.findById(id).get();
		e.setName(emp.getName());
		e.setCity(emp.getCity());
		e.setSalary(emp.getSalary());
		dao.save(e);
		return e;
	}

	@Override
	public void deleteEmployeeById(int id) {
		System.out.println("Enter into deleteEmployeeById :: ");
		dao.deleteById(id);
	}
	
	
	
	
}
