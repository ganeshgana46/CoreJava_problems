package fanproject;

public class Fan {
	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	//constructor
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString() {
		return String.format("Make - %s,Radius - %f,color - %s,isOn - %b,Speed - %d",make,radius,color,isOn,speed);

}
	public void switchOn() {
		isOn = true;
		setSpeed((byte)1);
	}
	public void switchOff() {
		isOn = false;
		setSpeed((byte)0);
	}

	void setSpeed(byte speed) {
		this.speed = speed;
		
	}
}
