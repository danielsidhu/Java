package com.demo.tutorial;

public class Main {

	public static void main(String[] args) {
		//here we call the TextBox Class and use it
//		TextBox textBox1 = new TextBox();
//		textBox1.setText("Box 1");
//		System.out.println(textBox1.text);
//		
//		TextBox textBox2 = new TextBox();
//		textBox2.setText("Box 2");
//		System.out.println(textBox2.text);
		
		Employee employee = new Employee(500, 20);
//		employee.setBaseSalary(50_000);
//		employee.setHourlyRate(20);
		int wage = employee.calculateWage(5);
		System.out.println(wage);
		Employee.printNumberOfEmployees();
		
//		Browser browser = new Browser();
	}

}
