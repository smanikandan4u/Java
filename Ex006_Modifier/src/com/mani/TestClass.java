package com.mani;

public class TestClass {

	private void display() {
		System.out.println("Display method in private");
	}
	
	public void publicMessage() {
		System.out.println("public method");
	}
	
	protected void protectedMessage() {
		System.out.println("protected method");
	}
	
	void defaultMessage() {
		System.out.println("default method");
	}
}
