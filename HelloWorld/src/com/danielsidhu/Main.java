package com.danielsidhu;

import java.util.*;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//System.out.println("Hello World");
		// simple print statement

		/*
		 * When it comes to variables we have 2 types 
		 * - primative types store simple
		 * 		values we have: byte, short, int, long, float, double, char, boolean 
		 * - reference types store complex objects
		 * 		values we have: string
		 */

		int age = 30;
		// int is the type of variables,
		// age is identifier
		// = is the assignment operator
		// 30 is the initial value
		//System.out.println(age);// printing out the age

		byte myAge = 26;
		long viewCount = 3_003_034;//can use the underscore to show the commas so this number is 3,003,034
		float price = 33.12f;
		
		Date now = new Date();
		//the now we declared is an instance of the Date() 
		now.getTime();
		//the .getTime is a member of the date class
		//System.out.println(now);
		
		String message = "SOS";
		System.out.println(message);
		
		double equation = 8/2*(2+2);
		System.out.println(equation);
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(array));
		
		
	}
	
	
	
	
	
	
	
}
