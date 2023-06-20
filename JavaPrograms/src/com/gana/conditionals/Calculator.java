package com.gana.conditionals;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		System.out.println("choose the opeartion");
		System.out.println("1 - Addition");
		System.out.println("2 - subraction");
		System.out.println("3 -  multiplication");
		System.out.println("4 - division");
		System.out.println("Enetr choice");
		int choice = scanner.nextInt();
		
		System.out.println("Your inputs are");
		System.out.println("Number 1 :"+number1);
		System.out.println("Number 2 :"+number2);
		
		
		if(choice == 1) {
			System.out.println("Result : " + (number1 + number2));
		}else if(choice == 2) {
			System.out.println("Result : " + (number1 - number2)); 
		}else if (choice == 3) {
			System.out.println("Result : " + (number1 * number2));
		}else if(choice == 4) {
			System.out.println("Result : " + (number1 / number2));
		}else {
			System.out.println("Invalid operator");
		}
	}

}
