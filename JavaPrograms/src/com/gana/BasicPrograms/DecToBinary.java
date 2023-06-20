package com.gana.BasicPrograms;

import java.util.Scanner;

public class DecToBinary {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int number = sc.nextInt();
		int i =0;
		int binary[] = new int[100];
		while(number!=0) {
			binary[i]=number%2;
			number = number/2;
			i++;
		}
		System.out.println();
		for(int j=-1;j>=0;j--) {
			System.out.println(""+binary);
		}
		


	}

}
