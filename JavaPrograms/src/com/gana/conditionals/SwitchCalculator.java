package com.gana.conditionals;
import java.util.*;
public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		
		System.out.println("select the operator : ");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - multiplication");
		System.out.println("4 - Division");
		System.out.println("Enter th choice");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("Result : " + (number1+number2));
			break;
		case 2 :
			System.out.println("Result : " + (number1-number2));
			break;
		case 3 :
			System.out.println("Result : " + (number1*number2));
			break;
		case 4 :
			System.out.println("Result : " + (number1/number2));
			break;
		default :
			System.err.println("Invalid operation");
		}
	}

}
