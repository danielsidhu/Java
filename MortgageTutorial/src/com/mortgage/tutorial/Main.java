package com.mortgage.tutorial;

public class Main {

	public static void main(String[] args) {

		// declare our fields to be read
		int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
		double interest = Console.readNumber("Annual Interest: ", 1, 30);
		int years = (int) Console.readNumber("Period (Years)", 1, 1_000);

		// create a mortgage calculator and report object
		MortgageCalculator calculator = new MortgageCalculator(principal, interest, years);
		MortgageReport report = new MortgageReport(calculator);

		// create the reports by calling the methods in the report object
		report.printMortgage();
		report.printBalance();
	}

}
