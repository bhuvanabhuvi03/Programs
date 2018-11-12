/**
 * 
 * Purpose : Banking system using Queue    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  27-10-2018
 *
 ********************************************************************/

package com.datastructure;
/*
 * here using scanner class properties
 */

import java.util.Scanner;

public class CashCounter {

	/*
	 * main method using for banking system 
	 */


		public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
   	     MyyQueue q=new MyyQueue(5);
	     int ch;
	     int n;
	     System.out.println("enter the no. of people in queue");
	     n=s.nextInt();
	     String accname[]=new String[n];//initialize the String array
	     int l=accname.length;
	     //System.out.println(l);
	     System.out.println("enter the list of name " +l);
	     for(int i=0;i<l;i++){
	    	 
	    	 accname[i]=s.next();
	    	 q.enqueue(accname[i]);
	     }
	    int d=n;
	    /*
	     * iterating of the customer to do what they want like withdraw and deposit
	     */
		
	    do
		{
			
			System.out.println("enter ur choice");
			System.out.println("1.deposit \n2.withdraw \n3.No of people \n 4.exit");
			ch=s.nextInt();
			/*
			 * switch case used for choose the option
			 *case 1 for withdraw
			 *case 2 for deposit
			 *case 3 for check the queue 
			 *
			 */
			switch(ch)
			{
			case 1:System.out.println("enter the amount to deposit");
			        int depositAmount=s.nextInt();
			        int depamount=q.bankacc(depositAmount,ch);
			        System.out.println("balance in bank  "+depamount);
			        d=n--;
			        q.dequeue();
			        break;
			case 2:System.out.println("enter the amount to withdraw");
			        int withdraw=s.nextInt();
			      
			      
			        int balance=q.bankacc(withdraw, ch);
			      System.out.println("remaining balance in bank  "+balance+"\n and your withdrawal money of yours is "+withdraw);
			        d=n--;
			        q.dequeue();
			        break;
			case 3:System.out.println("no of people in queue is "+q.issize());  
			         break;
			case 4:
				System.exit(0);
			}
		}while(ch<4);
	}

}
