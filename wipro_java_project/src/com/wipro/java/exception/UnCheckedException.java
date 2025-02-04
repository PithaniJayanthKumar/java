/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class UnCheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] =null;
			System.out.println(a.length);
			
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
