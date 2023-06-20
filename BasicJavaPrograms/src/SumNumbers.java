import java.util.Scanner;

public class SumNumbers {
	
	public void suumNumbers(int number) {
		long sum = 0;
		for(int i=0;i<=number;i++) {
			sum = sum + i;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SumNumbers print = new SumNumbers();
		System.out.println("enter the natural number : ");
		int number = scanner.nextInt();
		print.suumNumbers(number);
	}

}
