package com.demo.collectionsFramework;

import java.util.Vector;

public class VectorDemo {

	/*
	 * Vector implements List Interface and maintains the insertion order and is hardly used in a non-thread environment
	 * 		since it is synchronized. With its synchronization it performs poorly in searching, adding, deleting and updating
	 * If the capacity is not stated then the capacity defaults to 10 and increments by 10 after every n1th element
	 */
	public static void main(String []args) {
	
	//Creating a vector with an initial capacity of 2
	Vector<String> v = new Vector<String>(2);
	
	//using the addElement() to insert elements
	v.addElement("Apple");
	v.addElement("Orange");
	v.addElement("Mango");
	v.addElement("Pear");
	
	//using the size() to check for size of vector and capacity() to check for default size
	System.out.println("The vector size is: " + v.size());
	System.out.println("The Default capacity size is: " + v.capacity());
	
	//Here we display the elements
	System.out.println("List of fruits: " + v);//prints ["Apple", "Orange", "Mango", "Pear"]
	
	//using removeElement() we remove an element
	v.removeElement("Mango");
	
	//Here we display the new vector
	System.out.println("New list of fruits: " + v);//prints ["Apple", "Orange", "Pear"]
	}
}
