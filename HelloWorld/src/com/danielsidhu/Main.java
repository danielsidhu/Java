package com.danielsidhu;

public class Main {

	public static void main(String[] args) {

		Users user = new Users();
		user.firstName = "Daniel";
		user.lastName = "Sidhu";
		
		System.out.println(user.getFullName());
	}

}
