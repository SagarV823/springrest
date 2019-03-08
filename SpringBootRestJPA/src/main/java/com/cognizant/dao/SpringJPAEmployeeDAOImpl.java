package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.Employee;
@Repository
@Transactional
	public class SpringJPAEmployeeDAOImpl implements EmployeeDAO{
	
	@PersistenceContext	
	private EntityManager manager;
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Query query=manager.createQuery("select o from Employee o");
		List<Employee> empList=query.getResultList();
		return empList;
	}
	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Query query=manager.createQuery("select o from Employee o where o.empId=?1");
		query.setParameter(1, empId);
		Employee employee=(Employee)query.getSingleResult();
		return employee;
	}
	@Override
	public boolean persistEmployee(Employee employee) {
		// TODO Auto-generated method stub
		manager.persist(employee);
		Employee emp=getEmployeeById(employee.getEmpId());
		if(emp.getEmpId()==employee.getEmpId())
			return true;
		return false;
	}
	@Override
	public boolean updateEmployeeSalaryById(int empId, double newSalary) {
		// TODO Auto-generated method stub
		Query query=manager.createNamedQuery("updateEmployeeSalary");
		query.setParameter(1, newSalary);
		query.setParameter(2, empId);
		int rows=query.executeUpdate();
		if(rows>0)
			return true;
		else
			return false;
	}

}
