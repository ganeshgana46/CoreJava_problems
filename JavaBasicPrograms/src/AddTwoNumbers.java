import java.util.Scanner;

public class AddTwoNumbers {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the first number : ");
//		int number1 = scanner.nextInt();
//		System.out.println("Enter the second number : ");
//		int number2 = scanner.nextInt();
//		
//		System.out.println("Number1 : " + number1);
//		System.out.println("Number2 : " + number2);
//		
//		System.out.println("Result : "+ (number1+number2));
//
//	}
	private int number1;
	private int number2;
	
	public AddTwoNumbers(int number1,int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int addNumbers() {
		return number1+number2;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber1() {
		return number1;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public int getNumber2() {
		return number2;
	}
	
	public static void main(String[] args) {
		AddTwoNumbers numbers = new AddTwoNumbers(3,8);
		System.out.println(numbers.addNumbers());
	}

}
