package com.wipro.java.collection;

class Movie1 {
	private String n; //Movie name
	private double r; //movie rating
	private int y;    //movie year
	
	
	/**
	 * @param n
	 * @param r
	 * @param y
	 */
	//constructor to initialize the movie details
	public Movie1(String n, double r, int y) {
		super();
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	/**
	 * @return the n
	 */
	public String getN() {
		return n;
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

}
