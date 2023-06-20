package com.gana.interfaces;

public class Lenovo implements Laptop {

	
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}

	
	public void read() {
		System.out.println("Lenovo read code");
		
	}

	
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}


	public void keyboard() {
		System.out.println("Lenovo keyboard code");
		
	}
	//further implementation is also allowed in this Interfaces
	public void cemara() {
		System.out.println("Lenovo capture the code");
	}
	
	//interface method
	@Override
	public void security() {
		System.out.println("Please implement");
	}


}
