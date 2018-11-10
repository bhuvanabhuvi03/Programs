/**
 * 
 * Purpose : search element in the file   
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  25-10-2018
 *
 ********************************************************************/
package com.algorithmprogram;
/*
 * here using scanner class properties
 * filereader class for reading a file from location
 *Buffered reader for read the content of the line by line
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearchFile {
	static Scanner s=new Scanner(System.in);

public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/test.txt"));
	//FileReader f=new FileReader("/home/bridgeit/Desktop/2d/test.txt");
	String str="";//initialize the string as empty
	//String a[]=new String[200];//initialize the array 
	/*
	 * reading all the line in the file
	 */
	while((str=br.readLine())!=null) {

	String a[]=str.split(" ");//spilt by space
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println();
	System.out.println("sort list is");
sortstring(a);
break;
	}
	//call the sort method
	//Sortt.sortString(a);
	
	
	
	
	
	
	
	
}
public static void sortstring(String a[]) {

	String temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i].compareTo(a[j])>0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	
		
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	String str1;//initialize the string
	System.out.println("enter the string to search");
	str1=s.nextLine();//getting form user
	//call the method to search

		inSearch.searchstr(a,str1,0,a.length-1);

}


}
