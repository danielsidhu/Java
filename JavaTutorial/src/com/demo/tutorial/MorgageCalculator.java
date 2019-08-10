package com.demo.tutorial;

import java.util.Scanner;

public class MorgageCalculator {

	public static void main(String[] args) {
		int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
		double interest = (double) readNumber("Annual Interest Rate: ", 1, 30);
		int payments = (int) readNumber("Period (years): ", 1, 1000);

		double morgage = calculateMortgage(principal, interest, payments);
		System.out.println("Your Morgage is " + morgage);
	}

	@SuppressWarnings("resource")
	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
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

	public static double calculateMortgage(int principal, double interest, int payments) {
		int percent = 100;
		int months = 12;

		double interestRate = ((interest / percent) / months);
		int years = payments * months;
		double morgage = principal * (interestRate * Math.pow(1 + interestRate, years))
				/ ((Math.pow(1 + interestRate, years)) - 1);
		return morgage;
	}
}
