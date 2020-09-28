package com.springboot.app.cruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.cruddemo.dao.EmployeeDAO;
import com.springboot.app.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	private EmployeeDAO employeeDAO;
	
	//Quick and dirty: Inject Employee DAO
	@Autowired
	public EmployeeController(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll(); 
	}
}
