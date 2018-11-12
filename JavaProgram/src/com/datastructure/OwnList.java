/**
 * 
 * Purpose :     
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  30-10-2018
 *
 ********************************************************************/


package com.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class OwnList {
	   
	
   public static void main(String[] args) throws Exception {
   BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/Desktop/2d/unordered.txt"));
   String st="";
   OwnUorderedList own=new OwnUorderedList();
   Scanner s=new Scanner(System.in);
   String str;
   while((st=br.readLine())!=null) {
	  
	   String words[]=st.split(" ");
	   for(int i=0;i<words.length;i++) {
		   own.add(words[i]);
	   }
   }
   System.out.println(own);
   
     own.search("sowndar");
    System.out.println(own);
    
    own.search("hello");
    System.out.println(own);
   own.search("good");
   System.out.println(own);
    }

}



