package com.gana.looping;

public class Return {
	
	int findSum(int num1,int num2) {
		var sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
		var obj = new Return();
		
		System.out.println(obj.findSum(2,3));
	}

}
