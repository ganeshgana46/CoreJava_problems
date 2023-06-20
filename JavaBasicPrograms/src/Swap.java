import java.util.Scanner;

public class Swap {
	
	public void swapNumbers(int number1,int number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("swap numbers :"+ number1);
		System.out.println("swap numbers :"+ number2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Swap numbers = new Swap();
		System.out.println("Enter the first number :");
		int number1 = scanner.nextInt();
		System.out.println("Enetr the second number :");
		int number2 = scanner.nextInt();
		
		numbers.swapNumbers(number1, number2);

	}

}
