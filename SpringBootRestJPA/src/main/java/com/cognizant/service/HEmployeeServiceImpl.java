package com.cognizant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.dao.EmployeeDAO;
import com.cognizant.entity.Employee;

@Service("HEmployeeServiceImpl")
public class HEmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}

	
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(empId);
	}


	public boolean persistEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean updateEmployeeSalary(int empId, double newSalary) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
