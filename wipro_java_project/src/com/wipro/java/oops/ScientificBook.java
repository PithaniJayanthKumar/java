/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class ScientificBook extends Library {
	private int id;
	
	/**
	 * @param title
	 * @param author
	 * @param id
	 */
	public ScientificBook(String title, String author, int id) {
		super(title, author);
		this.id = id;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("Book ID: "+ getId());
		System.out.println("title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("--------------------------");
		
	}

}
