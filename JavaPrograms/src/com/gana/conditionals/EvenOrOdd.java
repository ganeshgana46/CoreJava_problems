package com.gana.conditionals;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int Number = scanner.nextInt();
		switch(Number%2) {
		//This will return either o or 1
		case 0 :
			System.out.println("this number is even");
			break;
		case 1 :
			System.out.println("this number is odd");
			break;
		
		}
		

	}

}
