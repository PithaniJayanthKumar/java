/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {

	/**
	 * 
	 */
	int num=5;
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void changeValue(int num) {
		this.num = num;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass(); //Creating an object for myClass
		obj.changeValue(10); //Reinitializing the value of num
		System.out.println(obj.num);//print the num value

	}

}
