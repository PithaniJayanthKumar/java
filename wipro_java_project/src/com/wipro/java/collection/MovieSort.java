/**
 * 
 */
package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a list of movies
		ArrayList<Movie> l = new ArrayList<>();
		l.add(new Movie("Star Wars", 8.7, 1977));
		l.add(new Movie("Empire Strike", 8.8, 1980));
		l.add(new Movie("Return of the jedi", 8.4, 1983));
		
		
		//Sort movies by Comparable's
		//compareTo method by year
		Collections.sort(l);
		
		//display the sorted list of movies
		System.out.println("Moviesafter sorting by year:");
		for (Movie m : l) {
			System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
		}
		
	
	}

}
