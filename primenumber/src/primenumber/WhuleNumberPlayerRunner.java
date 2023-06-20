package primenumber;

public class WhuleNumberPlayerRunner {

	public static void main(String[] args) {
		WhuleNumberPlayer player = new WhuleNumberPlayer(10);
		player.printSquaresUptoLimit();
		//for limit = 30 output would be 1 4 9 16 25
		
		player.printCubesUptoLimit();
		//for limit = 30 output would be 1 8 27

	}

}
