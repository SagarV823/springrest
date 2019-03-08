package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.Employee;

public interface EmployeeService  {

	public List<Employee> getAllEmployees();
	public Employee getEmployee(int empId);
	public boolean persistEmployee(Employee employee);
	public boolean updateEmployeeSalary(int empId,double newSalary);
	public boolean deleteEmployee(int empId);
	
}
