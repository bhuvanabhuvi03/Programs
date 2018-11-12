package com.datastructure;

public class MyyQueue {
static int front=-1,rear=-1,cap=0;
String namee[];
int bal=20000;
/**
 * 
 * @param capp size of the queue 
 */
public MyyQueue(int capp) {
	this.cap=capp;
	
	namee=new String [cap];
}
/**
 * 
 * @param name  data for store in the queue
 * @return boolean true or false
 */
boolean enqueue(String name) {
	namee[++front]=name;
	return true;
}
/**
 * 
 * @param amount
 * @param op
 * @return boolean true or false
 */
int bankacc(int amount,int op) {
    if(op==1)
	{bal=bal+amount;
	
	return bal;
	}
    else if(op==2) {
    	if(amount<bal) {
    		bal=bal-amount;
    		return bal;
    	}else {
    		System.out.println("bank have insufficent amount");
    		return 0;
    	}
    	
    	}
return 0;}

/*
 * delete the element in the queue 
 */
String dequeue()
{
	return namee[++rear];
	
}
int issize() {
	if(front==-1) {
		return 0;
	}
	if(front>=0) {
		//System.out.println("dd");
		return (front-rear); 
	}
	return 0;
}
}
