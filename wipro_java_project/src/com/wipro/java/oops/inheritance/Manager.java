package com.wipro.java.oops.inheritance;

/** 
 * parent class is equals to Employee
 * child class is equals to Manager
 * extends is a keyword
 * 
 */
public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		
		// Child object is instantiated from child constructor
		//Parent Class consumes the properties and behaviors of child class
		Employee employee=new Manager();
		employee.setEmpid(1213);
		employee.setName("Jayanthkumar");
		employee.setDesignation("sr.Manager");
		employee.setSalary(200000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}
	

}
