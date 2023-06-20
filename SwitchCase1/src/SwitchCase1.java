import java.util.Scanner;
public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("press 1.Add two numbers 2.Compare two numbers");
int choice = scan.nextInt();
int n1,n2;
switch(choice)
{
case 1:
	System.out.println("enter two numbers to add");
	n1=scan.nextInt();
	n2=scan.nextInt();

	System.out.println("sum of two numbers:"+(n1+n2));
	break;
case 2:
	System.out.println("enter two numbers to compare");
	n1=scan.nextInt();
	n2=scan.nextInt();
	if(n1>n2)
		System.out.println(n1+ "is greater");
	else
		System.out.println(n2+"is greater");
	break;
	default:
		System.out.println("invalid input");
		break;
	}

}
}