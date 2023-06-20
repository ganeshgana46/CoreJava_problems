package com.gana.BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int backUp = num;
		int rev = 0;
		
		while(num > 0) {
			rev = num*10 + num%10;
			num = num/10;
			
		}
		//System.out.println(rev);
		if(backUp == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		

	}

}
