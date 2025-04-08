package com.EmployeeApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee 
{
	@Id
	 
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
	private long id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "department")
	private String department;
	
	public Employee() {};
	public Employee(String name, String dept) {
		this.name=name;
		this.department=department;
	}
	
	
	public long getId() { return id; }
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name; }
	
	public void setName(String name) {
		this.name = name; }
	
	public String getDepartment() {
		return department; }
	
	public void setDepartment(String dept) {
		this.department = dept;
	}
	
}
