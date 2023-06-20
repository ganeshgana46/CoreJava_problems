package com.gana.arrays;

public class MinimumMark {
	
	public void printMinimum(int...marks) {
		var min = marks[0];
		for(int i =0;i<=marks.length-1;i++) {
			if(min>marks[i]) {
				min = marks[i];
				
			}
			
		}
		System.out.println(min);
				
		
	}
	public static void main(String[] args) {
		int [] marks = new int[3];
		marks[0]=97;
		marks[1]=98;
		marks[2]=99;
		
		var obj = new MinimumMark();
		obj.printMinimum(marks);
	}

}
