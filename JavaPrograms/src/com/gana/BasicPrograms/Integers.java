package com.gana.BasicPrograms;

import java.util.Scanner;

public class Integers {
	
	public void printIntegers(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scanner.nextInt();
		
		Integers object = new Integers();
		System.out.println("Numbers");
		object.printIntegers(n);

	}

}
