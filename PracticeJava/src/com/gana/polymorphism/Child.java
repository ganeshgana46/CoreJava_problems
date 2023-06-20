package com.gana.polymorphism;

public class Child extends Parent {
	
	public void method() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		var child = new Child();
		child.method();
		var parent = new Parent();
		parent.method();

	}

}
