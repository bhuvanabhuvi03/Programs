/**
 * 
 * Purpose :    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  5-11-2018
 *
 ********************************************************************/


package com.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class OrderListInt {
	public static void main(String[] args) throws Exception {
		 BufferedReader b=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/o.txt"));
		 OwnOrderList1 ow=new OwnOrderList1();   
		 Scanner s=new Scanner(System.in);
		 String st1;
		 int ar[];
		 /*
		  * read the sentence form file
		  * spilt the sentence into word by word
		  * store the element in the array
		  */
		    while((st1=b.readLine())!=null) {
		    	String w1[]=st1.split(",");//initialize the array
		    	ar=new int[w1.length];
		    	for(int i=0;i<w1.length;i++) {
		    		
		    		ar[i]=Integer.parseInt(w1[i]); 
		    		ow.add(ar[i]);
		    	}
}
		    
		    System.out.println(ow);
		    System.out.println("enter the search element ");
		    ow.search(s.nextInt()); 
          System.out.println(ow);
             System.out.println("enter the search element "); 
              ow.search(s.nextInt());
              System.out.println(ow);
              System.out.println("enter the search element ");
              ow.search(s.nextInt());
          System.out.println(ow);
	}}
