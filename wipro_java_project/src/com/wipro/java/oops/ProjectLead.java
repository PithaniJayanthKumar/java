package com.wipro.java.oops;


/** 
 * parent class equals to Employee
 * child class equals to Manager
 * extends is a keyword
 * 
 */

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
		
		// Child object is instantiated from child constructor
		//Parent Class consumes the properties and behaviors of child class
		Employee employee=new ProjectLead();
		employee.setEmpid(1269);
		employee.setName("prasanth");
		employee.setDesignation("jr.ProjectLead");
		employee.setSalary(170000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}

}
