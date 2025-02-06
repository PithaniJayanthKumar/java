/**
 * 
 */
package com.wipro.java.java8;

interface TestInterface1{
	//default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
	
}

interface TestInterface2{
	
	//Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}



//Implementation of class code
class DefaultUseCase implements TestInterface1, TestInterface2 {
	
	
	public void show() {
		
		//use super keyword to call the show
		//method of TestInterface1 interface
		TestInterface1.super.show();
		
		//use super keyword to call the show method
		//of TestInterface2 interface
		TestInterface2.super.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultUseCase d = new DefaultUseCase();
		d.show();

	}

}
