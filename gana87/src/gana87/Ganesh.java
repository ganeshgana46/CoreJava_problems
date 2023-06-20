package gana87;

public class Ganesh {
 static int[] add_k_Array(int a[], int k)
 {
	 int c[] = new int[a.length];
	 for (int i=0; i<a.length; i++)
		 c [i]= a[i]= k;
	 return c;
	 }
 public static void main(String[] args) {
	 int a[] = {-1,-2,-3,4,5};
	 int b[] = {-1,-2,-3,4,5};
	 int ans[] =add_k_Array(a,k);
	 for (int i=0; i<a.length; i++)
	 System.out.println("ans="+ans[i]);
 }
}
