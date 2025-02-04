/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class Checked_UnCheckedExceptions {


	public static void main(String a[]) {
		// TODO Auto-generated method stub
		
		
		try {
			File file=new File("wrong path");
			FileReader reader = new FileReader(file);
			
		}
		catch(IOException e){
			System.out.println(e.getStackTrace());
			
		}
		
		
		try {
			String str =null;
			System.out.println(str.length());
			
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
			
		}
	}

}
