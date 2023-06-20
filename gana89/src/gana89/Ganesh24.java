package gana89;

public class Ganesh24 {
	static int sumofDigits(int n)
	{
		int sum =0;
		while (n!=0)
		{
			int r = n%10;
			System.out.println("r = "+r);
			
					n=n/10;
					System.out.println("n = "+n);
			sum=sum+r;
		}
		return sum;
					
		}

public static void main(String[] args) {
	int ans = sumofDigits(12377);
	System.out.println("ans ="+ans);
}}
