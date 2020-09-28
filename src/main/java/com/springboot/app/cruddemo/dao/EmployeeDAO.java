package com.springboot.app.cruddemo.dao;

import java.util.List;

import com.springboot.app.cruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
}
