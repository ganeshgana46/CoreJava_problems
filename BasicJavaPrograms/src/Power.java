import java.util.Scanner;

public class Power {
	
	public void calculatePower(int base,int exponent) {
		long Result = 1;
		while(exponent != 0) {
			Result = Result * base;
			exponent--;
		}
		System.out.println(Result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Power power = new Power();
		System.out.println("Enter the base : ");
		int base = scanner.nextInt();
		System.out.println("Enter the exponent : ");
		int exponent = scanner.nextInt();
		power.calculatePower(base,exponent);

	}

}
