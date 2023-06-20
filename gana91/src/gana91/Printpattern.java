package gana91;

public class Printpattern {
	static void printPattern(String s) {
		int i =1;
		while (i <=s.length())
		{
			System.out.println(s.substring(0,i));
			i++;
		} 
				
	}
	public static void main(String[] args) {
	printPattern("P.GANESH");
}}
