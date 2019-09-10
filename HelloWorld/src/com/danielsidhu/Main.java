package com.danielsidhu;

import java.awt.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Users me = new Users();
		me.firstName = "Daniel";
		me.lastName = "Sidhu";
		
		Student you = new Student();
		you.firstName = "Sherry";
		you.lastName = "Hurtado";
		
		
		ArrayList<Users> users = new ArrayList<Users>();
		users.add(me);
		users.add(you);
			
		System.out.println(users.get(1).getFullName());
		System.out.println(me.getFullName());
		me.sayHello();
		you.sayHello();
		}
	}


