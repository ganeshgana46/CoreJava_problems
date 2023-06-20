package com.gana.strings;
import java.util.*;
public class ReverseNumber {
	
	public void printNumber(int number) {
		var rev = 0;
		while(number!=0) {
			rev = rev*10 + (number%10);
			number = number/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		var number = sc.nextInt();
        
		var obj = new ReverseNumber();
		obj.printNumber(number);
	}

}
