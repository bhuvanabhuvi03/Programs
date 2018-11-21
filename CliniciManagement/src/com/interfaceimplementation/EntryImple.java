package com.interfaceimplementation;

import java.util.ArrayList;
import java.util.Scanner;

import com.management.CliniciEntry;

public class EntryImple implements CliniciEntry{
	static Scanner scanner=new Scanner(System.in);
	static ArrayList<Patient>patientlist=new ArrayList<>();
	static ArrayList<Doctor>doctorlist=new ArrayList<>();
	
	
	@Override
	public void addPatientDetail() {
		
		
		String say;
		int choice;
		do {
			
			System.out.println("do you want add \n1.add patient\n2.editpatient\n3.delete patient\n4.save and exits");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("add patient");
				patientlist= addPatient();
				
				
				break;
			case 2:
				System.out.println("editpatient");
				
				editpatient(patientlist);
				break;
			case 3:
				deletepatient(patientlist);
				System.out.println("delete patient");
				break;
			case 4:
				System.out.println("save and exits");
			
			
			
			}
			System.out.println("type yes to contiue");
		    say=scanner.next();
  		}while(say.equals("yes"));
		
		
		
		
		
		
		
		
	}
	
	
	
	ArrayList<Patient> addPatient() {
		
		String say;
		int choice;
		do {
		Patient patient=new Patient();
		System.out.println("enter the patient name");
		String  name=scanner.next();
		patient.setName(name);
		System.out.println("enter the patient id");

		int id=scanner.nextInt();
		patient.setId(id);
		System.out.println("enter the patient number");

		String mobilenumber=scanner.next();
		patient.setMoblienumber(mobilenumber);
		

		
		
			System.out.println("type yes to contiue");
		    say=scanner.next();
		    
		    
		    patientlist.add(patient);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}while(say.equals("yes"));
		
		
		return patientlist;
		
		
	}
	
	ArrayList<Patient> editpatient(ArrayList<Patient> patientfile)
	{
		
		if(patientfile==null) {
			System.out.println("file is empty");
		}
		else {
			System.out.println("select the patient to edit");
			for(int i=0;i<patientfile.size();i++) {
				System.out.println(patientfile.get(i).getId());
			}
			System.out.println("enter the id ");
			int id=scanner.nextInt();
			for(int i=0;i<patientfile.size();i++) {
				if(id==patientfile.get(i).getId()) {
					System.out.println(patientfile.get(i));
				}
			}
			
			
			
		}
		return patientfile;
		
	}

	ArrayList<Patient> deletepatient(ArrayList<Patient> patientfile)
	{
		
		if(patientfile==null) {
			System.out.println("file is empty");
		}
		else {
			System.out.println("select the patient to edit");
			for(int i=0;i<patientfile.size();i++) {
				System.out.println(patientfile.get(i).getId());
			}
			System.out.println("enter the id to delete ");
			int id=scanner.nextInt();
			for(int i=0;i<patientfile.size();i++) {
				if(id==patientfile.get(i).getId()) {
				patientfile.remove(i);
					System.out.println(patientfile.get(i));
				}
			}
			
			
			
		}
		return patientfile;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void addDoctorDetail() {

		String say;
		int choice;
		
		
		
do {
			
			System.out.println("do you want add \n1.add doctor\n2.editdoctor\n3.delete doctor\n4.save and exits");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("add doctor");
				doctorlist=addDoctor();
				break;
			case 2:
				System.out.println("edit doctor");
				doctorlist=editdoctor(doctorlist);
				break;
			case 3:
				deletedoctor(doctorlist);
				System.out.println("delete doctor");
				break;
			case 4:
				System.out.println("save and exits");
			
			
			
			}
			System.out.println("type yes to contiue");
		    say=scanner.next();
  		}while(say.equals("yes"));
		
		
		
		
		
		
		
		
	}
	ArrayList<Doctor> addDoctor() {
		
		String say;
		int choice;
		do {
		Doctor doctor=new Doctor();
		System.out.println("enter the patient name");
		String  name=scanner.next();
		doctor.setName(name);
		System.out.println("enter the patient id");

		int id=scanner.nextInt();
		doctor.setId(id);
		System.out.println("enter the patient number");

		

		
		
			System.out.println("type yes to contiue");
		    say=scanner.next();
		    
		    
		    doctorlist.add(doctor);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}while(say.equals("yes"));
		
		
		return doctorlist;
		
		
	}
	
	ArrayList<Doctor> editdoctor(ArrayList<Doctor> doctorfile)
	{
		
		if(doctorfile==null) {
			System.out.println("file is empty");
		}
		else {
			System.out.println("select the patient to edit");
			for(int i=0;i<doctorfile.size();i++) {
				System.out.println(doctorfile.get(i).getId());
			}
			System.out.println("enter the id ");
			int id=scanner.nextInt();
			for(int i=0;i<doctorfile.size();i++) {
				if(id==doctorfile.get(i).getId()) {
					System.out.println(doctorfile.get(i));
				}
			}
			
			
			
		}
		return doctorfile;
		
	}

	ArrayList<Doctor> deletedoctor(ArrayList<Doctor>doctorfile)
	{
		
		if(doctorfile==null) {
			System.out.println("file is empty");
		}
		else {
			System.out.println("select the patient to edit");
			for(int i=0;i<doctorfile.size();i++) {
				System.out.println(doctorfile.get(i).getId());
			}
			System.out.println("enter the id to delete ");
			int id=scanner.nextInt();
			for(int i=0;i<doctorfile.size();i++) {
				if(id==doctorfile.get(i).getId()) {
					doctorfile.remove(i);
					System.out.println(doctorfile.get(i));
				}
			}
			
			
			
		}
		return doctorfile;
		
	}


	@Override
	public void appointmentDetail() {
		// TODO Auto-generated method stub
		
	}
	
	
}
