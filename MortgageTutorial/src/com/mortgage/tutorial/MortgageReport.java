package com.mortgage.tutorial;

import java.text.NumberFormat;

public class MortgageReport {

	private MortgageCalculator calculator;
	private NumberFormat currency;

	// create a mortgage report constructor to instantiate the calculator field
	public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}

	// create a print balance method
	public void printBalance() {
		System.out.println("BALANCE");
		System.out.println("-------");
		for (double balance : calculator.getRemainingBalances())
			System.out.println(currency.format(balance));
	}

	// create a print mortgage method
	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("");
		System.out.println(currency.format(mortgage));
	}
}
