package com.wipro.java.oops.polymorphism;

public class MahindraThar extends Car{

	public MahindraThar() {
		// TODO Auto-generated constructor stub
	}
	
	public void modelname() {
		System.out.println("this is MahindraThar car");
	}
	
	public static void main() {
		
		MahindraThar mahindra=new MahindraThar();
		mahindra.modelname();
	}
	
	
}
