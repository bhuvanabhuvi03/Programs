/**
 * 
 * Purpose : One Output is  number of distinct  triplets as well as the second output is to 
 *print the distinct triplets. 
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

public class Zero {
	/*
	 * what are the index value added the result must be zero 
	 */
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
   int size;// initialize the size of the array
   System.out.println("enter the number of element in array");
   size=s.nextInt();// getting input form user
Utility.Zero(size);
	s.close();
}
}
