/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */
public class Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declared an array of integers
		int [] arr;
		
		//allocating memory for 5 integers
		arr = new int[5]; //0,1,2,3,4;
		
		
		//initializing first element of the array
		arr[0] = 10;
		
		//initializing second element of the array
		arr[1] = 15;
		
		//and so on ....
		arr[2] = 20;
		arr[3] = 25;
		
		//accessing the elements of the array
		//0 - (n-1) index , n = size of the array
		for(int i = 0; i < arr.length; i++)
			System.out.println("Element at index" + i + ":" + arr[i]);

	}

}
