package com.demo.tutorial;

public class Employee {
	private int baseSalary;//here we don't set the field to a specific number so we can declare this dynamically
	private int hourlyRate;//we also set these fields private so they cannot be accessible outside this class
	
	public static int numberOfEmployees;

	
	//Here we declare a constructor, and initialize these fields to put this in a valid state
	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++;
	}
	
	//Here we can overload the constructor
	public Employee(int baseSalary) {
		this(baseSalary, 0);//Here we can call the employee constructor and we have option to pass either 1 or 2 parameters
	}
	
	public static void printNumberOfEmployees() {//we only declare static when we want to call a method from the main method
		System.out.println(numberOfEmployees);
	}
	
	//here in the employee class we don't need to pass the same arguments over and over, here we encapsulate them within an object
	public int calculateWage(int extraHours) {//extraHours we can change every month while the other 2 fields remain the same for the year
		return baseSalary + (hourlyRate * extraHours);
	}
	
	//Here we have the same method with different parameter called method overloading
	public int calculateWage() {
		return calculateWage(0);//here we overloaded the same method twice to have a parameter or not
	}

	/*
	 * getters and setters we use to get or set the value of a field 
	 */
	
	//here we set the baseSalary and can validate in case of negative numbers
	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
			throw new IllegalArgumentException("Cannot enter in a negative base salary");
		} else
			this.baseSalary = baseSalary;
	}

	//here we can create a getter so that the console can grab the value and print it to the console.
	private int getBaseSalary() {
		return baseSalary;
	}

	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0) {
			throw new IllegalArgumentException("Cannot enter in a negative hourly rate");
		} else
			this.hourlyRate = hourlyRate;
	}
	
	//we make the getters both private to reduce the coupling and reduce the overall complexity
	private int getHourlyRate() {
		return hourlyRate;
	}
}
