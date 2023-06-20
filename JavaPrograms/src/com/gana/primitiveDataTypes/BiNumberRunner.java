package com.gana.primitiveDataTypes;
import java.util.*;
public class BiNumberRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the fist number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		BiNumber number = new BiNumber(number1,number2);
		
		int sum = number.add();
		System.out.println("Sum of two numbers : " + sum);
		int multi = number.multiply();
		System.out.println("Multiplication of two numbers : " + multi);
		number.doubleValue();
		System.out.println(number.getNumber1());
		System.out.println(number.getNumber2());

	}

}
