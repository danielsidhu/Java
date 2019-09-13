package com.demo.tutorial;

//create a browser object
public class Browser {
	
	//create a navigate method
	public void navigate(String address) {
		String ip = findIpAddress(address);
		String html = sendHttpRequest(ip);
		System.out.println(html);
	}

	//these 2 methods are private because we don't need to access them in the interface
	private String sendHttpRequest(String ip) {
		return "<html><html>";
	}

	private String findIpAddress(String address) {
		return "127.0.0.1";
	}
}
