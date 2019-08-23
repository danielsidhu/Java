package com.demo.tutorial;

//here we create the mortgage report class to create the reports 
import java.text.NumberFormat;

public class MortgageReport {

	private MortgageCalculator calculator;// instantiate our mortgageCalculator class
	private NumberFormat currency;

	public MortgageReport(MortgageCalculator calculator) {// create a constructor to initialize the calculator field
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}

	public void printBalance() {
		System.out.println("BALANCE");
		System.out.println("-------");
		for (double balance : calculator.getRemainingBalances())
			System.out.println(currency.format(balance));
	}

	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("");
		System.out.println(currency.format(mortgage));
	}

}
