package com.demo.tutorial;

public class Employee {
	private int baseSalary;
	private int hourlyRate;
	
	public static int numberOfEmployees;

	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}
	
	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++;
	}
	
	public static void printNumberOfEmployees() {
		System.out.println(numberOfEmployees);
	}
	
	public int calculateWage(int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
	}

	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
			throw new IllegalArgumentException("Cannot enter in a negative base salary");
		} else
			this.baseSalary = baseSalary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate <= 0) {
			throw new IllegalArgumentException("Cannot enter in a negative hourly rate");
		} else
			this.hourlyRate = hourlyRate;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
}
