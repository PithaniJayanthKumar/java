/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating two lists
		List<Integer> l1 =new ArrayList<Integer>();
		
		// Adding values to the list in 2 Types
		// By using indexing
		// Without using Indexing
		
		// We can add the values by using indexing 
		// adding value by using indexing is not mandatory
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,3);
		
		
		List<Integer> l2 = new ArrayList<Integer>();
		
		
		// we can add the values without using the index
		l2.add(2);
		l2.add(4);
		l2.add(6);
		l2.add(8);
		
		System.out.println(l1);
		
		System.out.println(l2);
		
		
		// Adding all the elements at index 1
		l1.addAll(1,l2);
		System.out.println(l1);
		
		// Removing the element at index 1
		l1.remove(1);
		System.out.println(l1);
		
		// Setting index 0 to value 5
		l1.set(0, 5);
		System.out.println(l1);
		
		

	}

}
