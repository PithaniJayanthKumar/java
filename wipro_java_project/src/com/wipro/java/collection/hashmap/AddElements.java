package com.wipro.java.collection.hashmap;

import java.util.HashMap;

public class AddElements {
	public static void main(String[] args) {
		
		//creating a hashmap
		HashMap<String, Integer> numbers= new HashMap<>();
		
		
		System.out.println("Initial HashMap: " + numbers);
		
		//put() method to add elements
		numbers.put("one", 1);
		numbers.put("two", 5);
		numbers.put("three", 3);
		numbers.put("four",null );
		numbers.put("six", 1);
		System.out.println("HashMap after put(): " + numbers);
		
		
		
	}

}
