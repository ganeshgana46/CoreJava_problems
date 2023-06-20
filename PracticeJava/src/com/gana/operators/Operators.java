package com.gana.operators;

public class Operators {

	public static void main(String[] args) {
		String str1 = "hello", str2 = "gana";
		int i = 10, j =20;
		
		System.out.println(i + j);
		System.out.println("i + j");
		System.out.println(str1 + i);
		System.out.println(str1 + i + j);
		System.out.println(i + j + str1);
		System.out.println(str1 + i * j);
		//System.out.println(str1 + i - j);(compilation error).
		System.out.println(str1 + i + j + str2);

	}

}
