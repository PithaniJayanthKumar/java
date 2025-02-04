/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class CheckedException {

	public static void main(String a[]) {
		int num1= 100, num2=0, result;
		
		try {
			result = num1/num2;
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getStackTrace());
			
		}
	}

}
