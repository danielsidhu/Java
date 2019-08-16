package com.danielsidhu;

import java.text.NumberFormat;

public class MortgageReport {

	private MortgageCalculator calculator;
	private final NumberFormat currency;
	
	public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
		currency = NumberFormat.getCurrencyInstance();
	}
	
	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Your Morgage is " + currency.format(mortgage));
	}

	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		
		for (double balance : calculator.getRemainingBalances())
			System.out.println(currency.format(balance));
		
//		for (int month = 0; month <= calculator.getYears() * MortgageCalculator.months; month++) {
//			double balance = calculator.calculateBalance(month);
//			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
//		}
	}
	
}
