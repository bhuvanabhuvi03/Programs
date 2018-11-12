package com.datastructure;

import java.util.Scanner;

public class BalanceParathesis {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String exp;
	System.out.println("enter the expression");
	exp=s.nextLine();
	MyStack my=new MyStack();
	Bal bb=new Bal(10);
	int flag=0;
	char ch[]=exp.toCharArray();
	for(int i=0;i<exp.length();i++) {
		if(ch[i]=='(' || ch[i] == '{' || ch[i]=='[') {
			//my.push(ch[i]);
			bb.push(ch[i]);
		}
		else  if(((char)bb.peek()=='('&&ch[i]==')')||
    		 ((char)bb.peek()=='{'&&ch[i]=='}')
    		 ||((char)bb.peek()=='['&&ch[i]==']'))		{
    //	 System.out.println("so");
    	 //my.pop();
			bb.pop();
  //    System.out.println(my.pop()); 	 
     }

		}
	boolean b=bb.isEmpty();
	if(b==true) {
		System.out.println("it is balanced");
	}else
	{
		System.out.println("expresion is not balanced");
	}
}}
