package com.wipro.java.usecases;


import java.util.*;
public class FibonacciTreeMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner object for user input
		
		// Taking user input for 'n' (number of Fibonacci terms)
		System.out.println("Enter the number of Fibonacci terms: ");
		int  n = scanner.nextInt();
		
		
		TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();

		
		//Generating Fibonacci Sequence
		int first = 0, second = 1;
		for (int i = 1; i <= n; i++) {
			fibonacciMap.put(i, first);
			int next = first + second;
			first = second;
			second = next;
		}
		
		//Closing scanner
		scanner.close();
		
		// Displaying Fibonacci series stored in TreeMap
		System.out.println("Fibonacci Series stored in TreeMap:");
		System.out.println("position => fibonacci No.");
		for (Map.Entry<Integer, Integer> entry : fibonacciMap.entrySet()) {
			System.out.println(entry.getKey() + "	=>	" + entry.getValue());
		}
	} 

}
