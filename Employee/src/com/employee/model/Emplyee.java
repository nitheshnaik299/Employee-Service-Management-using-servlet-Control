package com.employee.model;

import java.time.LocalDate;

public class Emplyee {
	String empId;
	String empName;
	LocalDate dob;
	float basicsalary;
	
   public Emplyee() {
	   super();
		
	}
	
	public Emplyee(String empId, String empName, LocalDate dob, float basicsalary) {
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.basicsalary = basicsalary;
	}
	//setters
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}
	//getters
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public float getBasicsalary() {
		return basicsalary;
	}
	

}
