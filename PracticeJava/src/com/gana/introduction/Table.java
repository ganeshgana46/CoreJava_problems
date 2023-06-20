package com.gana.introduction;

import java.util.Scanner;

public class Table {
	
	public void printTable(int number, int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d",number,i,number*i).println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var number = sc.nextInt();
		var from = sc.nextInt();
		var to = sc.nextInt();
		
		var obj = new Table();
		obj.printTable(number,from,to);

	}

}
