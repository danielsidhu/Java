package com.danielsidhu;

import java.util.Scanner;

public class ScannerTutorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter in a number  ");
		int test = scanner.nextInt();
		System.out.println("Test number entered is " + test);
	}
}
