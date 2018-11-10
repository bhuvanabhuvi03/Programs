/**
 * 
 * Purpose : Find out whether its leap year or not  
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  20 -10-2018
 *
 ********************************************0************************/
package com.functionalprogram;
/*\
 * Here using Scanner properties
 */
import java.util.Scanner;

public class Permutation {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s.next(); //permutation string
	//call permutation method

	Utility.permutationOfString(str.toCharArray(),0);//spilt the character by character by using tochararray method
s.close();
}
}
