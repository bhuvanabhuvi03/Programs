/**
 * 
 * Purpose :   find the prime number in between range 
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

public class Prime {
	/*
	 * 
	 *find the prime number in between range 
	 */
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=1000;// initialize the n value
	primeno p=new primeno();
	p.range(n);
	
	s.close();
}
}
