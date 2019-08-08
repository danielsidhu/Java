package com.danielsidhu;

public class Methods {

	public static void main(String[] args) {
		String message = greetUser("Daniel", "Sidhu");
//		greetUser("Josh", "Baller");
		System.out.println(message);
	}

	public static String greetUser(String firstName, String lastName) {
//		System.out.println("Hello " + firstName + " " + lastName);
		return "Hello " + firstName + " " + lastName;
	}
}
