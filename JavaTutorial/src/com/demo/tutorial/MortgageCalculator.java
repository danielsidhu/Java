package com.demo.tutorial;

//Declare a mortgage calculator class to calculate the mortgage
public class MortgageCalculator {
	/*
	 * we declare these fields and encapsulate them, and remove the static keyword
	 * from the bottom methods as the fields are part of the object and not the
	 * method
	 */
	private int principal;
	private double interest;
	private int years;
	private int percent = 100;
	private int months = 12;

	public MortgageCalculator(int principal, double interest, int years) {// call the constructor to initialize the
																			// values

		this.principal = principal;
		this.interest = interest;
		this.years = years;
	}

	public double calculateBalance(int numberOfPaymentsMade) {

		double interestRate = getMonthlyInterest();
		int payments = getPayments();
		double balance = principal
				* (Math.pow((1 + interestRate), payments) - Math.pow((1 + interestRate), numberOfPaymentsMade))
				/ (Math.pow((1 + interestRate), payments) - 1);

		return balance;
	}

	public double calculateMortgage() {

		double interestRate = getMonthlyInterest();
		int payments = getPayments();
		double mortgage = principal * (interestRate * Math.pow(1 + interestRate, payments))
				/ ((Math.pow(1 + interestRate, payments)) - 1);
		return mortgage;
	}

	public double[] getRemainingBalances() {
		double[] balances = new double[getPayments()];
		for (int month = 1; month <= balances.length; month++) {
			balances[month - 1] = calculateBalance(month);
		}
		return balances;
	}

	private int getPayments() {// create a getter to reduce the repetitive use in the above methods
		return years * months;
	}

	private double getMonthlyInterest() {// create a getter to reduce the repetitive use in the above methods
		return (interest / percent) / months;
	}
}
