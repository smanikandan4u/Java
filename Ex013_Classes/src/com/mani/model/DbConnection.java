package com.mani.model;

/*When we use abstract keyword it called abstract class
	- It can have both abstract and non abstract method
	- When need abstract method the class should be abstract class
	- When define abstract method should not contain curly braces, it should be declaration method.
	- Non abstract implementation method is optional to extends the class
	-Interface always 100% abstract, we cannot define any implementation in the method but abstract class can have the method
*/
public abstract class DbConnection {

	public abstract void openConnection();
	
	public void closeCOnnection() {
		System.out.println("Closing connection...");
	}
	
}
