package com.gana.BasicPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int rev = 0;
		int backup = number;
		while(number!=0) {
			rev = rev*10 + number%10;
			number = number/10;
			
		}
		if(backup==number) {
			System.out.println("The given number is a palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}
	}

}
