package com.demo.tutorial;


//Classes are a blueprint for creating objects
//Objects are an instance of a class
public class TextBox {
	
	public String text; //this is the field
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void clear() {
		text = "";
	}
}
