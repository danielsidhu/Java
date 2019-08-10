package com.danielsidhu;

import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {

//		int percent = 100;
//		int months = 12;
		double annualInterest = 0;
//		double monthlyInterest = 0;
		double principal = 0;
		int years = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

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
			System.out.print("Enter your monthly interest rate between 0 and 100 ");
			annualInterest = scanner.nextDouble();

			if (annualInterest >= 0 && annualInterest <= 100) {
//				monthlyInterest = (annualInterest / percent) / months;
				break;
			} else {
				System.out.println("Nope, try again");
				continue;
			}
		}

		while (true) {
			System.out.print("Enter your yearly payment between 1 and 30");
			years = scanner.nextInt();

			if (years >= 0 && years <= 30) {
//				payments = years * months;
				break;
			} else {
				System.out.println("Nope, try again");
				continue;
			}
		}
		
//		double morgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), payments ) / ((Math.pow((1 + monthlyInterest), payments) - 1)));
//		System.out.println("Your Morgage is " + morgage);
		
		double mortgage = calculateMortgage(principal, annualInterest, years);
		System.out.println("Your Morgage is " + mortgage);
	}

	public static double calculateMortgage(double principal, double annualInterest, int years) {
		
		int months = 12;
		int percent = 100;
		
		double monthlyInterest = (annualInterest / percent) / months;
		int payments = years  * months ;
		
		double mortgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), payments ) / ((Math.pow((1 + monthlyInterest), payments) - 1)));
//		System.out.println("Your Morgage is " + morgage);
		
		return mortgage;
	}
}
