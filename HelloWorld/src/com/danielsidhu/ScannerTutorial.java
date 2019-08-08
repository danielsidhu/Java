package com.danielsidhu;

import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {

		int percent = 100;
		int months = 12;
		double interestRate;
		double rate;
		double principal;
		int payments;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter your monthly interest rate between 0 and 100 ");
			interestRate = scanner.nextDouble();

			if (interestRate >= 0 && interestRate <= 100) {
				rate = (interestRate / percent) / months;
				break;
			} else {
				System.out.println("Nope, try again");
				continue;
			}
		}

		while (true) {
			System.out.print("Enter your principal between 1k and 1M ");
			principal = scanner.nextDouble();
			if (principal >= 1_000 && principal <= 1_000_000) {
				break;
			} else {
				System.out.println("Nope, try again");
				continue;
			}
		}

		while (true) {
			System.out.print("Enter your monthly payment ");
			payments = scanner.nextInt();
			if (payments >= 0) {
				break;
			} else {
				System.out.println("Nope, try again");
				continue;
			}
		}

		double morgage = principal * (rate * Math.pow((1 + rate), payments) / ((Math.pow((1 + rate), payments) - 1)));
		System.out.println("Your Morgage is " + morgage);
	}
}
