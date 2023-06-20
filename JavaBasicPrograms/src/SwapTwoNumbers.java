import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number :");
		int x = scanner.nextInt();
		System.out.println("enter the second number :");
		int y = scanner.nextInt();

		int temporary = x;
		x = y;
		y = temporary;
		System.out.println("swap numbers : " + x);
		System.out.println("swap numbers :" + y);
	}

}
