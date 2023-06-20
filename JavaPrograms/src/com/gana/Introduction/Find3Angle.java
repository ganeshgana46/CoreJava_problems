package com.gana.Introduction;

public class Find3Angle {

	public static void main(String[] args) {
//		int angle1 = 50;
//		int angle2 = 50;
//		int angle3 = 180 -(angle1 + angle2);
//		System.out.println("Angle3 : " + angle3);
		int angle1 = 60;
		int angle2 = 60;
		int angle3 = 50;
		int sum = angle1 + angle2 + angle3;
		if(sum == 180) {
			System.out.println("This a triangle");
		}else {
			System.out.println("This is not a triangle");
		}

	}

}
