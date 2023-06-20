package com.gana.Abstraction;

public class GameRunner {

	public static void main(String[] args) {
		var obj = new MarioGame();
		obj.up();
		obj.down();
		obj.left();
		obj.right();

	}

}
