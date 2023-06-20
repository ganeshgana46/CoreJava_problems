package com.gana.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		//int[] marks = {99,98,100};
		
		Student student = new Student("laddu",97,98,100);
		
		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks :" + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks :" + sum);
		
		int maximum = student.getMaximumValue();
		System.out.println("maximum marks :" + maximum);
		
		int minimum = student.getMinimumValue();
		System.out.println("minimum marks :" + minimum);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average marks :" + average);

	}

}
