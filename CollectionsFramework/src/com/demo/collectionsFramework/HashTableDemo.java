package com.demo.collectionsFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	
	/*
	 * HashTable implements the Map Interface 
	 * It is synchronized meaning that only one thread can access it at a time
	 * It has key/value pairs and doesn't allow for null elements 
	 * It doesn't maintain order of insertion or sorting of any kind
	 */
	public static void main(String []args) {
		
		Enumeration names; 
		String key;
		
		//creating the HashTable
		Hashtable<String, String> htable = new Hashtable<String, String>();
		
		//using the put() to add elements
		htable.put("key1", "Daniel");
		htable.put("key2", "Drake");
		htable.put("key3", "Alex");
		htable.put("key4", "Jasmine");
		htable.put("key5", "Eddie");
		
		//displaying the key/value pairs of the table
		names = htable.keys();
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("The key is: " + key + " & the value is: " + htable.get(key));
		}
	}
}
