/**
 * 
 * Purpose : Calculate the factor of the given number 
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * here using Scanner class  properties
 */
import java.util.Scanner;

public class Factor {
	/**
	 * factor for given number
	 * 
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num; //initialize the number 
	System.out.println("enter the to factor");
	num=s.nextInt();
	Utility.factor(num);
s.close();
}
}
