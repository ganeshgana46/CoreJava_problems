package com.gana.Abstraction;

public interface Laptop {
	
	public void copy();
	
	public void cut();
	
	public void read();
	
	public void keyboard();
	
	default void security() {
		System.out.println("Security code");
	}

}
