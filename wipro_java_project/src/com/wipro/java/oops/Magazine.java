/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
//Another child class
public class Magazine extends Library {
	private String issueDate;
	
	/**
	 * @param title
	 * @param author
	 * @param issueDate
	 */
	//constructor
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
	//polymorphism : overriding the abstract method
	public void viewDetails() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("IssueDate: " + getIssueDate());
		
	}
	
	/**
	 * @param args
	 */
	//this class demonstrates polymorphism in action
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		ScientificBook book = new ScientificBook("On Growth", "hawking", 269);//creating objects of child classes
		book.viewDetails();//polymorphism 
		
		Magazine magazine = new Magazine("Tech Monthly", "Jane smith","feb 2020");
		magazine.viewDetails();//polymorphism

	}

	

}
