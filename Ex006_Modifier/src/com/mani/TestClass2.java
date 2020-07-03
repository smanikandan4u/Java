package com.mani;

public class TestClass2 {

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		t.protectedMessage();
		t.publicMessage();
		// t.display(); --> Cannot call this method since its a private method
		t.defaultMessage();
	}
}
