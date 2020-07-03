package com.mani;

import java.util.Date;

import com.mani.classexamples.College;
import com.mani.classexamples.FinalClassDemo;
import com.mani.classexamples.Student;

public class ClassDemo { // extends FinalClassDemo { //can't be extended due to final class
	/*
	Class:
		A "class" in Java is a template/blue-print, that is used to create and define "objects"
		
		Types:
			POJO Class	- (Plain Old Java Object-Getter/Setter)- Only related information(declaration) not implementation, Private variable and public getter/setter
			
			Static Class	- 	(Static and Static nested classes are same. Outer class can't be static).
			Concrete Class	- done
			Abstract Class, (Interface) - done
			Final Class	- done
			Inner Class done
				Nested Inner class	- done
				Method Local inner classes	-	done
				Anonymous inner classes	-	 
				Static nested classes	-	done
*/
	
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st);//To print current value of the object, this line return null
		st.setAge(10);
		st.setName("mani");
		st.setDob(new Date("06/01/2000"));
		System.out.println(st);//toString() default its syout(st.toString())- print same value 
	
		//Static inner class
		College.Staff cl = new College.Staff(); // 
		cl.teach();
		
		//creating object for non static inner class
		//College.Library lib =new College().new Library(); //Since its non static we cannnot call object with dot, hence need to create object and then dot new method name
		College cc =new College();
	//	College.Library ll = cc.new Library(); 
	//	ll.book();
		
		FinalClassDemo fc = new FinalClassDemo(); //final class can't be extended. But can create object like this
		fc.display();
		
	}
	
	

}
