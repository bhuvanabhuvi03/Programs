/**
 * 
 * Purpose : Binary conversion
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  24-10-2018
 *
 ********************************************************************/

import java.util.Scanner;

public class Utility {
	/*
	 * main method for convert the decimal to binary
	 */

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int dec;//initialize the  decimal
		System.out.println("enter the dec number");
		dec=s.nextInt();//getting the input user
		//call the method
		Padding.binary(dec);
s.close();
	}
}
