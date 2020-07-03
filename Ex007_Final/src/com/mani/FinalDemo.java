package com.mani;

public class FinalDemo extends FinalMethod {

	final int a =100;
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.display();
		FinalDemo fd = new FinalDemo();
		fd.normaMEthod();
		 
	}
	
	//Final variable cannot be modified
	//Final method cannot be overriden
	//Final class cannot be inherited or subclassed
	public void change() {
		// a = 200; //We cannot change the final keyword anywhere like same class, outside class
	}
	
	//Final method cannot be override
	/*
	 * public final void finaldisplay() {
	 * System.out.println("Override Final Method"); }
	 */
	
	//Calling normal method
	public void normaMEthod() {
		//super.normaMEthod();//This will run both parent and inheritted 
		System.out.println("Override normal method");
		
	}
	
	
}

