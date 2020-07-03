package com.mani;

public class DemoEnum {

	
	
	enum GENDER {
		MALE, FEMALE, OTHER
	}
	
	public static void main(String[] args) {
		
		char gender = 'M';
		
		if(gender=='M') {
			System.out.println(GENDER.MALE);
		}
		
		
		
	}
}
