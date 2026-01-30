package com.week2.datajpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.week2.datajpa.entity.Address;
import com.week2.datajpa.entity.Employee;
import com.week2.datajpa.repository.EmployeeRepository;

@Service
public class employeeService {

	private EmployeeRepository emprepo;
	public employeeService(EmployeeRepository emprepo) {
		this.emprepo=emprepo;
	}
	
	public List<Employee> getAllEmp(){
		return emprepo.findAll();
	}
	
	public String addemp(Employee emp) {
//		emprepo.save(emp);
//		return "emp added successfully";
		if (emp.getProfile() != null) {
            emp.getProfile().setEmp(emp); // 🔑 MOST IMPORTANT LINE
        }

		for(Address add:emp.getAdd()) {
			add.setEmp(emp);
		}
		emprepo.save(emp);
        return "Employee saved successfully";
	}
	public String updateEmployee(int id,Employee emp) {
		if(emprepo.existsById(id)) {
		Employee existemp=emprepo.findById(id).get();
		existemp.setName(emp.getName());
		existemp.setDepartment(emp.getDepartment());
		existemp.setSalary(emp.getSalary());
		emprepo.save(existemp);
		return "Emp updated successfully";
		}
		else
			return "emp not found";
	}
	
	public String deleteEmp(int id) {
		if(emprepo.existsById(id)) {
			emprepo.deleteById(id);
			return "emp deleted successfully";
		}
		else {
			return "emp not found";
		}
	}
	
	public List<Employee> findByName(String name){
		return emprepo.findByName(name);
	}
	
	public List<Employee> findByDeptAndSaralyLessThan(String dept,Double salary){
		return emprepo.findByDepartmentAndSalaryLessThan(dept, salary);
	}
	
	public Employee FindFirstByOrderBySalaryDesc() {
		return emprepo.findFirstByOrderBySalaryDesc();
	}
	
	public Employee getHighestSalararyEmployee() {
        return emprepo.findHighestSalaryEmployee();
    }
}
