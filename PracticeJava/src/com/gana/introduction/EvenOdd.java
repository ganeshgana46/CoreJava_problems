package com.gana.introduction;
import java.util.*;
public class EvenOdd {
	
	public void sayEvenOdd(int number) {
		
		if(number%2==0) {
			System.out.println("It is a even number");
		}else {
			System.out.println("it is a odd number");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		var number = sc.nextInt();
		
		var obj = new EvenOdd();
		obj.sayEvenOdd(number);
	}

}
