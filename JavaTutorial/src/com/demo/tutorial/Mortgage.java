package com.demo.tutorial;


public class Mortgage {
	
	public static void main(String[] args) {

		int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
		double interest = (double) Console.readNumber("Annual Interest Rate: ", 1, 30);
		int years = (int) Console.readNumber("Period (years): ", 1, 1000);
		
		MortgageCalculator calculator = new MortgageCalculator(principal, interest, years);//create a calculator object
		MortgageReport report = new MortgageReport(calculator);//create a report object and pass the calculator object into this object
		
		report.printMortgage();
		report.printBalance();
	}
}
