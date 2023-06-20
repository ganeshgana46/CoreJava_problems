package com.gana.exceptionHandling;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Program exceution Start");
        int firstNumber = 9;
        int secondNumber = 0;
        int result = 0;
        
        //result = firstNumber/secondNumber;
        
        //Try Block
        try {
        	result = firstNumber/secondNumber;
        }
        //Catch Block
        catch(ArithmeticException ae) {
        	System.out.println(ae.toString());
        	//write alogic to enter this message into log files
        	//throw ae;//After this we can't excute anything
        	//System.out.println(ae.toString());//error will come
        }
        //Finally Block - without exception it will print
        finally {
        	System.out.println("finally block");
        }
        
        System.out.println("Output is:"+result);
        System.out.println("Program exceution end");
	}

}
