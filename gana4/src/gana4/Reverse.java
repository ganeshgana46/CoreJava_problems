package gana4;

public class Reverse {

	public static void main(String[] args) {
		int num = 987654321, reversed = 0;
	    
	    System.out.println("Original Number: " + num);
	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }

	}

