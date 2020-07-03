package com.mani.classexamples;

public class College //we cannt define static in the main class, static can be defined only inner class
{
	
	//static inner class
	public static class Staff {
		public void teach() {
			System.out.println("Static inner Class(teach)");
		}
	}
	
}

