package com.gana.abstractclass;

public abstract class SampleAC implements Laptop {
	
	public void copy() {
		System.out.println("copy the code");
	}
	
	public void read() {
		System.out.println("copy the read");
	}
	
	public abstract void cut();
	
	public abstract void keyboard();


}
