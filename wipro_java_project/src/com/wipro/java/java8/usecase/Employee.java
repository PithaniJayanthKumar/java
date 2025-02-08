package com.wipro.java.java8.usecase;

import java.time.LocalDate;


//Private properties of Employee class
public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	private LocalDate joiningDate;
	
	
	/**
	 * @param id
	 * @param name
	 * @param department
	 * @param salary
	 * @param joiningDate
	 */
	// Parameterized class
	public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	//Getters and Setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the joiningDate
	 */
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	
	//toString method to print all the details of employee 
	@Override
	public String toString() {
		return "Employee { " + "ID=" + id + ", Name='" + name + '\'' +
		", Dept='" + department + '\'' + ", Salary=" + salary +
		", JoiningDate=" + joiningDate + " }";
	}

}
