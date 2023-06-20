package motorbike;

public class MotorBike3unner {

	public static void main(String[] args) {
		MotorBike3 jupiter = new MotorBike3(100);
		MotorBike3 pept = new MotorBike3(80);
		jupiter.start();
		pept.start();
		System.out.println(jupiter.getSpeed());
		System.out.println(pept.getSpeed());
		
		jupiter.increaseSpeed(100);
		pept.increaseSpeed(80);
		System.out.println(jupiter.getSpeed());
		System.out.println(pept.getSpeed());
		
		jupiter.decreaseSpeed(100);
		pept.decreaseSpeed(80);
		System.out.println(jupiter.getSpeed());
		System.out.println(pept.getSpeed());
		

	}

}
