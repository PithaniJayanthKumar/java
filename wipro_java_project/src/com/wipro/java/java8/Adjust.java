/**
 * 
 */
package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	/**
	 * @param args
	 */
	
	//Function to check the Date and Time
	//According to our requirements
	public static void checkingAdjusters() {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		System.out.println("The current date is " + date);
		
		//to get the first day of the month
		LocalDate dayofNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		
		System.out.println("FirstDayofNextMonth: " + dayofNextMonth);
		
		
		//get the next saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println("Next Saturday from now is "  + nextSaturday);
		
		//first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("FirstDayofMonth: " + firstDay);
		
		//Last day of the current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("LastDayofMonth: " + lastDay);
		
	}
	
	//Driver code
	public static void main(String a[]) {
		checkingAdjusters();
		
	}

}
