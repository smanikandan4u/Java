package com.mani;

import com.mani.userdefined.User;

public class DataTypeDemo {

	/*
	 * Datatype:
	 * 	1. Primitive
	 *  2. Non-Primitive
	 * 		String, Date, Array, 
	 */
	
	/*
		boolean	-	1 bit	-	true or false
		
		byte	-	8 bit	-	(2 pow n)-1 (8)pow7	2*2*2*2*2*2*2	-	signed(-/+)	= from -128 to 127
		
		char	-	16 bit	-	0 to 255
		short	-	16 bit	-	-32768 to 32767
		
		int		-	32 bit	-	-2147483648 to 2147483647
		float	-	32 bit	-	0.0, 7 digit decimal point
		
		long	-	64 bit	-	-9223372036854775808 to 9223372036854775807
		double	-	64 bit	-	with floating point that supports 16 digit of decimal point
	
	*/
	
	public static void main(String[] args) {
		
		boolean b = false;
		System.out.println(b);
		
		byte byt = 127;
		System.out.println(byt);
		
		char c = 'Y';
		System.out.println(c);
		
		short sh = 32767;
		System.out.println(sh);
		
		User u = new User();
		
		
	}
	
}
