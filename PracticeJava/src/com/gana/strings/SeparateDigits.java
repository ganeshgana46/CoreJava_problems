package com.gana.strings;
import java.util.*;
public class SeparateDigits {
	
	public void printOrder(int number) {
		while(number!=0) {
			System.out.println(number%10);
			number = number/10;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
        var number = sc.nextInt();
        
        var obj = new SeparateDigits();
        obj.printOrder(number);
	}

}
