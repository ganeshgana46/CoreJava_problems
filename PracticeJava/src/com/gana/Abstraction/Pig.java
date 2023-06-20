package com.gana.Abstraction;

public class Pig extends Animal {

	public void animalSound() {
		System.out.println("wee wee");
	}
	
	public static void main(String[] args) {
		var obj = new Pig();
		obj.animalSound();
		obj.sleeping();
	}
	
	

}
