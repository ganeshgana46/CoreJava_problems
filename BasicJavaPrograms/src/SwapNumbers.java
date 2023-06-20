import java.util.Scanner;

public class SwapNumbers {
	
	public void swapNumbers(int number1,int number2) {
		int temp;
	    temp = number1;
	    number1 = number2;
	    number2 = temp;
	    
	    System.out.println("number1 : " + number1);
	    System.out.println("number2 : " + number2);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SwapNumbers print = new SwapNumbers();
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		
		print.swapNumbers(number1,number2);

	}

}
