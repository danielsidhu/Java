package com.demo.tutorial;

public class TaxReport {
	private TaxCalculator calculator;
	
	public TaxReport(TaxCalculator calculator) {
		this.calculator = calculator;
//		calculator = new TaxCalculator2018(100_000);
	}
	
	public void show() {
		double tax = calculator.calculateTax();
		System.out.println(tax);
	}
}
