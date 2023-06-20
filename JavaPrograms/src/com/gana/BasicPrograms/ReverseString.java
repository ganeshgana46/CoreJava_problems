package com.gana.BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String str1 = "Ganesh";
		String str2 =new String();
		for(int i=str1.length()-1;i>=0;i--) {
			str2 = str2 + str1.charAt(i);
			
//		StringBuffer stringBuffer = new StringBuffer(str1);
//		System.out.println(stringBuffer.reverse());
		//StringBuilder object = new StringBuilder(str1);
		//System.out.println(object.reverse());
		}
		System.out.println(str2);

	}
}

