package com.gana.Abstraction;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("jump");
	}
	
	public void down() {
		System.out.println("fall in hole");
	}
	
	public void left() {
		System.out.println("move backward");
	}
	
	public void right() {
		System.out.println("move forward");
	}

}
