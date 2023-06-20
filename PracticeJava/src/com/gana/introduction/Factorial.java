package com.gana.introduction;
import java.util.*;
public class Factorial {
	
	public void sayFactorial(int number) {
		var fact = 1;
		for(int i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		var number = sc.nextInt();
		
		var obj = new Factorial();
		obj.sayFactorial(number);
	}

}
