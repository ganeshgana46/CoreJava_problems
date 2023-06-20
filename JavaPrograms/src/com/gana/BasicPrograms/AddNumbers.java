package com.gana.BasicPrograms;

import java.util.Scanner;

public class AddNumbers {
	
	public void addNumbers(int number1,int number2) {
		int sum = number1 + number2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second Number");
        int number2 = scanner.nextInt();
        
        AddNumbers object = new AddNumbers();
        System.out.println("Result");
        object.addNumbers(number1, number2);
	}

}
