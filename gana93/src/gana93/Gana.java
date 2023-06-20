package gana93;

public class Gana {
 static int findMaxSubArr_O_N(int[] a){
	 int sum =0;
	 int max = Integer.MIN_VALUE;
	 for (int k : a) {
		 sum +=k;
		 max = Math.max(sum, max);
		 System.out.println("sum="+sum);
		 System.out.println("max="+max);
		 if (sum<0) sum =0;
	 }
	 return max;
	 }

}
