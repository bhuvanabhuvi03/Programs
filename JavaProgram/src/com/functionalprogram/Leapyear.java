/**
 * 
 * Purpose : Find out whether its leap year or not  
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * Here using Scanner class properties
 */
import java.util.Scanner;

public class Leapyear {
	/*
	 * find whether its leap or not
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in );
	int year; //initialise year
	
	System.out.println("enter the year");
	
	year=s.nextInt();//getting form user
	
	//call the utility method to find the leap year or not
	Utility.findleapyear(year);
	s.close();
}
} 