package motorbike;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter he number1 :");
		int number1 = scanner.nextInt();
		System.out.println("enter the number2 :");
        int number2 = scanner.nextInt();
        
        System.out.println("enter the choice :");
        System.out.println("1 - Add");
        System.out.println("2 - sub");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("enetr the choice :");
        int choice = scanner.nextInt();
        
        System.out.println("enter ur inputs:");
        System.out.println("number1 :" + number1);
        System.out.println("number2 :" + number2);
        System.out.println("choice :" + choice);
        
        if(choice == 1) {
        	System.out.println("Result :" +(number1 + number2));
        }
        else if(choice == 2) {
        	System.out.println("Result :" + (number1- number2));
        }else if(choice == 3) {
        	System.out.println("Result :" + (number1*number2));
        }else if(choice == 4) {
        	System.out.println("result :"+ (number1/number2));
        }else {
        	System.out.println("invalid operatot");
        }
        
        
	}

}
