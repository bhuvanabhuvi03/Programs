/**
 * 
 * Purpose : The   Two   Strings   are   Anagram   or   not...
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  22-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;

public class Anagram {
	/*
	 * Detecting two string are anagram
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	checkAnagram c=new checkAnagram();
	String str1; //initialize the first string 
	String str2; //initialize the second string
	System.out.println("enter first word");
	str1=s.nextLine(); //getting input form user
	System.out.println("enter second word");
	str2=s.nextLine();//getting the second form user
	
	
	boolean b=c.check(str1,str2);
/*
 * if boolean b is true it is anagram
 */
	if(b==true) {
	System.out.println("its is anagram");
	
}else {
	System.out.println("its not an anagram");
}
	s.close();
}
}
