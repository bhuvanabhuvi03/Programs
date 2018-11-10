package com.algorithmprogram;

 public class Sortt {
	 /**
	  * 
	  * @param a
	  * array contain array of integer 
	  */
static public void sortint(int a[]){

	int l=a.length;//initialize length  
	/*this iteration
	 * passing var one by one
	 */

	for(int i=1	;i<l;i++) {
		int key=a[i];//initialize the element in the key
		int j=i-1;
		while(j>=0&&a[j]>key) {
			a[j+1]=a[j];//swap the var
			j=j-1;
		}
		a[j+1]=key;//again the swap
		
	}}
/**
 * 
 * @param s
 * array contain array of string
 */
	static public void sortString(String s[]) {
		

		int l=s.length;//initialize length  
		/*this iteration
		 * passing var one by one
		 */
		

		for(int i=1	;i<l;i++) {
			String key=s[i];//initialize the element in the key
			int j=i-1;
			while(j>=0&&s[j].compareTo(key)>0) {
			  s[j+1]=s[j];//swap the var
				j=j-1;
			}
			s[j+1]=key;//again the swap
			
			
		}
			}
	static public void sortd(double a[]){

		int l=a.length;//initialize length  
		/*this iteration
		 * passing var one by one
		 */

		for(int i=1	;i<l;i++) {
			double key=a[i];//initialize the element in the key
			int j=i-1;
			while(j>=0&&a[j]>key) {
				a[j+1]=a[j];//swap the var
				j=j-1;
			}
			a[j+1]=key;//again the swap
			
		}}
	
	
}
