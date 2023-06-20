package com.gana.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeak = {"sunday", "monday","tuesday","wednesday","thursday","friday","saturday"};
		String dayWithMostCharecters = "";
		
		for(String day:daysOfWeak) {
			if(day.length()>dayWithMostCharecters.length()) {
				dayWithMostCharecters = day;
				
			}
		}
		System.out.println(dayWithMostCharecters);
		
		for(int i = daysOfWeak.length -1; i>0;i--) {
			System.out.println(daysOfWeak[i]);
		}

	}

}
