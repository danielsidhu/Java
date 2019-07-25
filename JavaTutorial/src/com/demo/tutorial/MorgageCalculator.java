package com.demo.tutorial;

import java.util.Scanner;

public class MorgageCalculator {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		int age = scanner.nextInt();
		System.out.println("You are " + age);*/
		
		int percent = 100;
		int months = 12;
		double interestRate;
		double morgage;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your principal? ");
		int principal = scanner.nextInt();
		System.out.print("What is your monthly interest rate? ");
		double interest = scanner.nextDouble();
		System.out.print("Number of payments? ");
		int payments = scanner.nextInt();
		
		interestRate = ((interest/percent)/months);
		
		System.out.println("Interest Rate is " + interestRate);	
		
		morgage = principal*
					(interestRate*Math.pow(1+interestRate, payments))
						/((Math.pow(1+interestRate, payments))-1);
		
		System.out.println("Morgage is " + morgage);
		
	}
}
