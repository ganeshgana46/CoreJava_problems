package nameofday;

public class CalenderSwitchRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(1));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		case 0: return "sunday";
		
		case 1: return "monday";
		
		case 2: return "tuesday";
		
		case 3: return "wednesday";
		
		case 4: return "thursday";
		
		}
		
	}
}
	
		