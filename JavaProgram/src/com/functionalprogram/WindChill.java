/**
 * 
 * Purpose : find the chillness of the weather of air
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

public class WindChill {
	/*
	 * find the chillness of the weather of air 
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double t;
	System.out.println("enter the temperture (in Fahrenheit)");
	
	t=s.nextDouble();   //temperature t (in Fahrenheit) 
	double v;
	System.out.println("enter the wind spped ");
	v=s.nextDouble(); //he   wind speed v (in miles per hour)
Utility.windchill(t, v);
	s.close();
}
}
