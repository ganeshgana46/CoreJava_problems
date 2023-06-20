import java.util.Scanner;

public class AddNumbers {
	
	public void addIntegers(int number1,int number2) {
		int sum = number1 + number2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddNumbers print = new AddNumbers();
	    System.out.println("Enter the first number : ");
	    int number1 = scanner.nextInt();
	    System.out.println("Enter the second number : ");
        int number2 = scanner.nextInt();
        print.addIntegers(number1,number2);
        
        
	}

}
