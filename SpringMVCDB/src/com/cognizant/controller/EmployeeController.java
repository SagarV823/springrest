package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.Employee;
import com.cognizant.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="getEmployee.htm",method=RequestMethod.GET)
	public ModelAndView getAllEmployee(){
		ModelAndView mv=new ModelAndView();
		List<Employee> empList=employeeService.getAllEmployees();
		mv.addObject("empList",empList);
		mv.setViewName("empDetails");
		return mv;
	}
}
