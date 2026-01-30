package com.example.restAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.restAPI.Service.EmpProducer;
import com.example.restAPI.Service.EmployeeService;
import com.example.restAPI.dto.Employee;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

//CRUD API for employees

	 @Autowired
	    private EmployeeService empservice;

	 private EmpProducer producer;
		
		public EmployeeController(EmpProducer producer) {
			this.producer=producer;
		}
		
		@PostMapping("/orders")
		public String createOrder(@RequestBody String OrderStatus)
		{
			producer.sendOrderEvent(OrderStatus);
			return "Order event sent to kafka";
		}
	    // Get all employees
	    @GetMapping
	    public List<String> getEmployees() {
	        return empservice.getAllEmployees();
	    }

	    // Add employee
	    @PostMapping
	    public String addEmp(@RequestBody String name) {
	        return empservice.addEmp(name);
	    }

	    // Update employee
	    @PutMapping("/{index}")
	    public String updateEmp(@PathVariable int index,
	                            @RequestBody String emp) {
	        return empservice.updateEmp(index, emp);
	    }

	    // Delete employee
	    @DeleteMapping("/{index}")
	    public String removeEmp(@PathVariable int index) {
	        return empservice.removeEmp(index);
	    }

	   
	@GetMapping("/highest-salary")
	//@CircuitBreaker(name="employeeServiceCB",fallbackMethod="getHighestSalaryEmployeeFallback")
	public Employee getHighestSalararyEmployee() {
		return empservice.getHighestSalararyEmployee();
	}
	
	
	
//	public Employee getHighestSalaryEmployeeFallback(Throwable t) {
//		System.out.println("Fallback executed: "+t.getMessage());
//		return new Employee();
//	}
}
