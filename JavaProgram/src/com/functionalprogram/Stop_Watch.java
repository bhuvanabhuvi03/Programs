/**
 * 
 * Purpose :  Stopwatch Program for measuring the time that elapses between
the start and end clicks 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;

/*
 * 
 *Here we using Scanner class properties 
 * 
 */
 
import java.util.Scanner;

public class Stop_Watch {
	

	
	
	
	
public static void main(String[] args) {
	/*
	 * here we calculate in time between lap
	 */
	Scanner s=new Scanner(System.in);
	/*
	 * start function call 
	 * for getting start time
	 */
	
	double st=Utility.start();
	/**
	 * str is used to stop the watch
	 * if you you enter any key stop the time
	 */
	
	
	System.out.println("enter any button to stop");
	String str=s.nextLine();
	/*
	 * if -condition is used to stop the watch
	 * here calculate lap time in between the lap
	 */
	if(true) {
		double stt=Utility.stop();
	
	double lap=stt-st;
	/*
	 * print the lap time in milli sec
	 */
	System.out.println(stt+ "  "+st);
	System.out.println(lap/1000);
}
	s.close();
	}
}
