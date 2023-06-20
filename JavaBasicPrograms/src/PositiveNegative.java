import java.util.Scanner;

public class PositiveNegative {
	
	public void print(int n) {
		if(n<0) {
			System.out.println("This number is negative");
		}else if(n>0) {
			System.out.println("This number is positive");
		}else {
			System.out.println("This number is equal to zero");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        PositiveNegative number = new PositiveNegative();
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        number.print(n);
	}

}
