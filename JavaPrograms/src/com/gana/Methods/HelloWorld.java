package com.gana.Methods;

public class HelloWorld {
	
	public void sayHelloWorld(int noOfTimes) {
		for(int i=1;i<=noOfTimes;i++) {
			System.out.println("Hello World!");
		}
	}

	public static void main(String[] args) {
		
		HelloWorld print = new HelloWorld();
		print.sayHelloWorld(6);
		

	}

}
