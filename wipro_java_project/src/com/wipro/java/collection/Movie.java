/**
 * 
 */
package com.wipro.java.collection;

//Movie class implements Comparable interface to define default String
class Movie implements Comparable<Movie> {
	
	
	
	private String n;
	private double r;
	private int y;

	

	/**
	 *
	 * @param n
	 * @param r
	 * @param y
	 */
	public Movie(String n, double r, int y) {
		super();
		this.n = n;
		this.r = r;
		this.y = y;
	}

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.y - m.y;
	}
	/**
	 * @return the n
	 */
	public String getName() {
		return n;
	}

	/**
	 * @return the r
	 */
	public double getRating() {
		return r;
	}

	/**
	 * @return the y
	 */
	public int getYear() {
		return y;
	}
	
	
}
