package com.gana.encapsulation;

public class Person {

	//state or data
	private String name;
	private int collegeId;
	private String collegeName;
	
	//constructor
	public Person(String name,int collegeId,String collegeName ) {
		this.name = name;
		this.collegeId = collegeId;
		this.collegeName = collegeName;
	}
	
	//behaviour
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getColegeName() {
		return collegeName;
	}
	public void setColegeName(String colegeName) {
		this.collegeName = collegeName;
	}
	public String toString() {
		return String.format("Person Name : %s\nCollege Id : %d\nCollege Name : %s",name,collegeId,collegeName);
	}

}
