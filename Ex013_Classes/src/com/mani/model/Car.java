package com.mani.model;

public interface Car {

	public String message = "Hello"; // any variable that we declare inside the interface is final
	
	public void start();
	public void move();
	public void stop();
	
}
