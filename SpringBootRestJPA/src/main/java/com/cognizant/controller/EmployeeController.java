package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Employee;
import com.cognizant.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@GetMapping("employees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		List<Employee> empList=employeeService.getAllEmployees();
		ResponseEntity<List<Employee>> response=new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
		return response;
	}
	@GetMapping("getEmployeeById/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") int empId){
		Employee employee=employeeService.getEmployee(empId);
		ResponseEntity<Employee> response=new ResponseEntity<Employee>(employee,HttpStatus.OK);
		return response;
	}
	@PostMapping("persist")
	public ResponseEntity<Void> persistEmployee(@RequestBody Employee employee){
		boolean result=employeeService.persistEmployee(employee);
		if(result){
			ResponseEntity<Void> response=new ResponseEntity<Void>(HttpStatus.CREATED);
			return response;
		}else{
			ResponseEntity<Void> response=new ResponseEntity<Void>(HttpStatus.CONFLICT);
			return response;
		}
	}
}
