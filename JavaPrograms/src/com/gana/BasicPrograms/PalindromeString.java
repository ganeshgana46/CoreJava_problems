package com.gana.BasicPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String org_str = str;
		
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + org_str.charAt(i);
			//System.out.println(rev);
		}
		
		
		if(org_str.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
