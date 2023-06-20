package com.gana.BasicPrograms;

import java.util.Scanner;

public class Power {
	
	public void printPower(int base,int exponent) {
//		double result = Math.pow(base,exponent);
//		System.out.println("Answer : " + result);
		long result =  1;
		//base = 2; exponent = 5 ==>2*2*2*2*2 
		for(int i=1;i<=exponent;i++ ) {
			result = result * base;
			//exponent = exponent - 1;
			//decreasing exponent from 5,4,3,2 to 1.
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = sc.nextInt();
		
		Power power = new Power();
		power.printPower(base,exponent);

	}

}
