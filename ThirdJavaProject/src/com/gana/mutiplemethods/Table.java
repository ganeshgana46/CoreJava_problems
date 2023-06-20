package com.gana.mutiplemethods;

public class Table {
	void print() {
		print(5,1,10);
	}
	void print(int n) {
		print(n,1,10);
	}
	void print(int n, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d x %d = %d",n,i,n*i).println();
		}
	}
}
