package com.mani;

import com.mani.classexamples.Library;

public class NestedInnerClass {
	public static void main(String[] args) {
		Library.Book book = new Library().new Book(); //Creating the object for book class from Library class
		book.addBook();
		book.getBook();
		
		//Creating the object for user class from Library class		
		Library.User user = new Library().new User(); //Since its not a static class, hence we are adding new before the inner class
		user.addUser();
		
	}

}
