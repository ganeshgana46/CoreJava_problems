package com.gana.exceptionHandling;

public class Program2 {

	public static void main(String[] args) {
		method2();
	}
	public static void method2() {
		method1();
	}
		//stacktrace
	/*
	 *Exception name - java.lang.ArithmeticException
	 *Expection message - / by zero
	 *Which line Number - 
	 *method information 
	 */
		public static void method1() {
			System.out.println("Program exceution Start");
	        int firstNumber = 9;
	        int secondNumber = 0;
	        int result;
	        
	        result = firstNumber/secondNumber;
	        
	        System.out.println("Output is:"+result);
	        System.out.println("Program exceution end");
			
		}
	}


