package com.demo.tutorial;

import java.util.Scanner;

public class MorgageCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int percent = 100;
		int months = 12;
		double interestRate = 0;
		double morgage;
		int principal = 0;
		double interest = 0;
		int payments = 0;

		Scanner scanner = new Scanner(System.in);

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
				interestRate = ((interest / percent) / months);
				break;
			} else {
				System.out.println("Please enter a value between 0 and 30");
			}
		}

		while (true) {
			System.out.print("Number of payments? ");
			payments = scanner.nextInt();

			if (payments >= 0) {
				break;
			} else {
				System.out.println("Please enter a positive value");
			}
		}

		morgage = principal * (interestRate * Math.pow(1 + interestRate, payments))
				/ ((Math.pow(1 + interestRate, payments)) - 1);

		System.out.println("Morgage is " + morgage);

	}
}
