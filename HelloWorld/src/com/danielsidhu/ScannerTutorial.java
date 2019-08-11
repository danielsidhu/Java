package com.danielsidhu;

import java.text.NumberFormat;
import java.util.Scanner;

public class ScannerTutorial {

	final static int months = 12;
	final static int percent = 100;

	public static void main(String[] args) {

//		int percent = 100;
//		int months = 12;
//		double annualInterest = 0;
//		double monthlyInterest = 0;
//		double principal = 0;
//		int years = 0;

//		@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(System.in);

		double principal = readNumber("Principal: ", 1_000, 1_000_000);
		double annualInterest = readNumber("Annual Interest Rate: ", 1, 30);
		int years = (int) readNumber("Years: ", 1, 30);

//		while (true) {
//			System.out.print("Enter your principal between 1k and 1M ");
//			principal = scanner.nextDouble();
//
//			if (principal >= 1_000 && principal <= 1_000_000) {
//				break;
//			} else {
//				System.out.println("Nope, try again");
//				continue;
//			}
//		}

//		while (true) {
//			System.out.print("Enter your monthly interest rate between 0 and 100 ");
//			annualInterest = scanner.nextDouble();
//
//			if (annualInterest >= 0 && annualInterest <= 100) {
////				monthlyInterest = (annualInterest / percent) / months;
//				break;
//			} else {
//				System.out.println("Nope, try again");
//				continue;
//			}
//		}

//		while (true) {
//			System.out.print("Enter your yearly payment between 1 and 30");
//			years = scanner.nextInt();
//
//			if (years >= 0 && years <= 30) {
////				payments = years * months;
//				break;
//			} else {
//				System.out.println("Nope, try again");
//				continue;
//			}
//		}

//		double morgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), payments ) / ((Math.pow((1 + monthlyInterest), payments) - 1)));
//		System.out.println("Your Morgage is " + morgage);

		printMortgage(principal, annualInterest, years);
		printPaymentSchedule(principal, annualInterest, years);
	}

	public static void printMortgage(double principal, double annualInterest, int years) {
		double mortgage = calculateMortgage(principal, annualInterest, years);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Your Morgage is " + NumberFormat.getCurrencyInstance().format(mortgage));
	}

	public static void printPaymentSchedule(double principal, double annualInterest, int years) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (int month = 0; month <= years * months; month++) {
			double balance = calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
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
				System.out.println("Enter a value between " + min + " and " + max);
			}
		}
		return value;
	}

	public static double calculateMortgage(double principal, double annualInterest, int years) {

		double monthlyInterest = (annualInterest / percent) / months;
		int payments = years * months;
		double mortgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), payments)
				/ ((Math.pow((1 + monthlyInterest), payments) - 1)));

		return mortgage;
	}

	public static double calculateBalance(double principal, double annualInterest, int years,
			int numberOfPaymentsMade) {

		double monthlyInterest = (annualInterest / percent) / months;
		int payments = years * months;
		double balance = principal
				* (Math.pow((1 + monthlyInterest), payments) - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
				/ (Math.pow((1 + monthlyInterest), payments) - 1);

		return balance;
	}
}
