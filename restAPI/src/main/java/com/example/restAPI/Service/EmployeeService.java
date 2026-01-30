package com.example.restAPI.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.restAPI.dto.Employee;


@Service
public class EmployeeService {

	//@Autowired
	//EmployeeController cnt;
	@Autowired
	private RestTemplate restTemplate;
	List<String> emp=new ArrayList<>(List.of("alice","jack","john"));
	public List<String> getAllEmployees(){
		return emp;
	}
	
	public String addEmp(String name) {
		emp.add(name);
		return "Employee "+name+" added successfully..";
	}
	
	public String updateEmp(int index,String name) {
		emp.set(index, name);
		return "Employee "+name+" updated successfully..";
	}
	
	public String removeEmp(int index) {
		emp.remove(index);
		return "Employee with id: "+index+" deleted successfully..";
	}

	public Employee getHighestSalararyEmployee() {
		return restTemplate.getForObject("http://localhost:8082/api/v1/employees/highest-salary",Employee.class);
		
	}
}
