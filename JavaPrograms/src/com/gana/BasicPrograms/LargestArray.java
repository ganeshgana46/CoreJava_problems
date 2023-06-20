package com.gana.BasicPrograms;

public class LargestArray {

	public static void main(String[] args) {
		int [] arr = {2,5,6,9,6};
        int maxNumber = arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>maxNumber) {
        		maxNumber = arr[i];
        		
        	}
        	
        
        }
        System.out.println(maxNumber);

	}

}
