package com.gana.simplecalculator;
import java.util.Scanner;
public class Simplecalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Numbere1 :");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number2 :");
		int number2 = scanner.nextInt();
		
		System.out.println("select the operation");
		System.out.println("1 - Add");
		System.out.println("2 - Sub");
		System.out.println("3 - multiply");
		System.out.println("4 - divide");
		
		System.out.println("select the choice");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Result :"+ (number1 + number2));
		}
		else if(choice == 2) {
			System.out.println("Result :"+(number1 - number2));
		}
		else if(choice == 3) {
			System.out.println("Result :"+(number1 * number2));
		}
		else if(choice == 4) {
			System.out.println("result :"+(number1 / number2));
		}
		else {
			System.out.println("invalid operation");
		}
	}

}
