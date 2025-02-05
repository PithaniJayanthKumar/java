/**
 * 
 */
package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class MapImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a HashMap where Integer is the key and the String is the value
		Map<Integer, String> map = new HashMap<>();
		
		
		//Adding key-value pairs to the map
		map.put(1,  "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		//Accessing values by keys
		System.out.println("key 1: " + map.get(1)); //Output Apple
		System.out.println("key 2: " + map.get(2)); //output Banana
		
		//checking if a key exists in the map
		if (map.containsKey(3)) {
			System.out.println("key 3 exists withvalue: " + map.get(3)); //output: Cherry
		}
		
		//iterating over the map using for-each loop
		System.out.println("\nIterating through the map");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		
		}
		
		//Removing a key-value pair
		map.remove(2);// removes the key 2 and the associated value
		
		//Display the map after removal
		System.out.println("\nMap after removal of key 2");
		for (Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		

	}

}
