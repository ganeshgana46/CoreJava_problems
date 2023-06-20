package gana21;

public class asciiSum {
	int asciiSum(String x)
	{
		int sum =0;
		for (char c: x.toCharArray())
			sum += c;
		return sum;
	}
	public static void main(String[] args){
    ganeshFL obj = new ganeshFL();
    System.out.println(obj.asciiSum("ganesh"));
	}
