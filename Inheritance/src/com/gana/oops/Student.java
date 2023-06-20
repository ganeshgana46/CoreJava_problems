package com.gana.oops;

public class Student extends Person {
	
	private String clgName;
	private String year;
	
	public Student(String name,String email,String phnNumber,String clgName,String year) {
		super(name,email,phnNumber);
		this.clgName = clgName;
		this.year = year;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	public String toString() {
		return String.format("Person Name : %s,\nEmail : %s,\nPhone Number : %s,\nCollege Name : %s,\nYear : %s",super.getName(),super.getEmail(),super.getPhnNumber(),clgName,year);
	}

}
