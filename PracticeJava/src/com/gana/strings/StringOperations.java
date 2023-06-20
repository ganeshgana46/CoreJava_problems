package com.gana.strings;
import java.util.Arrays;
public class StringOperations {

	public static void main(String[] args) {
		var str = "there is a lot text again";
		var str1 ="hello";
		var str2 = "hello";
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("i"));
		System.out.println(str.lastIndexOf("i"));
		System.out.println(str.contains("text"));
		System.out.println(str.isEmpty());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str.startsWith("there"));
		System.out.println(str.endsWith("again"));
		System.out.println(Arrays.toString(str.split(" ")));
	}

}
