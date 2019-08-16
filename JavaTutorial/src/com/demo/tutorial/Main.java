package com.demo.tutorial;

public class Main {

	public static void main(String[] args) {
		//here we call the TextBox Class and use it
		TextBox textBox1 = new TextBox();//here we create an instance of the textBox class, this is an object
		textBox1.setText("Box 1");//here we call a member of the class setText
		System.out.println(textBox1.text);//we print the text out
		
		TextBox textBox2 = new TextBox();// we can instantiate another class 
		textBox2.setText("Box 2");//here we can create a different text
		System.out.println(textBox2.text);//and print this text
		//these 2 objects are completely separate from one another
		
		TextBox textBox3 = new TextBox();//here we are storing the object TextBox() in the heap and textBox3 is referencing that object in the stack
		textBox3.setText("Box 3");//that is why refer to these values as reference types 
		
		Employee employee = new Employee(500, 20);
//		employee.setBaseSalary(50_000);
//		employee.setHourlyRate(20);
		int wage = employee.calculateWage(5);
		System.out.println(wage);
		Employee.printNumberOfEmployees();
		
//		Browser browser = new Browser();
	}

}
