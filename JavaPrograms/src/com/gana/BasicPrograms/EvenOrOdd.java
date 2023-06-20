package com.gana.BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {
	
	public void printNumber(int number) {
		if(number%2==0) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        
        EvenOrOdd object = new EvenOrOdd();
        object.printNumber(number);
         
	}

}
