import java.util.Scanner;

public class CalculatePower {
	
	public void printPower(int base,int exponent) {
		double result = Math.pow(base,exponent);
		System.out.println("Answer : " + result);
//		long result = 1;
//		while(exponent != 0) {
//			result = result*base;
//			exponent--;
		}
		
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatePower power = new CalculatePower();
		System.out.println("Enter the base :");
		int base = scanner.nextInt();
		System.out.println("Enter the exponent :");
		int exponent = scanner.nextInt();
		power.printPower(base, exponent);
        		
		
	}

}
