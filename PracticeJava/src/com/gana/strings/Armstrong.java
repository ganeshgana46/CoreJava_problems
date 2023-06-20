package com.gana.strings;

import java.util.Scanner;

//Armstrong number is a number that is equal to
//the sum of cubes of its digits
//Example
//input - 153, 1^3 + 5^3 + 3^3 = 153   output1 - Armstrong
//input - 123, 1^3 + 2^3 + 3^3 = 36    output2 - Not Armstrong

public class Armstrong {
	
	public void printNumber(int number) {
		var backup = number;
		var sum = 0;
		while(number!=0) {
		sum = sum + (number%10)*(number%10)*(number%10);
			number = number/10;
		}
		if(backup == sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		var number = sc.nextInt();
		
		var obj = new Armstrong();
		obj.printNumber(number);

	}

}
