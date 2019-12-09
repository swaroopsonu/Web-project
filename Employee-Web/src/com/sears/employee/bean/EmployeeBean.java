package com.sears.employee.bean;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
    private String empId;
	private String name;
	private int age;
	private String gender;
	private String isFTE;
	private int salary;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String isFTE() {
		return isFTE;
	}
	public void setFTE(String isFTE) {
		this.isFTE = isFTE;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
