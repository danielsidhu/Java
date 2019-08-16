package com.demo.tutorial;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculator {

	public static int percent = 100;
	public static int months = 12;

	public static void main(String[] args) {

		int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
		double interest = (double) readNumber("Annual Interest Rate: ", 1, 30);
		int years = (int) readNumber("Period (years): ", 1, 1000);

		printMortgage(principal, interest, years);
		printBalance(principal, interest, years);
	}

	public static void printBalance(int principal, double interest, int years) {
		System.out.println("BALANCE");
		System.out.println("-------");
		for (int month = 0; month <= months * years; month++) {
			double balance = calculateBalance(principal, interest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

	public static void printMortgage(int principal, double interest, int years) {
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("");
		double mortgage = calculateMortgage(principal, interest, years);
		System.out.println(NumberFormat.getCurrencyInstance().format(mortgage));
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

	public static double calculateBalance(int principal, double interest, int years, int numberOfPaymentsMade) {

		double interestRate = (interest / percent) / months;
		int payments = years * months;
		double balance = principal
				* (Math.pow((1 + interestRate), payments) - Math.pow((1 + interestRate), numberOfPaymentsMade))
				/ (Math.pow((1 + interestRate), payments) - 1);

		return balance;
	}

	public static double calculateMortgage(int principal, double interest, int years) {

		double interestRate = ((interest / percent) / months);
		int payments = years * months;
		double mortgage = principal * (interestRate * Math.pow(1 + interestRate, payments))
				/ ((Math.pow(1 + interestRate, payments)) - 1);
		return mortgage;
	}
}
