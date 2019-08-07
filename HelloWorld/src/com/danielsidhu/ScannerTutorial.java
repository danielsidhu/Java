package com.danielsidhu;

import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {
		
		int percent = 100;
		int months = 12;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your monthly interest rate ");
		double interestRate = scanner.nextDouble();
		double rate = (interestRate/percent)/months;
		
		System.out.print("Enter your principal ");
		double principal = scanner.nextDouble();
		
		System.out.print("Enter your monthly payment ");
		int payments = scanner.nextInt();
		
		double morgage = principal*(rate*Math.pow((1+rate), payments)/
					((Math.pow((1+rate), payments)-1)));
					
		System.out.println("Your Morgage is " + morgage);
	}
}
