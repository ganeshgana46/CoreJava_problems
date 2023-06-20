package primenumber;

public class WhuleNumberPlayer {

	private int limit;

	public WhuleNumberPlayer(int limit) {
		this.limit = limit;
	}
	//for limit = 30 output would be 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i =1;
		while(i*i<limit) {
			System.out.print(i*i + " ");
			i++;
			
		}
		
		System.out.println();
		
	}
	//for limit = 30 output would be 1 8 27
	public void printCubesUptoLimit() {
		int i =1;
		while(i*i*i < limit) {
			System.out.print(i*i*i + " ");
			i++;
		}
		
		System.out.println();
		
	}

}
