import java.util.Scanner;

public class PrintIntegers {
	
	public void printIntegers(int number) {
		for(int i=0;i<=number;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrintIntegers integers = new PrintIntegers();
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		integers.printIntegers(number);
	}

}
