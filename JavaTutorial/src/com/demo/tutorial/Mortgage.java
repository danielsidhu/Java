package com.demo.tutorial;


public class Mortgage {
	
	public static void main(String[] args) {

//		int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
//		double interest = (double) Console.readNumber("Annual Interest Rate: ", 1, 30);
//		int years = (int) Console.readNumber("Period (years): ", 1, 1000);
//		
//		MortgageCalculator calculator = new MortgageCalculator(principal, interest, years);//create a calculator object
//		MortgageReport report = new MortgageReport(calculator);//create a report object and pass the calculator object into this object
//		
//		report.printMortgage();//printing out the mortgage from the report class
//		report.printBalance();//printing out the balance from the report class
		
//		UIControl control = new TextBox();//instantiate a new text box
//		control.disabled();//disable it with the method
//		System.out.println(control.isEnabled());//print it out to show it is false
		
		TextBox textBox = new TextBox();//this will call the base class then the proceeding sub classes 
		System.out.println(textBox.isEnabled());
	}
}
