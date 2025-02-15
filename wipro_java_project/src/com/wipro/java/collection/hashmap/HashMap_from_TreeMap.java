package com.wipro.java.collection.hashmap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMap_from_TreeMap {
	 public static void main(String[] args) {

		    // create a treemap
		    TreeMap<String, Integer> evenNumbers = new TreeMap<>();
		    evenNumbers.put("Two", 2);
		    evenNumbers.put("Four", 4);
		    evenNumbers.put("Alpha", 6);
		    System.out.println("TreeMap: " + evenNumbers);
		    
		    TreeSet<Integer> number = new TreeSet<>();
		    number.add(3);
		    number.add(1);
		    number.add(10);
		    System.out.println("TreeSet:" + number);
		    
		    
		    

		    // create hashmap from the treemap
		    HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
		    numbers.put("Three", 3);
		    System.out.println("HashMap: " + numbers);
		  }

	
}
