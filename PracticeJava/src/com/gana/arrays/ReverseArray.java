package com.gana.arrays;
import java.util.*;
public class ReverseArray {
	
	public void printArray(int arr[]) {
		System.out.println("The original Array order is :");
		for(int i=0;i<=arr.length -1;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The reverse Array order is :");
		for(int i=arr.length -1;i>=0;i--) {
			System.out.print(arr[i] + " ");
			
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		var obj = new ReverseArray();
		obj.printArray(arr);
		
	}

}
