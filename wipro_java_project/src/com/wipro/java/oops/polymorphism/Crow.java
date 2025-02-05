/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
//child Class
public class Crow extends Bird {

	/**
	 * 
	 */
	public Crow() {
		// TODO Auto-generated constructor stub
	}
	
	public void makeSound() {
		System.out.println("Crow caww caww");
	}

	/**
	 * @param args
	 */
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		//parent class reference
		Bird mybird =new Parrot();//parent object assign
		mybird.makeSound();
		
		Bird bird =new Crow();//crow object assign
		bird.makeSound();

	}

}
