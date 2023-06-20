package motorbike;

public class MotorCycle{
	private int speed;
	
	public void start() {
		System.out.println("Bike started");
	}
	
	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void increaseSpeed(int howmuch) {
		this.speed+= howmuch;
	}
	
	public void decreaseSpeed(int howmuch) {
		this.speed-=howmuch;
	}

}
