package com.mani;

public class VariableTest {
	int i = 10;
	static int staticGlobal= 20;
	
	public static void main(String... args) {
		VariableTest vt = new VariableTest();
		System.out.println("Variable i value:"+vt.i);
		System.out.println("Calling Variable i after method calling:"+vt.i);
		vt.valueChange();
		vt.display();
		
		System.out.println("________________________");
		VariableTest vr = new VariableTest();
		System.out.println("Print static variable value:"+VariableTest.staticGlobal);//we can access classname.variable name for only STATIC variable, with or without object we can call
		vr.display();
		vr.displayAgain();
	}
	
	public void display() {
		System.out.println("Print I value:"+i);
	}
	
	public void valueChange() {
		int j= 200;
		i =j;
		staticGlobal = 500;
	}
	
	public void displayAgain() {
	System.out.println("Print I value with another obj instance:"+i); //I value wont be change, since its another obj instance.If the variable is not static, the value reset to initial value
	System.out.println("Print static value with another obj instance:"+staticGlobal);// If we change STATIC variable value in another object instance, it will change globally
	}
	
}
