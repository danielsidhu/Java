package com.demo.tutorial;

import java.util.Scanner;

public class FizzBuzzTwo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("please enter in a number: ");
			double number = scanner.nextDouble();
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println("Not Fizz or Buzz");
				break;
			}
		}
	}

}
