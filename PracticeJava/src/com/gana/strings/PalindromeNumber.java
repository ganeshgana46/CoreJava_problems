package com.gana.strings;
import java.util.*;
public class PalindromeNumber {
	
	public void printReverseNumber(int number) {
		var rev = 0;
		var backup = number;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		var number = sc.nextInt();
		
		var obj = new PalindromeNumber();
		obj.printReverseNumber(number);

	}

}
