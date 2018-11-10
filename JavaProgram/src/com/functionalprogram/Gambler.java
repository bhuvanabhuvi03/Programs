/**
 * 
 * Purpose : Program for Gambler 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
import java.util.Scanner;
/*
 * Here using Scanner class properties 
 */
public class Gambler {
	/**
	 * In this Gambler program
	 * return 
	 * @Percentage of win
	 * @Percentage of loss
	 * 
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);

	double ntime;     //initialize the number time can play one day
	
	
	System.out.println("enter the no of time to play one day");
	ntime=s.nextInt(); //getting form user
	Utility.Gambler(ntime);
	
s.close();
}
}
