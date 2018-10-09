package com.demo.collectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	/*
	 * LinkedLists are linear data structures where the elements are not stores in contiguous locations and every element is a separate object
	 * 		with its dynamic and ease of insertion and deletion they are faster than arrays
	 * Each element is referred to as a node
	 * 		some disadvantages is that nodes cannot be accessed directly but needs to start from the head
	 * LinkedList implements the List interface
	 */
	public static void main(String []args) {
		
		//Creating the object of class linkedList 
		LinkedList<String> ll = new LinkedList<String>();
		
		//here we can add elements/nodes to the linkedList
		ll.add("A");
		ll.add("B");
		ll.addLast("C");//adds the element at the end of the list
		ll.addFirst("D");//adds the node to the beginning of the list
		ll.add(2, "E");
		ll.add("F");//added to the end of the list so C isn't the last node
		ll.add("G");
		System.out.println(ll);// prints [D, A, E, B, C, F, G]
		
		//Here we are removing element/nodes from the LinkedList
		ll.remove("B");// removes B
		ll.remove(3);// removes the node in the 3rd index which is C
		ll.removeFirst();// removes the node in the beginning which is D
		ll.removeLast();// removes the node in the last which is G
		System.out.println(ll);
		
		//Here we can confirm whether the node exist within the list
		boolean status = ll.contains("E");
		
		if(status) {
			System.out.println("It does contain E");
		} else {
			System.out.println("It does not contain E");
		}
		
		//Here we are finding the size of the list
		int size = ll.size();
		System.out.println("The size of the list is " + size);// prints 3
		
		//Here we are getting a node at a specified index and we can set it as well
		Object node = ll.get(2);
		System.out.println(node);// prints F
		ll.set(2, "Y");
		System.out.println(ll);// prints [A, E, Y]
		
	}
}
