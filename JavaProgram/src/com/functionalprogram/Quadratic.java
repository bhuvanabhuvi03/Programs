/**
 * 
 * Purpose : find prime factor given quadratic equation
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  19-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 * Here using Scanner class properties
 */
import java.util.Scanner;

public class Quadratic {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double a; //initialize a value
	double b; //initialize b value
	double c; //initialize c value
	double sq; //initialize sq value
	double delta; //initialize delta value
	System.out.println("enter a,b and c values");
	a=s.nextDouble();//getting input form user
	b=s.nextDouble();//getting input form user
	c=s.nextDouble();//getting input form user
	System.out.println(a+"x*x+"+b+"x+"+c);
	delta=(b*b)-4*(a*c);
	System.out.println(delta);
	double root1,root2;
	sq=Math.sqrt(delta);//math.sqrt is used to square root of delta
	root1=(-b+sq)/(2*a);
	root2=(-b-sq)/(2*a);
	System.out.println("root1  "+root1);
	System.out.println("root2"+root2);
s.close();
}
}
