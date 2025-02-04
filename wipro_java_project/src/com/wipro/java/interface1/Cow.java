/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Cow implements Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1=new Cow();
		animal1.makeSound();

	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("moww.. mowww...");
		
	}

}
