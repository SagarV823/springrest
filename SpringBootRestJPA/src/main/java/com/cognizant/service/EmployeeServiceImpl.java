package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	static List<Employee> empList=null;
	static{
		empList=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Sagar");
		e1.setEmpSalary(35000);
		e1.setEmpDesignation("PAT");
		
		Employee e2=new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Sagar 2");
		e2.setEmpSalary(35000);
		e2.setEmpDesignation("PAT 2");
		
		Employee e3=new Employee();
		e3.setEmpId(102);
		e3.setEmpName("Sagar 3");
		e3.setEmpSalary(35000);
		e3.setEmpDesignation("PAT 3");
				
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
	}
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		for(Employee emp:empList){
			if(emp.getEmpId()==empId){
				employee=emp;
			}
		}
		return employee;
	}

	@Override
	public boolean persistEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=getEmployee(employee.getEmpId());
		if(employee.getEmpId()==emp.getEmpId()){
			return false;
		}
		else
		{
			return empList.add(employee);
		}
	}

}
