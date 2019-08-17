package com.demo.tutorial;

import java.util.Scanner;

//Here we create console class to read the number
public class Console {
	
	private static Scanner scanner = new Scanner(System.in);

	public static double readNumber(String prompt) {
		return scanner.nextDouble();
	}
	public static double readNumber(String prompt, double min, double max) {//this is the only console so we can declare this static
		double value;
		while (true) {
			System.out.print(prompt);
			value = scanner.nextInt();
	
			if (value >= min && value <= max) {
				break;
			} else {
				System.out.println("Incorrect, please enter a value between: " + min + " and " + max);
			}
		}
		return value;
	}

	public Console() {
		super();
	}

}