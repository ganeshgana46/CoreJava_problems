package com.gana.interfaces;

public interface Laptop {
	
	public void copy();
	public void read();
	public void paste();
	public void keyboard();
	
	//implementation in Interface by using "default" or "static".
	//it does not impact any file like Apple,Hp,Lenovo
	
	default void security() {
		//because In static we can't call non static method but
    	//In non static we can call static method
		//audio();
		commonCode();
		System.out.println("Please implement");
	}
	
    //Then static
	//
    static void audio() {
    	//commonCode();
    	//security (error)
    	//because In static we can't call non static method but
    	//In non static we can call static method
    	System.out.println("Laptop audio code");
    }
    
    //In java 9 we also use access modifiers like private,public,default or static.
    //and use is not duplications or code re-usability.
    private void commonCode() {
    	System.out.println("CommonCode");
    }
}
