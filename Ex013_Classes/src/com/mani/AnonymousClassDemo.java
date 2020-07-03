package com.mani;

import com.mani.model.Car;
import com.mani.model.DbConnection;

public class AnonymousClassDemo {

	//Without class name is called anonymous class. It should have public interface/abstract name <var name> = new interface/abstract name
	public Car NissanCar = new Car() {

		@Override
		public void move() {
			System.out.println("Nissan Car is moving...");
		}
		
		@Override
		public void start() {
			System.out.println("Nissan Car is started...");
		}
		
		@Override
		public void stop() {
			System.out.println("Nissan Car is Stopped...");
		}
		
		
	};

	public Car MaruthiCar = new Car() {
		
		public void move() {
			System.out.println("Maruthi Car is moving...");
		}
		public void start() {
			System.out.println("Maruthi Car is started...");
		}
		public void stop() {
			System.out.println("Maruthi Car is Stopped...");
		}
	};
	
	public DbConnection db = new DbConnection() {
		@Override
		public void openConnection() {
			System.out.println("Openning the connection");
		}
	};
	
	public static void main(String[] args) {
		
		AnonymousClassDemo ac = new AnonymousClassDemo();
		ac.MaruthiCar.start();
		
		ac.db.openConnection();
		
	}
	
}
