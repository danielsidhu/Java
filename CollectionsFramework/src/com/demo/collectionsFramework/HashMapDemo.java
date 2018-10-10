package com.demo.collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	/*
	 * HashMap is a Map based collection class that is used for storing Key/Value pairs 
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String []args) {
		
		//Creating the HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Here we add elements to the HashMap
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Auuj");
		
		//Here we display the content using Iterator
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
			//the above line should print out the elements of the HashMap
		}
		
		//Here we are getting a specific value and if the value doesn't exist then it will be null
		String val = hmap.get(2);
		System.out.println("THe value at index 2 is: " + val);
		
		//Here we are going to remove a specific element
		hmap.remove(2);
		
		
		//Here we display the modified content using Iterator
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.println("key is: " + mentry2.getKey() + " & value is: " + mentry2.getValue());
			//the above line should print out the elements of the HashMap except the removed one
		}	
	}
}
