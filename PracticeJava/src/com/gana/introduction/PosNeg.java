package com.gana.introduction;
import java.util.*;
public class PosNeg {
	
	public void sayPosNeg(int number) {
		if(number>0) {
			System.out.println("Its a positive number");
		}else if(number<0){
			System.out.println("Its a negative number");
		}else {
			System.out.println("it a Zero");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		var number = sc.nextInt();
		
		var obj = new PosNeg();
		obj.sayPosNeg(number);

	}

}
