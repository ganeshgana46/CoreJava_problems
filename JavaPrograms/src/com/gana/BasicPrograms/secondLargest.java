package com.gana.BasicPrograms;

import java.util.Arrays;

public class secondLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-2){
                //System.out.println(arr[i]);
            }
        }
        System.out.println(arr[1]);

	}

}
