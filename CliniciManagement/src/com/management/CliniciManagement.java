package com.management;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.interfaceimplementation.Doctor;
import com.interfaceimplementation.EntryImple;
import com.interfaceimplementation.Patient;
import com.interfaceimplementation.SearchImplementation;

public class CliniciManagement {
static Scanner scanner=new Scanner(System.in);
static 	int option;
static String say="yes";
static ArrayList<Patient>patientlist=new ArrayList<>();
static ArrayList<Doctor>doctorlist=new ArrayList<>();

static EntryImple entryImple=new EntryImple();

public static void main(String[] args) {
	
	EntryImple entryImple=new EntryImple();
	//String choice="yes";
	do {
		System.out.println("1.Registartion Details\n2.search \n3.Display File");
		System.out.println("enter the choice");
		option=scanner.nextInt();
		switch(option) {
		case 1:
			
			System.out.println("Registartion files");
			entryCall();
			
			
			break;
		case 2:
			System.out.println("Searching");
		break;
		case 3:
			
			System.out.println("Dispaly Details ");
		break;
		
		}
		
		System.out.println("do you want contiue");
		say=scanner.next();
	}while(say.equals("yes"));
	
}
	
static void entryCall(){
		
	//int option;
	
		do {
		
			
			System.out.println("1.patiententry\n2.doctor entry\n3.appointment ");
			System.out.println("enter what entry you has to do");
			option=scanner.nextInt();
			
			switch(option) {
			
			case 1:
				
	              			

				
				do {
					
					System.out.println("do you want add \n1.add patient\n2.editpatient\n3.delete patient\n4.save and exits");
					option=scanner.nextInt();
					switch(option) {
					case 1:
						System.out.println("add patient");
						System.out.println(patientlist);
						patientlist= entryImple.addPatient();
						
						System.out.println(patientlist);
						break;
					case 2:
						System.out.println("editpatient");
						
						entryImple.editPatient(patientlist);
						break;
					case 3:
						entryImple.deletePatient(patientlist);
						System.out.println("delete patient");
						break;
					case 4:
						System.out.println("save and exits");
						if(patientlist.size()==0) {
						System.out.println("file is empty");	
						}else
						{
							System.out.println("hii"+patientlist);
						entryImple.savePatient(patientlist);
						}
						break;
					
					case 5:
						System.out.println("file eixt");
					break;
					}
					
		  		}while(option<5);
				break;
			
			
			
			case 2:
				//String wish;
				
				
				do {
							
							System.out.println("do you want add \n1.add doctor\n2.editdoctor\n3.delete doctor\n4.save and exits");
							option=scanner.nextInt();
							switch(option)
							{
							case 1:
								System.out.println("add doctor");
								doctorlist=entryImple.addDoctor();
								
								
								
								break;
							case 2:
								System.out.println("edit doctor");
								doctorlist=entryImple.editDoctor(doctorlist);
								break;
							case 3:
								doctorlist=entryImple.deleteDoctor(doctorlist);
								System.out.println("delete doctor");
								break;
							case 4:
								System.out.println("save ");

								if(doctorlist.size()==0) {
									System.out.println("file is empty");
								}
								
								else {
								entryImple.saveDoctor(doctorlist);
								}
								
							break;
							case 5:
								
								System.out.println("file eixt");
							break;
							}
				}
				
				while(option<5);
						break;
			case 3:
				ObjectMapper mapper=new ObjectMapper();
				System.out.println("appointment");
SearchImplementation searchImplementation=new SearchImplementation();				
				ArrayList<Patient>listPatient=new ArrayList<>();
				ArrayList<Doctor>listDoctor=new ArrayList<>();
				
				try {
					listPatient=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"), new TypeReference<ArrayList<Patient>>() {
					});
					for(int i=0;i<listPatient.size();i++) {
						System.out.println(listPatient.get(i));
					}
					System.out.println();
					listDoctor=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/doctorfile.json"), new TypeReference<ArrayList<Doctor>>() {
					});
					for(int i=0;i<listDoctor.size();i++) {
						System.out.println(listDoctor.get(i));
					}
					System.out.println();
					
	
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("enter the patient id");
				int patientid=scanner.nextInt();
				System.out.println("enter the doctor id");
	             int doctorid=scanner.nextInt();
				Doctor doctor=searchImplementation.searchByAvability(doctorid,listDoctor);
				System.out.println(doctor);
				Patient patient=searchImplementation.searchByPatientId(patientid, listPatient);
				
				
				entryImple.fixAppointment(doctor, patient);
				
				
				
				
				
				
				
				
				
				break;
			    
			
			
			}
			System.out.println("type yes to contiue");
		    say=scanner.next();
			
		}while(say.equals("yes"));
		
		
	}
	
	
	
	
	
	
}
