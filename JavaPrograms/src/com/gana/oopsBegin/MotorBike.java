package com.gana.oopsBegin;

public class MotorBike {
	//state or data
	private int speed;
	//constructor
	public MotorBike(int speed) {
		this.speed = speed;
	}
	//behavior
	public void start() {
		System.out.println("Bike Started");
	}
	public void setSpeed(int speed) {
		if(speed > 0) {
		this.speed = speed;
		}
	}
	public int getSpeed() {
		return speed;
	}
	public void increaseSpeed(int howmuch) {
		speed +=howmuch;
		System.out.println("Increasing speed of motorBike : " + speed);
		
	}
	public void decreaseSpeed(int howmuch) {
		speed -=howmuch;
		System.out.println("Increasing speed of motorBike : " + speed);
		
	}

}
