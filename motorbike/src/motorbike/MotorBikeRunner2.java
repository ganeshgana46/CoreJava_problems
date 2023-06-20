package motorbike;

public class MotorBikeRunner2 {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(80);
		MotorBike yamaha = new MotorBike(50);
		
		ducati.start();
		honda.start();
		yamaha.start();
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(yamaha.getSpeed());
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(80);
		yamaha.decreaseSpeed(70);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(yamaha.getSpeed());
		
		
		

	}

}
