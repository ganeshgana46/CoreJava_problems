package com.gana.introduction;

import java.util.Scanner;

public class SumOfNumbers {
	
	public void saySumOfNumbers(int number) {
		var sum = 0;
		for(int i=0;i<=number;i++) {
			sum =sum+i;
		}
		System.out.println(sum);
		System.out.println(sum/number);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		var number = sc.nextInt();
		
		var obj = new SumOfNumbers();
		obj.saySumOfNumbers(number);
	}

}
