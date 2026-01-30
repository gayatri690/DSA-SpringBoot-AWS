package com.week2.datajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="profiles")
public class Profile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String address;
	private String email;
	private String bloodGroup;
	
	@OneToOne
    @JoinColumn(name = "employee_id", unique = true)
    private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Employee getEmp() {
		return employee;
	}

	public void setEmp(Employee emp) {
		this.employee = emp;
	}
	
	
	
}
