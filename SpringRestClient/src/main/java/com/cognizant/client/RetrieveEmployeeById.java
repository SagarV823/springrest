package com.cognizant.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cognizant.entity.Employee;

public class RetrieveEmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
		RestTemplate template=new RestTemplate();
		String url="http://localhost:8087/employee/getEmployeeById/{empId}";
		ResponseEntity<Employee> response=template.exchange(url, HttpMethod.GET,requestEntity,Employee.class,101);
		Employee employee=response.getBody();
		System.out.println(employee);
	}

}
