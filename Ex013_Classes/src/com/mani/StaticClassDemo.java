package com.mani;

import com.mani.classexamples.College;

public class StaticClassDemo {	//outer class

	public static void main(String args[]){
	
		College.Staff st = new College.Staff();	//creating object for staff.(Note Staff doesnt' have "new" infront of it)
		st.teach();
		
	}
}