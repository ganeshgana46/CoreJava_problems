package com.gana.Abstraction;

public class User {

	public static void main(String[] args) {
		Laptop obj = new Lenovo();
		obj.copy();
		obj.cut();
		obj.read();
		obj.keyboard();
		obj.security();
	}

}
