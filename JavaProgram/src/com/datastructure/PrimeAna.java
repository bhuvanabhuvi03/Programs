/**
 * 
 * Purpose : Find the Prime number between 0 to 1000 and anagram    
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  2-11-2018
 *
 ********************************************************************/


package com.datastructure;

public class PrimeAna {
public static void main(String[] args) {
	
	int p[]=new int[200];//initialize the array
	int n;
	int count=0;//initialize the count 
	int pp=0;//initialize var 
	/*
	 * iterate the loop for 1000 time
	 * find the prime 0 to 1000
	 */
	for(int i=2;i<1000;i++) {
		int flag=1;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag++;
				break;
			}
			
		}if(flag==1) {
			
			System.out.println(i);
		    
			p[pp]=i;//storing the data in the array
		    pp++;
		    count++;
		}
}
	n=count;
//for(int i=0;i<p.length;i++) {
//if(p[i]!=0)
    //System.out.println(p[i]);
//}
int k=0;
int count1=0;
boolean b=false;
int aa[]=new int[200];
MyStack m=new MyStack();
/*
 * find the anagram and store in the stack 
 */
for(int i=0;i<p.length-2;i++) {
	for(int j=i+1;j<p.length;j++) {
	if(p[i]!=0&&p[j]!=0)
		b=AnaQueue.check(p[i],p[j]);
	if(b==true) {
		System.out.println(p[i]+"  "+p[j]);
		aa[k]=p[i];
		m.push(p[i]);
	//	System.out.println(aa[k]);
		k++; 
		aa[k]=p[j];
		k++;
		m.push(p[j]);
		count1++;
//		if(p[i]==aa[k-2]) {
//			System.out.println(p[i]+" "+aa[k-2]);
//		}
	//	System.out.println(aa[k]);
	//	System.out.println(aa[k-1]+" "+aa[k-2]);
			}
	}


}
//for(int i=0;i<count1*2;i++)
//{int a=m.popint();
//if(p[i]!=0)
	//System.out.println(a);
//}
//for(int t=0;t<aa.length;t++) {
	//if(aa[t]!=0) {
	//	System.out.println(aa[t]);
	//}
//}
System.out.println("this is for stack");
System.out.println(" ************************");

m.reverse();
       System.out.println(count1); 
System.out.println("this for queue");
System.out.println(" ************************");
MyQueue mq=new MyQueue(count1*2);
/*
 * find the anagram and store in the queue
 */
for(int i=0;i<p.length-2;i++) {
	for(int j=i+1;j<p.length;j++) {
	if(p[i]!=0&&p[j]!=0)
		b=AnaQueue.check(p[i],p[j]);
	if(b==true) {
		//System.out.println(p[i]+"  "+p[j]);
		//aa[k]=p[i];
		mq.enqueue(p[i]);
	//	System.out.println(aa[k]);
		//k++; 
		//aa[k]=p[j];
		//k++;
		mq.enqueue(p[j]);
		
//		if(p[i]==aa[k-2]) {
//			System.out.println(p[i]+" "+aa[k-2]);
//		}
	//	System.out.println(aa[k]);
	//	System.out.println(aa[k-1]+" "+aa[k-2]);
			}
	}


}
//for(int i=0;i<(count1*2)-1;i++);
//{
//int a=mq.dequeue();
//System.out.println(a);
//}
System.out.println(mq);


}
}
