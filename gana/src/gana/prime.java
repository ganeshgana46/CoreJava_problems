package gana;

public class prime {

	public static void main(String[] args) {
		int num = 3;
		boolean flag = false;
		for (i = 2; i<= num /2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
if (!flag)
	System.out.println(num + "is aprime number");
else
	System.out.println(num + "is not a prime number ");

	}

}
