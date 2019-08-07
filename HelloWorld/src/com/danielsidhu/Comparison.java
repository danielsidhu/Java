package com.danielsidhu;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		System.out.println(x != y);

		int temperature = 69;
		boolean isWarm = temperature > 20 && temperature < 80;

		System.out.println(isWarm);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number ");
		int number = scanner.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println("Fizz");
		} else if (number % 3 == 0) {
			System.out.println("Buzz");
		} else
			System.out.println("Try again");
	}

}
