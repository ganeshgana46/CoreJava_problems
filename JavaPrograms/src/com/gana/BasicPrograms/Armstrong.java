package com.gana.BasicPrograms;

import java.util.Scanner;

//Armstrong number is a number that is equal to
//the sum of cubes of its digits
//Example
// input - 153, 1^3 + 5^3 + 3^3 = 153   output1 - Armstrong
// input - 123, 1^3 + 2^3 + 3^3 = 36    output2 - Not Armstrong
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int backup = num;
        int sum =0;
        while(num!=0) {
        	sum = sum + (num%10)*(num%10)*(num%10);
        	num = num/10;
        }
        System.out.println(sum);
        
        if(backup==sum) {
        	System.out.println("Armstrong");
        }else {
        	System.out.println("not Armstrong");
        }
	}

}
