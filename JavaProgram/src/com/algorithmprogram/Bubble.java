package com.algorithmprogram;

public class Bubble {
 /**
  * 
  * @param a
  * array contain array of integer 
  */
	void bubblesortinteger(int a[]) {
		/*
		 * passing var one by one
		 */
	  for(int i=0;i<a.length-1;i++)
	  {
		for(int j=0;j<a.length-i-1;j++)
		{
			/*
			 * check who is large one 
			 */
			if(a[j]>a[j+1]) 
			{
			  int t=a[j];
			  a[j]=a[j+1];//swap var 
			  a[j+1]=t;
		  }
		}
	  }
	  /*
	   * this iteration for display the sorted array
	   */
	  for(int i=0;i<a.length;i++) {
		  System.out.print(a[i]);
	  }
	  
  }
	/**
	 * 
	 * @param s
	 * array contain array of string
	 */
  void bubblesortstring(String s[]) {
	  /*
		 * passing var one by one
		 */

	  for(int i=0;i<s.length-1;i++) {
		  
			for(int j=0;j<s.length-i-1;j++)
			/*
			 * compare to function is using calculate the ascii value of the given string
			 *if it's larger it will swap  
			 */
				if(s[j].compareTo(s[j+1])>0) {
				  String t=s[j];
				  s[j]=s[j+1];
				  s[j+1]=t;
			  }
			
		  }
		 
  }
}
