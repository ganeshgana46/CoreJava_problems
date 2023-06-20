package com.gana.looping;
import java.util.*;
public class DoWhile {
	
	public void printNumbers(int number) {
		var i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<=number);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		var number = sc.nextInt();
		
		var obj = new DoWhile();
		obj.printNumbers(number);
	}

}
