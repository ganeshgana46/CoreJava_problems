package com.gana.interfaces;

public class User {

	public static void main(String[] args) {
		Lenovo lenovo = new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.read();
		lenovo.keyboard();
		lenovo.cemara();
		
		
		lenovo.security();
		//static method
		Laptop.audio();
		//private method
		
		
		Hp hp = new Hp();
		hp.copy();
        //until java 7 this is the process 
		//After java 7 i mean in java 8 we directly implement the method in Intefaces.
	}

}
