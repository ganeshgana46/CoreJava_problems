package com.gana.oopsBegin;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(80);
		ducati.start();
		honda.start();
		
		//ducati.setSpeed(100);
		System.out.println("The ducati motorbike speed is now : "+ ducati.getSpeed());
		//honda.setSpeed(80);
		System.out.println("The honda motorbike speed is now : "+ honda.getSpeed());
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);
		

	}

}
