package com.danielsidhu;

public class Users {

	public String firstName;
	public String lastName;

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public void sayHello() {
		System.out.println("I am a user");
	}
}
