package com.gana.strings;
import java.util.*;
public class ReverseString {
	public void printString(String str) {
		var rev_str = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev_str = rev_str + str.charAt(i);
			
			}
		System.out.println(rev_str);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		var str = sc.nextLine();
		
		var obj = new ReverseString();
		obj.printString(str);
	}
}
