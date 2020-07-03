package com.mani;

public class JumpStmt {

	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				break;// Match condition is true exit the iteration
			}
			
			System.out.println(i);
		}

		System.out.println("--------------------------------");
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;//Match condition will be skipped and continue the iteration
			}
			
			System.out.println(i);
		}
	}
	
	
}
