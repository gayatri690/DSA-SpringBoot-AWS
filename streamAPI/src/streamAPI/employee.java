package streamAPI;

import java.util.List;

public class employee {

	int id;
	String name;
	Double salary;
	String dept;
	Double exp;
	List<String> skills;
	
	public employee(int id, String name, Double salary, String dept, Double exp, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.exp = exp;
		this.skills = skills;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public employee() {
		
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getExp() {
		return exp;
	}
	public void setExp(Double exp) {
		this.exp = exp;
	}
	public employee(int id, String name, Double salary, String dept, Double exp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.exp = exp;
	}
	
	

}
