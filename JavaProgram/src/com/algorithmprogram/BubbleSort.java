/**
 * 
 * Purpose : bubble sort and find the elapsed time between search
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

public class BubbleSort {
	/*
	 * main method for find the elapsed time between soring process
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//initialize  the array of integer
	    int ar[]= {5,9,4,7,3,8,1,6};
	  //initialize the start time in  long form default package in java 
		long stt=System.currentTimeMillis();//start time taken in  long form default package in java

		Bubble bb=new Bubble();
		// call the sort method over here

		bb.bubblesortinteger(ar);
		//initialize the stop time 
		
		/*
		 * this iteration for display the sorted array
		 */
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}


		long sss=System.currentTimeMillis();//stop time taken in  long form default package in java
		//initialize elapsed time in between of start time to stop time

		long ep=sss-stt;
	  System.out.println(sss/1000+"   "+stt/1000+"lap time is"+ep);
	  System.out.println(); 
	  
	  //initialize the start time in  long form default package in java 

		long st1=System.currentTimeMillis();//start time taken in  long form default package in java

		//initialize  the array of string

		String st[]= {"bbbb","ffff","aaaa","qqqq","ssss","gggg","llll","wwww"};
		
		// call the sort method over here

		bb.bubblesortstring(st);
		/*
		 * this iteration for display the sorted array
		 */
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		long ss2=System.currentTimeMillis();//stop time taken in  long form default package in java
		//initialize elapsed time in between of start time to stop time
		long ep1=ss2-st1;
		System.out.println("lap time is"+ep);
		
s.close();
	}

}
