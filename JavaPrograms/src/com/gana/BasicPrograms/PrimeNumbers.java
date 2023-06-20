package com.gana.BasicPrograms;
/*Print All prime numbers between 1 to 100
 * what is prime number
 * A prime number is a whole number greater than 1 whose only factors are 1 and itself
 * for example - 2,3,5,7,11,13
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		/*Run a loop from 2 to 100
		 *(we have started loop from 2 as prime number is greater than 1)
		 *(2 is the only even prime number)
		 */
		for(int i=2;i<=10;i++) {
			for(int j=2;j<=i;j++) {
				if(j==i) {
					System.out.println(i);
				}
				if(i%j==0) {
					break;
				}
			}
		}

	}

}
