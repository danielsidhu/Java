package com.demo.collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	
	/*
	 * HashSet implements the Set Interface which means that duplicates are allowed and null values are as well
	 * It doesn't maintain insertion order so the order can come out randomly
	 * When duplicate values are present the old value will be overwritten and the class is not synchronized so it is not thread-safe 
	 * 		unless explicitly stated.
	 */
	public static void main(String []args) {
		
		//creating the HashSet
		HashSet<String> hset = new HashSet<String>();
		
		//using the add() to add elements
		hset.add("apple");
		hset.add("orange");
		hset.add("cherry");
		hset.add("mango");
		hset.add("melon");
		
		//adding duplicates
		hset.add("apple");
		hset.add("melon");
		
		//adding null values
		hset.add(null); 
		hset.add(null); 
		System.out.println(hset);
	}

}
