package com.pro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pro.demo.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	

}
