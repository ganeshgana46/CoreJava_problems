package com.gana.Introduction;

public class Table {
	
	public void printTable(int n,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d",n,i,n*i).println();
		}
	}

	public static void main(String[] args) {
		Table print = new Table();
		print.printTable(5, 21, 30);
		

	}

}
