package com.mani.classexamples;

public class Hotel { // Outer Class

	public String getFood(String foodItem) { // Method
		class VegFood { // Method local inner Class
			public String prepareFood() {
				// System.out.println("Veg Food is ready");
				return "Veg Food is ready";
			}
		}
		class NonVegFood { // Method local another inner class
			public String prepareFood() {
				// System.out.println("Veg Food is ready");
				return "Non Veg Food is ready";
			}
		}

		if (foodItem.equals("veg")) {
			VegFood food = new VegFood();
			return food.prepareFood();
		} else {
			return new NonVegFood().prepareFood();
		}
	}
}
