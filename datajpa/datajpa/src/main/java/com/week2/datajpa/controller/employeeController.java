package com.week2.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.week2.datajpa.entity.Employee;
import com.week2.datajpa.service.employeeService;

@RestController
@RequestMapping("/api/v1")
public class employeeController {

	@Autowired
	private employeeService empservice;
	
	@GetMapping("/employees")
	public List<Employee> getEmp(){
		return empservice.getAllEmp();
	}
	
	@PostMapping("/employees")
	public String addEmp(@RequestBody Employee emp) {
		return empservice.addemp(emp);
	}
	
	@PutMapping("/employees/{id}")
	public String updateEmp(@PathVariable int id,@RequestBody Employee emp) {
		return empservice.updateEmployee(id, emp);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteemp(@PathVariable int id){
		empservice.deleteEmp(id);
		return ResponseEntity.status(200).body("deleted emp successfully..");
	}
	
	@GetMapping("/employees/name/{name}")
	public List<Employee> findByName(@PathVariable String name){
		return empservice.findByName(name);
	}
	
	@GetMapping("/employees/highest-salary")
	public Employee getHighestSalararyEmployee() {
		return empservice.getHighestSalararyEmployee();
	}
	
//	@GetMapping("/employees")
//	public List<Employee> findByDeptAndSaralyLessThan(@RequestBody String debt,@RequestBody Double salary){
//		return empservice.findByDeptAndSaralyLessThan(debt, salary);
//	}
	
//	@GetMapping("/employees")
//	public Employee FindFirstByOrderBySalaryDesc() {
//		return empservice.FindFirstByOrderBySalaryDesc();
//	}
}
