import java.util.Scanner;

public class EvenOrOdd {
	
	public void evenOdd(int number) {
		if(number%2 == 0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EvenOrOdd print = new EvenOrOdd();
		System.out.println("enter the number : ");
		int number = scanner.nextInt();
		print.evenOdd(number);

	}

}
