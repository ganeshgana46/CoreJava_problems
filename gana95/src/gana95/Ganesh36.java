package gana95;

public class Ganesh36 {
	public static void main(String[] args) {
		//code to call the function
		int a[]= {11,22,33,44};
		char op ='+';
		int k=10;
		int x[] =operate_withk(a, k, op);
		for (int i=0; i<a.length; i++)
			System.out.println(x[i]);
		}
	static int[] operate_withk(int a[], int k, char op) {
		int result[] = new int[a.length];
		for (int i=0; i<a.length; i++)
			if(op=='+') {
				result[i]=a[i]+k;
				
			}
		return result;

}
}