package com.wipro.java.oops.polymorphism;

public class Audi extends Car {

	public Audi() {
		// TODO Auto-generated constructor stub
	}
	
	public void modelname() 
	//polymorphism having same modelname method in different classes
	{
		System.out.println("this is a Audi car");
	}
	public static void main(String a[]) {
		Audi audi=new Audi();
		audi.modelname();
		
	}

}
