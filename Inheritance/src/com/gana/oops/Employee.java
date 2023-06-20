package com.gana.oops;

public class Employee extends Person1{
	
	//State
	private String title;
	private String companyName;
	private String employeegrade;
	private String salary;
	//constructor
	public Employee(String name, String email, String phnNumber,
			String title,String companyName,String salary, String employeegrade) {
		super(name, email, phnNumber);
		this.title = title;
		this.companyName = companyName;
		this.employeegrade = employeegrade;
		this.salary = salary;
		
	}
	//behaviour
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployeeGrade() {
		return employeegrade;
	}
	public void setEmployeeGrade(String employeegrade) {
		this.employeegrade = employeegrade;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String toString() {
		return String.format("Person Name : %s,\nEmail : %s,\nPhone Number : %s\nTitle : %s,\nCompany Name : %s,\nEmployee Grade : %s,\nSalary : %s",
				super.getName(),
				super.getEmail(),
				super.getPhnNumber(),
				title,companyName,employeegrade,salary);
	}
	

}
