package com.cognizant.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.cognizant.entity.Employee;

public class RetrieveAllEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String url="http://localhost:8087/employee/employees";
		RestTemplate template=new RestTemplate();
		
		HttpEntity<String> requestEntity=new HttpEntity<String>(headers);
		ResponseEntity<Employee[]> response=template.exchange(url,HttpMethod.GET, requestEntity,Employee[].class);
		Employee employees[]=response.getBody();
		for(Employee employee:employees){
			System.out.println(employee);
		}
	}

}
