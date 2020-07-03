package com.mani;

import com.mani.model.DbConnection;

public class AbstractClassDemo extends DbConnection {

	@Override
	public void openConnection() {
		System.out.println("Logic to connect DB");
	}
	
	
	public static void main(String[] args) {
		
		AbstractClassDemo abd = new AbstractClassDemo();
		abd.openConnection();
		abd.closeCOnnection();
		
	}

}
