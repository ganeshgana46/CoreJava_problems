package com.polymorphism;

public class Calculations {
	
	//method overloading
	
	public void add(int a,int b) {
		//add method code
	}
	
	public void add(int a,int b,int c) {
		//add method code
	}
	
	public void add(double a,double b) {
		//add method code
	}
	
	public void add(String x,int y) {
		//add method code
	}
	
	public void add(int x,String y) {
		//add method code
	}
	public static void main(String[] args) {
		Calculations c = new Calculations();
		c.add(2, 3);
		c.add(2, 3,4);
		
	}

}
