package com.algorithmprogram;

public class inSearch {
	/**
	 * 
	 * @param a array of integer
	 * @param f first element
	 * @param l last element
	 * @param n key to finf
	 */
static void searchint(int a[],int f,int l,int n){
int flag=0;
/*
 * first element is less than or equal to last element
 * loop will terminate
 */
	while(f<=l) {
		
	int mid=(f+l)/2;//initialize the middle & find the middle element 
/*
 * if mid element is equal to search element 
 *that element is search element
 */
	if(a[mid]==n) {
		System.out.println("element is found   "+n);
		flag=1;
		break;
	}
	/*
	 * search element is greater than middle element 
	 * and search right side
	 */
	
	else if(a[mid]>n) {
		l=mid-1;
		
	}
	/*
	 * search element is lesser than middle element 
	 * and search left side
	 */
	else if(a[mid]<n) {
		f=mid+1;
	}
}	if(flag==0) {
	System.out.println("element is not found");
}

	/*
	 * otherwise your search element not in the array
	 */

}
/**
 * 
 * @param s array contain string
 * @param key search key
 * @param low first element  in the array
 * @param last last element in the array
 * @return
 */
static public int searchstr(String s[],String key,int low,int last ) {
	/*
	 * first element is less than or equal to last element
	 * loop will terminate
	 */int flag=0;
	while(low<=last) {
		int mid=(low+last)/2;//initialize the middle & find the middle element
		/*
		 * if mid element is equal to search element 
		 * that element is search element
		 */

		if(s[mid].compareTo(key)==0) {
			System.out.println("elemt found  "+key+"  at the index"+mid);
			flag=1;
			break;
		} 
		/*
		 * search element is greater than middle element 
		 * and search right side
		 */
		else if(s[mid].compareTo(key)>0) {
			last=mid-1;
		}
		/*
		 * search element is lesser than middle element 
		 * and search left side
		 */
		else if(s[mid].compareTo(key)<0) {
			low=mid+1;
		}
	
	}
	if(flag==0)
	{
		System.out.println("element is not found");
	}
	return 1;
}
}
