package com.gana.oops;

public class Student {
	
	private int rollNumber;
	private String name;
	private boolean isAttended;
	
	public Student(int rollNumber,String name,boolean isAttended) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.isAttended = isAttended;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAttended() {
		return isAttended;
	}
	public void setAttended(boolean isAttended) {
		this.isAttended = isAttended;
	}
	
	public String toString() {
		return String.format("Roll Number : %d,\nName : %S,\nIsAttended : %b",rollNumber,name,isAttended);
	}
	
	

}
