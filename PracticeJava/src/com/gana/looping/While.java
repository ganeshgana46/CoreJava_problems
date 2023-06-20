package com.gana.looping;
import java.util.*;
public class While {
	
	public void printNumber(int number) {
		var i =0;
		while(i<=number) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		var number = sc.nextInt();
		
		var obj = new While();
		obj.printNumber(number);
	}

}
