package com.gana.strings;
import java.util.*;
public class Anagram {
	
	public void printAnagram(String str1,String str2) {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean result = Arrays.equals(c1,c2);
			if(result) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			
		}
	}
	public static void main(String[] args) {
//		String str1 = "silent";
//		String str2 = "listen";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		var str1 = sc.next();
		System.out.println("Enter the second string : ");
		var str2 = sc.next();
		
		var obj = new Anagram();
		obj.printAnagram(str1,str2);
		
		
		
	}

}
