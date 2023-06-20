package motorbike;

public class MotorBike3 {
	
	private int speed;
	
	MotorBike3(int speed){
		this.speed = speed;
	}

	public void start() {
		System.out.println("Bike started!");
	}
	
	public void setSpeed(int speed) {
		this.speed= speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void increaseSpeed(int howmuch) {
		this.speed+=howmuch;
	}
	
	public void decreaseSpeed(int howmuch) {
		this.speed-=howmuch;
	}

}
