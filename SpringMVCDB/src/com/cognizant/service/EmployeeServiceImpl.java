package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EmployeeDAO;
import com.cognizant.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired@Qualifier("jDBCEmployeeDAOImpl")
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}
		
	
	
}
