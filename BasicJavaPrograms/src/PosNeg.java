import java.util.Scanner;

public class PosNeg {
	
	public void posNeg(int number) {
		if(number<0) {
			System.out.println("THis number is negative");
		}else if(number>0) {
			System.out.println("This number is positive");
		}else {
			System.out.println("this number is zero");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PosNeg print = new PosNeg();
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		print.posNeg(number);
		

	}

}
