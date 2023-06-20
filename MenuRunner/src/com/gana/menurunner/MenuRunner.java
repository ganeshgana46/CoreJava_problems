package com.gana.menurunner;
import java.util.Scanner;
public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1 :");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number2 :");
		int number2 = scanner.nextInt();
		
		System.out.println("select the operation");
		System.out.println("1 - Add");
		System.out.println("2 - sub");
		System.out.println("3 - multiply");
		System.out.println("4 - divide");
		
		System.out.println("select the choice");
		int choice = scanner.nextInt();
		
		performOperationUsingSwitch(number1, number2,  choice);

	}
		
		private static void usingSwitch(int number1, int number2, int choice) {
			switch(choice) {
			case 1:
				System.out.println("result : "+(number1 + number2));
				break;
			case 2:
				System.out.println("result : "+(number1 - number2));
				break;
			case 3:
				System.out.println("result : "+(number1 * number2));
				break;
			case 4:
				System.out.println("result : "+(number1 / number2));
				break;
			}
		}
		private static void performOperationUsingSwitch(int number1, int number2, int choice) {
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


