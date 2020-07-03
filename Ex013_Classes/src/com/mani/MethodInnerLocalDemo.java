package com.mani;

import com.mani.classexamples.Hotel;

public class MethodInnerLocalDemo {
	
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		System.out.println(hotel.getFood("veg")); //When calling the method, inner class will initialized and execute corresponding method.
		
	}

}
