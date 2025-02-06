/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

/**
 * 
 */
public class Collections{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50};
		//
		// 1.Array 
		System.out.println("Array Elements:");
		for (int num : arr) {
			System.out.print(num + " ");
			
		
		}
		System.out.println("\n");
		System.out.println("----------------------------------------");
		
		
		// 2. ArrayList
		List<Integer> l1=new ArrayList<Integer>();
		// adding elements to the array
		l1.add(22);
		l1.add(24);
		l1.add(25);
		l1.add(26);
		System.out.println("ArrayList Elements:");
		System.out.println(l1); //prints the ArrayList containing 4 Elements
		
		//removing an element from arraylist
		l1.remove(2);
		
		//prints the ArrayList with 3 elements after removing
		//2nd indexed element - 25
		System.out.println("ArrayList After removing 2nd indexed element:" + l1);
																	
		//setting the value to 99 at index 3
		l1.set(1, 99);
		//changes the 1rd index element to 99
		System.out.println("ArrayList After setting 1st index element:" + l1);
		System.out.println("----------------------------------------");

		
		
		//3.LinkedList
		List<Integer> l2 = new LinkedList<Integer>(l1);
		//adding elements to the LinkedList
		l2.add(100);
		l2.add(200);
		l2.add(300);
		System.out.println("\nLinkedList elements:");
		System.out.println(l2);
		
		//removing  an element from the LinkedList
		l2.remove(1);
		System.out.println("LinkedList After removing element:" + l2);
		System.out.println("----------------------------------------");

		
		//4.HashMap 
		//Creating a HashMap where Integer is the key and the String is the value
		Map<Integer, String> map = new HashMap<>();
		//Adding the key-value pairs to the map
		map.put(1, "BMW");
		map.put(3, "R15");
		map.put(4, "RE");
		map.put(2, "GT 650");
		map.put(5, "Himalayan");
		
		System.out.println("\nHashMap Elements:");
		//iterating over the map using for loop 
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
			
		}
		
		//Accessing Values by keys
		System.out.println(map.get(2) + " is the Dream Bike for Me");
		
		
		//Removing an element from HashMap
		map.remove(1);
		System.out.println("HashMap after removing key 1: ");
		System.out.println(map);
		
		
	}

}
