package com.week2.datajpa.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="name",nullable=false)
	String name;
	@Column(length=50,nullable=false)
	String department;
	@Column(nullable=false)
	double salary;
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Profile profile;
	
	
	@OneToMany(mappedBy="emp",cascade=CascadeType.ALL)
	@JsonManagedReference
	private List<Address> add;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="emp_project",
			joinColumns=@JoinColumn(name="employee_id"),
			inverseJoinColumns=@JoinColumn(name="project_id")
			)
	List<Project> projects;
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public List<Address> getAdd() {
		return add;
	}
	public void setAdd(List<Address> add) {
		this.add = add;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile Profile) {
		this.profile = Profile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
