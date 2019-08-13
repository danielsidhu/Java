package com.demo.tutorial;

public class Main {

	public static void main(String[] args) {
		//here we call the TextBox Class and use it
		TextBox textBox1 = new TextBox();
		textBox1.setText("Box 1");
		System.out.println(textBox1.text);
		
		TextBox textBox2 = new TextBox();
		textBox2.setText("Box 2");
		System.out.println(textBox2.text);
		
		Employee employee = new Employee();
		employee.setBaseSalary(-1);
		employee.getBaseSalary();
		employee.setHourlyRate(20);
		int wage = employee.calculateWage(5);
		System.out.println(wage);
	}

}
