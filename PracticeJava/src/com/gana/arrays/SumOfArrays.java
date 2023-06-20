package com.gana.arrays;

public class SumOfArrays {
	
	public void printSum(int... marks) {
		var sum = 0;
		for(int mark:marks) {
			sum = sum + mark;
		}
		System.out.println(sum);
		System.out.println(sum/marks.length);
	}

	public static void main(String[] args) {
		System.out.println("Enter the marks :");
		int [] marks = new int[3];
		marks[0] = 98;
		marks[1] = 99;
		marks[2] = 97;
		var obj = new SumOfArrays();
		obj.printSum(marks);

	}

}
