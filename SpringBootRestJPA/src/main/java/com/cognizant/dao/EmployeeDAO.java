package com.cognizant.dao;

import java.util.List;

import com.cognizant.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int empId);
	public boolean persistEmployee(Employee employee);
	public boolean updateEmployeeSalaryById(int empId,double newSalary);
}
