package com.gana.introduction;
import java.util.*;
public class SwapNumbers {
	
	public void swapNumbers(int number1,int number2) {
		var temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("The first number :");
		System.out.println(number1);
		System.out.println("The second number :");
		System.out.println(number2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		var number1 = sc.nextInt();
		System.out.println("Enter the second number");
		var number2 = sc.nextInt();
		
		var swap = new SwapNumbers();
		swap.swapNumbers(number1,number2);
		

	}

}
