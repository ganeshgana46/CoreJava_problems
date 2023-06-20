package com.gana.BasicPrograms;

import java.util.Scanner;

public class SumNumbers {
	
	public void sumNumbers(int number) {
		int sum = 0;
		for(int i=0;i<=number;i++) {
			sum = sum + i;
			
		}
		System.out.println("sum of natural numbers : " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		SumNumbers sum = new SumNumbers();
		sum.sumNumbers(5);
		

	}

}
