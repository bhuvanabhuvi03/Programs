/**
 * 
 * Purpose : find the elapsed time between insertion sort
 *  
 * @author sowndara perumal
 * @version 1.2
 * @Since  23-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 *Here we using Scanner class properties 
 * 
 */
import java.util.Scanner;
/*
 * main method for find the elapsed time between sorting process
 */
public class insertionSort {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//initialize  the array of integer

	int arrin[]= {5,9,4,7,3,8,1,6};
	//initialize  the array of string

	String stin[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
	Sortt ss=new Sortt();
	//initialize the start time in  long form default package in java 

	long starttime=System.nanoTime();//start time taken in  long form default package in java
	// call the sort method over here

	ss.sortint(arrin);
	/*
	 * display the method
	 */
	int n = arrin.length; 
	for (int i=0; i<n; ++i) 
	           System.out.println(arrin[i] + " ");
	
	//initialize the stop time 
	long stoptime=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	long epin=stoptime-starttime;
	System.out.println(stoptime/1000+"   "+starttime/1000+"lap time is"+epin);
	System.out.println(); 
	
	//initialize the start time in  long form default package in java 

	long sti=System.nanoTime();//start time taken in  long form default package in java

	// call the sort method over here

	ss.sortString(stin);
	int a = arrin.length; 
	/*
	 * display the method
	 */
	for (int i=0; i<a; ++i) 
	           System.out.println(stin[i] + " ");
	System.out.println();
	//initialize the stop time in  long form default package in java 

	long ssin=System.nanoTime();//stop time taken in  long form default package in java
	//initialize elapsed time in between of start time to stop time

	long epi=ssin-sti;
	System.out.println("lap time is"+epi);
s.close();
	        }
}
