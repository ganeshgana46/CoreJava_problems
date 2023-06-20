package com.gana.BasicPrograms;

import java.util.Scanner;

//Write a program to check given number is prime or not
//Prime number - A number that is divisible only by 1 and itself
//Example - 2,3,5,7,11,13
public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
