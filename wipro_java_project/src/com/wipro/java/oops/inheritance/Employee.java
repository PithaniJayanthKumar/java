/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 */
public class Employee {

	/**
	 * 
	 */
	private int empid;// specifies the empid
	private String name;// name of the employee
	private int salary;//how much salary did this employee get
	private String designation;//what is the designation of the employee
	
	
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}

	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
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
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
