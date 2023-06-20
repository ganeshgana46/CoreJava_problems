package com.gana.BasicPrograms;

import java.util.Scanner;

public class SwapNumbers {
	
	public void swapNumbers(int number1, int number2) {
		int temp;
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Number1 : " + number1);
		System.out.println("NUmber2 : " + number2);
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second Number : ");
		int number2 = scanner.nextInt();
		
		SwapNumbers object = new SwapNumbers();
		object.swapNumbers(number1, number2);
	}

}
