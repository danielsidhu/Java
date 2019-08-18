package com.demo.tutorial;

public class UIControl {

	private boolean isEnabled = true;// create field UI control, like a switch

	public UIControl(boolean isEnabled) {//pass a boolean to initialize our field
		System.out.println("UI Control");
		this.isEnabled = isEnabled;
	}

	public boolean isEnabled() {// create getter to read the value of the field
		return isEnabled;
	}

	public void enable() {// create a method to enable it
		isEnabled = true;
	}

	public void disabled() {// create a method to disable it
		isEnabled = false;
	}

}
