
package com.algorithmprogram;

public class AnagramPrime {
/**
 * 
 * @param a contains integer in the from of array
 */
public static void Anagramcheck(int[] a) {
	/*
	 *this iteration for passing a integer one by one   
	 */
	for(int i=0;i<a.length-1;i++) 
	{ 
		// initialize string and assign on it integer
	    String s=String.valueOf(a[i]); 
	    
		for(int j=i+1;j<a.length;j++) 
		{
			// initialize string and assign on it integer
			String s1=String.valueOf(a[j]);
			//System.out.println(a[j]);
		boolean b=	AnagramPrimeCheck.anaPri(s, s1);
		
		if(b==true) 
		{
			System.out.println(s+"and "+s1+"its is anagram");
			
		}
			
		}
	}
	
		
	
}
}
