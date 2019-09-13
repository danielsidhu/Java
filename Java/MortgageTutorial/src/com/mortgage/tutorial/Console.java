package com.mortgage.tutorial;

import java.util.Scanner;

//create a class to read and store the input being entered in the terminal
public class Console {

	/**
	 * create a scanner and declare it private static as this is the only one and
	 * the only one used in this project
	 */
	private static Scanner scanner = new Scanner(System.in);

	public static double readNumber(String prompt, double min, double max) {

		double value;
		while (true) {
			System.out.println(prompt);
			value = scanner.nextDouble();

			if (value >= min && value <= max) {
				break;
			} else {
				System.out.println("Inccorect value, please enter a value between: " + min + " and " + max);
			}
		}
		return value;
	}

	public Console() {
		super();
	}

}
