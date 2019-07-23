package com.demo.helloWorld;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		int age = scanner.nextInt();
		System.out.println("You are " + age);
	}
}
