/**
 * 
 */
package com.wipro.java.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 */
// Comparator to sort movie by Year
class Year implements Comparator<Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {
		
		// Sorting by year
		return Integer.compare(m1.getY(),m1.getY());
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Star Wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strike", 8.8, 1980));
		m1.add(new Movie1("Return of the jedi", 8.4, 1983));
		
		
		//Sorting movies by year and Displaying all
		Collections.sort(m1, new Year());
		
		System.out.println("\nMovies after sorting by Year:");
		for (Movie1 m : m1) {
			System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
		}

}
}
