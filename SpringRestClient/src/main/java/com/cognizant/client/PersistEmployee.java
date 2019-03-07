package com.cognizant.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.cognizant.entity.Employee;

public class PersistEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEmpId(1001);
		employee.setEmpName("sdas");
		employee.setEmpSalary(213123);
		employee.setEmpDesignation("sdsddfsfds");
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Employee> requestEntity=new HttpEntity<Employee>(employee,headers);
		
		String url="http://localhost:8087/employee/persist";
		RestTemplate template=new RestTemplate();
		template.postForLocation(url, requestEntity);
	}

}
