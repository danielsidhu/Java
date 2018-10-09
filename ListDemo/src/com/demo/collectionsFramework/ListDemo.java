package com.demo.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	/*
	 * List Interface extends Collection and so it support all the operations of the collection interface
	 * 		since it is an interface the instances of List can be created the following ways:
	 * 			-List a = new ArrayList();
	 * 			-List b = new LinkedList();
	 * 			-List c = new Vector();
	 * 			-List d = new Stack();
	 * 
	 * Since Java 1.5, we can restrict the type object within the List like so:
	 * 		-List<Obj> list = new List<Obj> ();
	 */
	public static void main(String []args) {
	
		//Creating a list
		List<Integer> l1 = new ArrayList<Integer>();
		
		//the .add method adds given elements at a specified index
		l1.add(0, 1);// 1 inserted into the first index
		l1.add(1, 2);// 2 inserted into the second index
		l1.add(2, 3);
		System.out.println(l1);// prints [1, 2, 3]

		//Creating another list
		List<Integer> l2 = new ArrayList<Integer>();
		//the .add method also doesn't require you to specify the index either
		l2.add(4);//1 inserted first
		l2.add(5);//2 inserted second
		l2.add(6);
		System.out.println(l2);// prints [4, 5, 6]
		
		//the .addAll method inserts the entire second list after the first one
		l1.addAll(3, l2);
		System.out.println(l1);// prints [1, 2, 3, 4, 5, 6]
		
		//the .get the specified element 
		System.out.println(l1.get(3));// prints 4
		
		//the .set element will trade out a specified element with the argument given
		l1.set(3, 3);
		System.out.println(l1);// prints [1, 2, 3, 3, 4, 5]
		
		//the .indexOf method will return the first occurrence of an element
		System.out.println("The first time we see 3 is at index of " + l1.indexOf(3));// prints 2
		
		//the .lastIndexOf method will return the last occurrence of an element
		System.out.println("The last time we see 3 is at index of " + l1.lastIndexOf(3));// prints 3
		
		//the .subList returns a List where you specify the first index and last index
		List<Integer> l3 = new ArrayList<Integer>();
		
		//here we sex the index at 1 and 4
		l3 = l1.subList(1, 4);
		System.out.println(l3);// prints [2, 3, 3]
		
	}

}
