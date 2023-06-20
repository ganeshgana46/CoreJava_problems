package com.gana.Inhertence;

public class Person {
	//state or data
	private String name;
	private String Id;
	private String title;
	
	//constructor
	Person (String name,String Id,String title){
		this.name = name;
		this.Id = Id;
		this.title = title;
	}
	
	//behaviour
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getId() {
		return Id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
//	public String toString() {
//		return String.format("Person Name : %s\nPerson Id : %s\nPerson Title : %s\n",name,Id,title);
//	}
//	

}
