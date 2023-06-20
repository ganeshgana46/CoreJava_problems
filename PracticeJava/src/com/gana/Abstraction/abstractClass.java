package com.gana.Abstraction;

public abstract class abstractClass implements Laptop {
	
	public void copy() {
		System.out.println("copy code");
	}
	
	public void cut() {
		System.out.println("cut code");
		
	}
	
	public abstract void read();
	
	public abstract void keyboard();
	
	

}
