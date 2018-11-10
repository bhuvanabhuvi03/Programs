/**
 * 
 * Purpose : Guess the number   
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  25-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;

import java.util.Scanner;

public class Quess {
	/**
	 * 
	 * @param num power of 2
	 * @boolean in the form of true or false
	 */
	static boolean pow(int num) {
		int a=1;
		for(int i=0;i<=32;i++) {
			a=a*2;
		if(num==a) {
			return false;
		}
		}
		return true;
	}
	/*
	 * find the guess number 
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num;// initialize the number
	boolean b=true;
	System.out.println("enter the to range \n number must be in power of 2");
	int aa=0;
	do{
		num=s.nextInt();
		b=pow(num);
		aa=num;
		if(b==true)
		   System.out.println("plz enter the number power of 2");

	}while(b!=false) ;
	int a[]=new int[aa];
	if(b==false) {
		/*
		 * assign the element in the array 
		 */
		for(int i=0;i<a.length;i++) {
	  	a[i]=i;
	}
//	    System.out.println("enter to num");
	//    int n=s.nextInt();
	    //call the method to find the guessed number
	 //   inSearch.search(a, 0, a.length, n);
	    GuessBinary.find(a);
    }
s.close();
}
}
