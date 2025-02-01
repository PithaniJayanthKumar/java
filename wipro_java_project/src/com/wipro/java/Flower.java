/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	String colourValue;
	int priceValue;
	
	Flower(String colour, int price){
		this.colourValue=colour;
		this.priceValue=price;
		
	}
	
	void display() {
		System.out.println("Flower colour:"+colourValue+"Flower price:"+priceValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flowerobject1=new Flower("redrose",50);
		Flower flowerobject2=new Flower("blackrose",100);
		flowerobject1.display();
		flowerobject2.display();
		

	}

}
