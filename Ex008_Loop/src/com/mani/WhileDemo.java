package com.mani;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int a = 0;

		/*
		 * do { a = a+1; System.out.println(a); }while(a<10); }
		 */

		// infinite loop - To get the continous value unless met the condition
		//for (;;) {
			
		/*
		 * while(true) { Scanner se = new Scanner(System.in); //
		 * System.out.println(se.next()); String input = se.next(); if
		 * (input.equals("bye")) { break; } }
		 */
	
		Scanner se = new Scanner(System.in);// to get the input value
		String s = se.next();//to get string value
		//int a = se.nextInt();//To get integer value
		for(;!s.equals("bye");){
			s=se.next();
		}
	
	}
}
