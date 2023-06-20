import java.util.Scanner;
public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings to compare :");
		String a=scan.next();
		String b=scan.next();
		if(a!=b)
			System.out.println(a+ "\n is greater " );
		else
			System.out.println(b+ "\n is greater " );
		
		

	}

}
