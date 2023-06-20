package com.gana.strings;
import java.util.*;
public class Palindrome {
	public void printString(String str) {
		var rev_str = "";

		for(int i=str.length()-1;i>=0;i--) {
			rev_str = rev_str + str.charAt(i);
		}
		if(rev_str.equals(str)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palndrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		var str = sc.next();
	
		var obj = new Palindrome();
		obj.printString(str);

	}

}
