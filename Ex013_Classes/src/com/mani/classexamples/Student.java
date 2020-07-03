package com.mani.classexamples;

import java.util.Date;

public class Student {
	private int age;
	private String name;
	private Date dob;
	
	
	//To print the all the property of the corresponding class 
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
