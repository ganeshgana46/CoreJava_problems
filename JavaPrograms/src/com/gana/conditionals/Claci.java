package com.gana.conditionals;

public class Claci {
	
	private int choice;
	private int number2;
	private int number1;

	public void menu(int number1,int number2,int choice) {
		this.number1 = number1;
		this.number2 = number2;
		this.choice = choice;
		if(choice == 1) {
			System.out.println("Result = " + (number1 + number2));
			} else if(choice == 2) {
			System.out.println("Result = " + (number1 - number2));
			} else if(choice == 3) {
			System.out.println("Result = " + (number1 * number2));
			} else if(choice == 4) {
			System.out.println("Result = " + (number1 / number2));
			} else {
			System.out.println("Invalid Operation");
			}

		
	}

}
