/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class ExceptionExample {
	
	//it is accessible by all the instances of a class
	//memory or storage is allocated once and remains unless it is empty
	static  int i = 6;//it has class level declaration
	/**
	 * @param args
	 */
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		int num1=9, num2=0, value;
		try {
			value = num1/num2;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			
		}
		//block that acts as a flag to check where we are presently executing
		//it will always executed
		finally {
			System.out.println("I am always Executed");
		}
		//from here onwards the remaining code will be executes
		System.out.println("rest of the code");
	}	

}
