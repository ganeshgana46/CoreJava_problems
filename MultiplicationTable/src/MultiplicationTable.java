
public class MultiplicationTable {
	
	void print() {
		print();
	}
	
	void print(int number,int from, int to) {
		for(int i = from; i<=to;i++) {
			System.out.printf("%d * %d = %d",number,i,number*i).println();
		}
	}


public static void main(String[] args) {
	MultiplicationTable table =new MultiplicationTable();
	table.print(3,11,20);
	table.print(6, 11, 20);
}
}