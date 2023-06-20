package com.gana.BasicPrograms;

import java.util.Scanner;

public class Factorial {
	
	public void printFact(int number) {
		int fact =1;
		for(int i=1;i<=number;i++) {
			fact = fact*i;
			System.out.println(fact);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial number : ");
		int number = sc.nextInt();
		
		Factorial factorial = new Factorial();
		factorial.printFact(5);

	}

}
