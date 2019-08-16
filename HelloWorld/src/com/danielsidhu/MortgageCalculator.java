package com.danielsidhu;

import java.text.NumberFormat;

public class MortgageCalculator {
	private final static int months = 12;
	private final static int percent = 100;

	private double principal;
	private double annualInterest;
	private int years;

	public MortgageCalculator(double principal, double annualInterest, int years) {
		super();
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	public double calculateMortgage() {

		double monthlyInterest = getMonthlyInterest();
		int payments = getNumberOfPayments();
		double mortgage = principal * (monthlyInterest * Math.pow((1 + monthlyInterest), payments)
				/ ((Math.pow((1 + monthlyInterest), payments) - 1)));

		return mortgage;
	}

	public double calculateBalance(int numberOfPaymentsMade) {

		double monthlyInterest = getMonthlyInterest();
		int payments = getNumberOfPayments();
		double balance = principal
				* (Math.pow((1 + monthlyInterest), payments) - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
				/ (Math.pow((1 + monthlyInterest), payments) - 1);

		return balance;
	}
	
	public double[] getRemainingBalances() {
		double[] balances = new double[getNumberOfPayments()];
		for (int month = 1; month <= balances.length ; month++) {
			balances[month - 1] = calculateBalance(month);
		}
		return balances;
	}

	private int getNumberOfPayments() {
		return years * months;
	}

	private double getMonthlyInterest() {
		return (annualInterest / percent) / months;
	}

}
