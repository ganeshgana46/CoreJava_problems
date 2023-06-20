package com.gana.introduction;

import java.util.Scanner;

public class Power {
	
	public void printPower(int base, int exponent) {
		var result = 1;
		for(int i=1;i<=exponent;i++) {
			result = result * base;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base :");
		var base = sc.nextInt();
		System.out.println("Enter the exponent :");
		var exponent = sc.nextInt();
		
		var obj = new Power();
		obj.printPower(base,exponent);

	}

}
