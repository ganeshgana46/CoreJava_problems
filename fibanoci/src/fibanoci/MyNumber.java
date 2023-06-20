package fibanoci;

public class MyNumber {
	private int number;
	
	public MyNumber(int number) {
		this.number = number;
		
	}

	public int fibanoci() {
		int sum = 0;
		for(int i=0; i<=number; i++) {
			sum = sum + i;
		}
		return sum;
	}
	


}
