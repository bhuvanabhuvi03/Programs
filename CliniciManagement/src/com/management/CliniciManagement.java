package com.management;

import java.util.Scanner;

import com.interfaceimplementation.EntryImple;

public class CliniciManagement {
static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
	
	
	String choice;
	int option;
	do {
		System.out.println("enter the choice");
		option=scanner.nextInt();
		switch(option) {
		case 1:
			
			System.out.println("Registartion files");
			break;
		case 2:
			System.out.println("Searching");
		break;
		case 3:
			System.out.println("Dispaly Details ");
		break;
		
		}
		
		System.out.println("do you want contiue");
		choice=scanner.next();
	}while(choice.equals("yes"));
	
}
}
