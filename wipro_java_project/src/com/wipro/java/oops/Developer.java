package com.wipro.java.oops;


/** 
 * parent class equals to Employee
 * child class equals to Manager
 * extends is a keyword
 * 
 */

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
		
		// Child object is instantiated from child constructor
		//Parent Class consumes the properties and behaviors of child class
		Employee employee=new Developer();
		employee.setEmpid(1222);
		employee.setName("naveen");
		employee.setDesignation("sr.Developer");
		employee.setSalary(150000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}

}
