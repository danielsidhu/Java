package com.danielsidhu;

public class Loops {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello World " + i);
//		}
//		
//		int j = 5;
//		
//		while (j>0) {
//			System.out.println("Hello World " + j);
//			j--;
//		}
		
//		String[] array = {"cat", "dog", "apple", "bears"};
//		System.out.println(array[1]);
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("In row " + i + " is : " + array[i]);
//		}
		
		int number = 5;
		int[] array = {1, 2, 3, 4, 5};
		int[][] array2 = {
				{1, 2, 6, 8},
				{3, 7, 9, 2}
		};
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
