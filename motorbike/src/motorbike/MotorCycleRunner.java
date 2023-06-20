package motorbike;

public class MotorCycleRunner {

	public static void main(String[] args) {
		MotorCycle ducati = new MotorCycle();
		MotorCycle honda = new MotorCycle();
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		
		ducati.increaseSpeed(100);
		System.out.println(ducati.getSpeed());
        honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());
		
		ducati.decreaseSpeed(100);
		System.out.println(ducati.getSpeed());
        honda.decreaseSpeed(100);
		System.out.println(honda.getSpeed());
		
	
		
		
		

	}

}
