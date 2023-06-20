package com.gana.introduction;

import java.util.*;
public class HelloWorld {
	
	public void sayHelloLuffy(int number) {
		for(int i=1;i<=number;i++) {
		System.out.println("Hello Luffy...!\n");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		HelloWorld obj = new HelloWorld();
		obj.sayHelloLuffy(number);
	}

}
