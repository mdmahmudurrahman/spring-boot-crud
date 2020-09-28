package com.springboot.app.cruddemo.service;

import java.util.List;

import com.springboot.app.cruddemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
