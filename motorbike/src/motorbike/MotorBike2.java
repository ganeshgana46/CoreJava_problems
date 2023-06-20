package motorbike;

public class MotorBike2 {
	//state
	private int speed;
	
	
	//constructor
	public MotorBike2(int speed) {
		if(speed>0) {
		this.speed = speed;
		}
	}


	public void start() {
		System.out.println("Bike started!");
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>0) {
		this.speed = speed;
		}
	}
	public void increaseSpeed(int howmuch) {
		this.speed = this.speed + howmuch;
	}
	public void decreaseSpeed(int howmuch) {
		this.speed = this.speed - howmuch;
	}

}
