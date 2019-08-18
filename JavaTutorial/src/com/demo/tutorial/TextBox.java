package com.demo.tutorial;

public class TextBox extends UIControl { // class, we extend the class to inherit all the UI Control classes fields and
											// methods

	public String text = ""; // field

	public TextBox() {//we need to declare this constructor in order to pass a value from here to the UI class
		super(true);//we explicitly call the constructor of the base class, this needs to be the 1st statement in the constructor
		System.out.println("Text Box");
	}

	public void setText(String text) { // method
		// void used so no we return nothing
		this.text = text;// this key word used when the name of the parameter is the same name as the
							// field
	}

	public void clear() { // method
		text = "";// this is not needed cause we have no parameters
	}
}
