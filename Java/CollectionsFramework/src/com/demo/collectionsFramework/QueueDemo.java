package com.demo.collectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	/*
	 * Queue is an Interface
	 * It implements the FIFO (first in first out)
	 * Since it is and interface we must use LinkedList or PriorityQueue to assign it to Queue
	 */
	public static void main(String []args) {
		
		//creating a linkedlist to assign to queue because queue is an interface
		Queue<String> q = new LinkedList<String>();
		
		//using the add() to add elements
		q.add("Daniel");
		q.add("Alex");
		q.add("Tyler");
		q.add("Chris");
		q.add("Eddie");
		System.out.println("The list of elements are : " + q);// prints [Daniel, Alex, Tyler, Chris, Eddie]
		
		//using the remove() to remove an element
		q.remove();
		
		//using the element() to show the first element in the Queue
		System.out.println("The first element in the Queue is: " + q.element());
		
		System.out.println("The first element removed and shown here is: " + q.poll());
		
		System.out.println("The now updated list: " + q);//prints [Tyler, Chris, Eddie]
	}
}
