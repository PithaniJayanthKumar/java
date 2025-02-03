/**
 * 
 */
package com.wipro.java.oops;

/**No Constructor
 * Getters have return value
 * Setters have no return value
 * Properties are determined using private fields
 * Values are Behavior are determined through Setters 
 * toString will convert entire animal class with properties and behaviors
 */
public class Animal {

	/**
	 * 
	 */
	// private properties=structure
	private String name; // specifies the name of the animal
	private String behaviour;// shows the behaviour of the animal
	private int legs; // how many the animal have
	private String colour;// what is the most identified color
	
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the behaviour
	 */
	public String getBehaviour() {
		return behaviour;
	}

	/**
	 * @param behaviour the behaviour to set
	 */
	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	/**
	 * @return the legs
	 */
	public int getLegs() {
		return legs;
	}

	/**
	 * @param legs the legs to set
	 */
	public void setLegs(int legs) {
		this.legs = legs;
	}

	/**
	 * @return the color
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the color to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
