package com.week2.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.week2.datajpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    List<Employee> findByDepartmentAndSalaryLessThan(String department, double salary);

    Employee findFirstByOrderBySalaryDesc();
    
    @Query(value = "SELECT * FROM employee ORDER BY salary DESC LIMIT 1", 
    	       nativeQuery = true)
    	Employee findHighestSalaryEmployee();
}
