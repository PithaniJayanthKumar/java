/**
 * 
 */
package com.wipro.java.interface1;

/**
 * 
 */
public class Dog implements Animal {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		animal.makeSound();

	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Barks");
		
	}

}
