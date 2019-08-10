package com.demo.tutorial;

import java.util.Scanner;

public class MorgageCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int principal = 0;
		int payments = 0;
		double interestRate = 0;

		Scanner scanner = new Scanner(System.in);

//		int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
//		double interestRate = (double) readNumber("Annual Interest Rate: ", 1, 30);
////		int payments = (int) readNumber("Period (Months): ", 1, 1000);
		
		while (true) {
			System.out.print("What is your principal? ");
			principal = scanner.nextInt();

			if (principal >= 1000 && principal <= 1_000_000) {
				break;
			} else {
				System.out.println("Please enter a value between 1K ans 1M");
			}
		}

		while (true) {
			System.out.print("What is your monthly interest rate? ");
			interest = scanner.nextDouble();

			if (interest >= 0 && interest <= 30) {
				break;
			} else {
				System.out.println("Please enter a value between 0 and 30");
			}
		}

		while (true) {
			System.out.print("Number of payments? ");
			payments = scanner.nextInt();

			if (payments >= 1 && payments <= 30) {
				break;
			} else {
				System.out.println("Please enter a positive value");
			}
		}

//		double morgage = calculateMortgage(principal, interestRate);
		System.out.println("Morgage is " + morgage);

	}
	
	@SuppressWarnings("resource")
	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
		double value;
		
		while (true) {
			System.out.print(prompt);
			value = scanner.nextDouble();

			if (value >= min && value <= max) {
				break;
			} else {
				System.out.println("Please enter a value between" + min + " and " + max);
			}
		}
		return value;
	}

	public static double calculateMortgage(int principal, double interestRate) {

		double interest = 0;
		int percent = 100;
		int months = 12;
		int payments = 0;
		interestRate = ((interest / percent) / months);

		double morgage = principal * (interestRate * Math.pow(1 + interestRate, payments))
				/ ((Math.pow(1 + interestRate, payments)) - 1);
		return morgage;
	}
}
