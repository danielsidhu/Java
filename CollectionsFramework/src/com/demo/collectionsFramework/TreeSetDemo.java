package com.demo.collectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	
	/*
	 * TreeSet implements the Set Interface which means that duplicates are allowed but null values aren't
	 * 		it will throw a nullPointerException
	 * It orders the set in ascending order and since it not synchronized it is not thread safe unless explicitly stated
	 */
	public static void main(String []args) {
		
		//creating the TreeSet
		TreeSet<String> tset = new TreeSet<String>();
		
		//using the add() to add elements
		tset.add("apple");
		tset.add("orange");
		tset.add("cherry");
		tset.add("mango");
		tset.add("melon");
		
		//adding duplicates
		tset.add("apple");
		tset.add("melon");
		System.out.println(tset);// print [apple, cherry, mango, melon, orange]
	}
}
