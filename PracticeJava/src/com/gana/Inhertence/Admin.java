package com.gana.Inhertence;

public class Admin extends Developer {
	
	public void manage() {
		super.read();
		super.write();
		System.out.println("Manage code...");
	}

}
