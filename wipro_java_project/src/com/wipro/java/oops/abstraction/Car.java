/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public abstract class Car {

	/**Demonstrating Abstraction in java
	 * 
	 */
	//Child classes using this method will not come to know about the other classes
	abstract void start();
	abstract void stop();
	abstract void forwardgear();
	abstract void reversegear();
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

}
