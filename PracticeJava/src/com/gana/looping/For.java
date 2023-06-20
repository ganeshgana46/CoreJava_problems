package com.gana.looping;
import java.util.*;
public class For {
	
	public void printNumbers(int number) {
		for(int i=1;i<=number;i++) {
			if(i==5)
				//break;
				continue;
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		var number = sc.nextInt();
		
		var obj = new For();
		obj.printNumbers(number);
	}

}
