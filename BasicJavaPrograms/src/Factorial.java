import java.util.Scanner;

public class Factorial {
	
	public void factorial(int number) {
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact = fact*i;
			System.out.println(fact);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factorial print = new Factorial();
		System.out.println("Enter the factorial number : ");
		int number = scanner.nextInt();
		print.factorial(number);

	}

}
