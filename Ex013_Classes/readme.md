# class type

Java has different type of classes. 


```
 * Pojo Class (refer com.mani.classexamples.Student)
 * Static Class (Can only be as an inner class. refer com.mani.classexamples.College)
 * Concrete Class
 * Abstract Class (interface)
 * Final Class (Example com.mani.classexamples.FinalClassDemo. This can't be sub classed. Refer line#9 in ClassDemo.java)
 * Inner Class
	1. Nested Inner class (Refer com.mani.classexamples.Library)
	2. Method Local inner classes (Refer com.mani.classexamples.Hotel)
	3. Anonymous inner classes
	4. Static nested classes (same as static class) (can be like creating a static inner class inside another static inner class)
```

## POJO Class

```java
package com.mani.classexamples;

import java.util.Date;

public class Student {
	private int age;
	private String name;
	private Date dob;
	
	// To print the all the property of the corresponding class 
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", dob=" + dob + "]";
	}
	
	// getter, setter
}

```


## Static Class

```java
package com.mani.classexamples;

public class College { //we cannt define static in the main class, static can be defined only inner class
	//static inner class
	public static class Staff {
		public void teach() {
			System.out.println("Static inner Class(teach)");
		}
	}
}

```

##### access the static class from another class

```java
package com.mani;

public class StaticClassDemo {	//outer class
	public static void main(String args[]){
		College.Staff st = new College.Staff();	//creating object for staff.(Note Staff doesnt' have "new" infront of it)
		st.teach();
		
	}
}
```

## Method Local Inner Class
```java
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
```
##### access the method local inner class from another class
```java
package com.mani;
import com.mani.classexamples.Hotel;
public class MethodInnerLocalDemo {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		System.out.println(hotel.getFood("veg")); //When calling the method, inner class will initialized and execute corresponding method.
	}
}

```

## Nested Inner Class

It will behave same like non static class.

```java
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
```

##### nested inner calling from main class

```java
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
```