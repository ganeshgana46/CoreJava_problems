import java.util.Scanner;

public class Fabonaci {
	public void sumOfNumbers(int num) {
		int sum = 0; //temporary
		for(int i=0;i<=num;i++) {
			sum+=i;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fabonaci number = new Fabonaci();
		System.out.println("Enetr the number : ");
		int n = scanner.nextInt();
        number.sumOfNumbers(n);
	}

}
