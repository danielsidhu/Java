package com.mortgage.tutorial;

public class MortgageCalculator {

	// declaring the fields for use
	private int principal;
	private double interest;
	private int years;
	private int percent = 100;
	private int months = 12;

	// generating the constructor to initialize our values
	public MortgageCalculator(int principal, double interest, int years) {
		super();//keyword that is a reference to the parent class
		this.principal = principal;
		this.interest = interest;
		this.years = years;
	}

	// create a method to calculate the balance
	public double calculateBalance(int numberOfPaymentsMade) {

		double interestRate = getMonthlyInterest();
		int payments = getPayments();
		double balance = principal
				* (Math.pow((1 + interestRate), payments) - Math.pow((1 + interestRate), numberOfPaymentsMade))
				/ (Math.pow((1 + interestRate), payments) - 1);

		return balance;
	}

	// create a method to calculate the mortgage
	public double calculateMortgage() {

		double interestRate = getMonthlyInterest();
		int payments = getPayments();
		double mortgage = principal * (interestRate * Math.pow(1 + interestRate, payments))
				/ ((Math.pow(1 + interestRate, payments)) - 1);
		return mortgage;
	}
	
	//create a method to get the remaining balances and calculate till we reach zero
	public double[] getRemainingBalances() {
		double[] balances = new double[getPayments()];
		for (int month = 1; month <= balances.length; month++) {
			balances[month - 1] = calculateBalance(month);
		}
		return balances;
	}

	// create custom getters
	private int getPayments() {
		return years * months;
	}

	private double getMonthlyInterest() {
		return (interest / percent) / months;
	}

	// generate the getters and setters for the fields
	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

}
