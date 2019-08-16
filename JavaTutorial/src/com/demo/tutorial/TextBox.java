package com.demo.tutorial;

public class TextBox { //class
	
	public String text; //field
	
	public void setText(String text) { //method
		//void used so no we return nothing
		this.text = text;//this key word used when the name of the parameter is the same name as the field
	}
	
	public void clear() { //method
		text = "";//this is not needed cause we have no parameters
	}
}
