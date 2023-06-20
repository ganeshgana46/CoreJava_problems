package com.gana.Methods;

public class Numbers {
	
	public void printNumbers(int n) {
		for(int i=1;i<=n;i++) {
			//System.out.println(i);
			System.out.println(i*i);
		}
	}

	public static void main(String[] args) {
		Numbers number = new Numbers();
		number.printNumbers(14);

	}

}
