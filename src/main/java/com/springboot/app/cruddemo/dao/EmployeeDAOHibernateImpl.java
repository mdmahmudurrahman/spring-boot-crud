package com.springboot.app.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	private EntityManager entityManager;
	
	// Set up construction injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager thEntityManager) {
		entityManager = thEntityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// Get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		return employees;
	}
}
