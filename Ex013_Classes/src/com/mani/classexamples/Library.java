package com.mani.classexamples;

//Nested inner class Example
public class Library { //Outer Class

	public class Book{ //NonStatic inner class
		public void getBook() {
			System.out.println("Get the book");
		}
		public void addBook() {
			System.out.println("Add a new book");
		}
	}
	public class User{
	 
		public void addUser() {
			System.out.println("Add a new user");
		}
		
	}
}
