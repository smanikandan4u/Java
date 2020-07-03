package com.mani;

public class VariableDemo {

	//Scope is between { and }
	
	String input = "Welcome";	//instance variable
	
	static String GBL = "Global";	//instance variable
	
	final float pi = 3.14f;
	
	public static void main(String[] args) {
		
		VariableDemo v1 = new VariableDemo();
		
		System.out.println(v1.input);
		v1.display();
		v1.change();
		v1.display();
		
		
		
		System.out.println("----------------------------------------");
		
		VariableDemo v2 = new VariableDemo();
		v2.display();
		v2.displayAgain();
		
		System.out.println(VariableDemo.GBL);
		VariableDemo.staticCheck();
		
	}
	
	private void display() {
		System.out.println(input);
	}
	private void change() {
		String newVal = "New Value";	//local variable
		input = newVal;
		GBL="New Global";
	}
	private void displayAgain() {
		System.out.println(input);// If the variable is not static, the value reset to initial value
		System.out.println(GBL); // If we change STATIC variable value in another object instance, it will change globally
	}
	
	private static void staticCheck() {
		System.out.println("Prints from Static Method");
	}
}
