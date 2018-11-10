/**
 * 
 * Purpose : Replace the given String to the exact place.  
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;

/*
 *Here we using Scanner class properties 
 * 
 */

import java.util.Scanner;

public class Replace_String {
/*
 * main function is used to replace string 
 *mentioned place 
 * 
 */
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	/**
	 * str is string variable to store the string value
	 */
	System.out.println("hello<<username>>,How are you!!");

	String str=s.nextLine();
	/*
	 * if -condition checks entered string range more than 3
	 */

	if(str.length()>=3) {
		System.out.println("hello  "+str+",How are you!!");
	}
	/*
	 * else statement help to print invaild range
	 */
	else {
		System.out.println("invalid charater length");
	}
	s.close();
}
}
