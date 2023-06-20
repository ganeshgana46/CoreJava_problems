package com.gana.oops;

public class Person1 {
	//state or data.
	private String name;
	private String email;
	private String phnNumber;
	//constructor
	public Person1(String name,String email,String phnNumber) {
		this.name = name;
		this.email = email;
		this.phnNumber = phnNumber;
	}
	
	//behaviour
	public void setName(String name) {
		this.name =name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhnNumber(String phnNumber) {
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber() {
		return phnNumber;
	}
//	public String toString() {
//		return String.format("Person Name : %s,\nEmail : %s,\nPhone Number : %s",name,email,phnNumber);
//	}

}
