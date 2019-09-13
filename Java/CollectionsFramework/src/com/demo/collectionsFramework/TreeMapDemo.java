package com.demo.collectionsFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	/*
	 * TreeMap implements the Map Interface and is in some ways similar to HashMap except that TreeMap is ordered
	 * 		and the order is in ascending order of its keys
	 * It stores elements as key/value pairs
	 * It is not thread-safe because it is unsynchronized unless explicitly stated
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String []args) {
		
		//Creating the TreeMap
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		//using the put() to insert elements into the TreeMap
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");
		
		//Creating a set of entries
		Set set = tmap.entrySet();
		
		//Displaying the TreeMap using Iterator
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
			/*prints Key is: 1 & Value is: Data1
			Key is: 2 & Value is: Data5
			Key is: 4 & Value is: Data4
			Key is: 23 & Value is: Data2
			Key is: 70 & Value is: Data3*/
		}
	}

}
