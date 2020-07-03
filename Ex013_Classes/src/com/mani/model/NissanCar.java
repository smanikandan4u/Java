package com.mani.model;

//When implements the interface class called Concrete class

public class NissanCar implements Car {	//NisanCar is a concrete class (Since it has the implementation of interface Car)

	//Implementation of an interface will be written in the Concrete class.
	
	public static void main(String[] args) {
		
		// message = "Hi"; //final field can't be overridden
		
	}
	
	@Override
	public void start() {
		System.out.println("Car started...");
	}

	@Override
	public void move() {
		System.out.println("Car is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped...");
	}

}
