/**
 * 
 */
package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;
/**
 * 
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				//Size of the LinkedList
				int n = 5;
				
				//Declaring a list with initial size n
				List<Integer> l1 = new LinkedList<Integer>();
				
				
				//appending the new elements at the end of the list
				for (int i = 1; i <= n; i++)
					l1.add(i); //1,2,3,4;
				
				//printing the new elements
				System.out.println(l1);
				
				//remove element at index 3
				l1.remove(3);
				
				//displaying the list after deletion
				System.out.println(l1);
				
				
				//printing elements one by one 
				for (int i = 0; i < l1.size(); i++)
					System.out.println(l1.get(i) + " ");
				

			}

	


	}

