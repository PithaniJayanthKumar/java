/**
 * 
 */
package com.wipro.java.oops.encapsulation;

/**
 * 
 */
public class Animal {
	
	/**
	 * 
	 */
	private String species;
	private String food;
	int age;
	

	/**
	 * @param species
	 * @param food
	 * @param age
	 */
	public Animal(String species, String food, int age) {
		super();
		this.species = species;
		this.food = food;
		this.age = age;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}


	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}


	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}


	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age>0) {
			this.age = age;
		}
		else
			System.out.println("Age must be positive");
	}


	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Animal animal=new Animal("Lion","Meat",15);
		System.out.println(animal.getSpecies());
		System.out.println(animal.getFood());
		System.out.println(animal.getAge());
		
		animal.setAge(24);
		System.out.println(animal.getSpecies());
		System.out.println(animal.getFood());
		System.out.println(animal.getAge());
		
		animal.setAge(-7);
		animal.setAge(0);
		
		

	}

}
