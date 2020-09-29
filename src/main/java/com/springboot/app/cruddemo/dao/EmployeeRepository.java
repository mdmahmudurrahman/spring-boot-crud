package com.springboot.app.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
