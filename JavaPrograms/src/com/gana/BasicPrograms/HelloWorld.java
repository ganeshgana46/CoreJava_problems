package com.gana.BasicPrograms;

public class HelloWorld {
	
	public void sayHelloWorld(int n) {
		for(int i=1;i<=n;i++)
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {
		HelloWorld object = new HelloWorld();
		object.sayHelloWorld(5);
		

	}

}
