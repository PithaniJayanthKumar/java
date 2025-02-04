/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Magazine extends Library {
	private String issueDate;
	
	/**
	 * @param title
	 * @param author
	 * @param issueDate
	 */
	public Magazine(String title, String author, String issueDate) {
		super(title, author);
		this.issueDate = issueDate;
	}

	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("IssueDate: " + getIssueDate());
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		ScientificBook book = new ScientificBook("On Growth", "hawking", 269);
		book.viewDetails();
		
		Magazine magazine = new Magazine("Tech Monthly", "Jane smith","feb 2020");
		magazine.viewDetails();

	}

	

}
