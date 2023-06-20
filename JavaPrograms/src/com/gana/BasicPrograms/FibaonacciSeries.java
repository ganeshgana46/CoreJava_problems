package com.gana.BasicPrograms;

import java.util.Scanner;

//Fabonacci number - 0 1 1 2 3 5 8 13 21 34
public class FibaonacciSeries {
	
	public void series(int number) {
	int num1 = 0,num2 = 1;
	int sum = 0;
	System.out.println(num1);
	System.out.println(num2);
	
	for(int i=2;i<=number;i++) {
	    sum = num1 + num2;
		System.out.print(sum + " ");
		num1 = num2;
		num2 = sum;
		
	}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		FibaonacciSeries fs = new FibaonacciSeries();
		fs.series(number);

		

	}

}
