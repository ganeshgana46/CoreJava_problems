package com.gana.polymorphism;

public class Overloading {
	
	public void add(int number1,int number2) {
		var sum = number1 + number2;
		System.out.println(sum);
	}
	
	public void add(double number1,double number2) {
		var sum = number1 + number2;
		System.out.println(sum);
	}
	
	public void add(int number1,int number2,int number3) {
		var sum = number1 + number2 + number3;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		var obj = new Overloading();
		obj.add(2,3);
		obj.add(2.0,3.0);
		obj.add(2,3,4);

	}

}
