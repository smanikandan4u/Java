package com.gokul;

import com.mani.TestClass;

public class DemoClass {

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		// t.display(); --> Cannot call this method since its a private method
		t.publicMessage(); //--> able to call since its public method 
	}
	
}
