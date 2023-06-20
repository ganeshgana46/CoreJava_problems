package com.gana.BasicPrograms;

import java.util.Scanner;

public class PosNeg {
	
	public void printNumber(int number) {
		if(number >= 0) {
			System.out.println("The given number is positive");
		}else if(number < 0) {
			System.out.println("The given number is negative");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
        PosNeg object = new PosNeg();
        object.printNumber(number);
        
	}

}
