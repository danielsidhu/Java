package com.demo.tutorial;

public class TaxCalculator2018 implements TaxCalculator {
	private double taxableIncome;

	public TaxCalculator2018(double taxableIncome) {
		super();
		this.taxableIncome = taxableIncome;
	}

	public double calculateTax() {
		return taxableIncome * 0.4;
	}
}
