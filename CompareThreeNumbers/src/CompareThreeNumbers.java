import java.util.Scanner;
public class CompareThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("CompareThreeNumbers \n Enter three numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a>b && a>c)
			System.out.println(a+  "is largest");
		else
			if(b>c)
				System.out.println(b+  "is largest");
			else
				System.out.println(c+  "is largest");
	}

}
