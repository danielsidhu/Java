package com.demo.collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	/*
	 * LinkedHashSet implements the Set Interface, maintains the insertion order so the order is based upon how they were added
	 * It doesn't allow for duplicates but null values are allowed
	 */
	public static void main(String []args) {
		
		//Creating the LinkHashSet
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		
		//using the add() to add elements
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");
		lhset.add("FGH");
		System.out.println(lhset);//prints [Z, PQ, N, O, KK, FGH]
		
		//creating another LinkedHashSet with integer as the type
		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
		
		//adding the elements
		lhset2.add(99);
		lhset2.add(7);
		lhset2.add(0);
		lhset2.add(67);
		lhset2.add(89);
		lhset2.add(66);
		lhset2.add(null);
		System.out.println(lhset2);//prints [99, 7, 0, 67, 89, 66]
		
	}

}
