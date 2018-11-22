package com.interfaceimplementation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;



public class EntryImple implements CliniciEntry{
	static Scanner scanner=new Scanner(System.in);
	static ArrayList<Patient>patientlist=new ArrayList<>();
	static ArrayList<Doctor>doctorlist=new ArrayList<>();
    static String say="yes";
    static int count=0;	
	
	static ObjectMapper mapper=new ObjectMapper();
	static JSONArray jsonarray=new JSONArray();



	@Override
	public void appointmentDetail() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ArrayList<Patient> editPatient(ArrayList<Patient> patientfile) {
		// TODO Auto-generated method stub
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
					System.out.println("enter the new name");
					String newname=scanner.next();
					patientfile.get(i).setName(newname);
				    System.out.println("enter new mobile number");
					String newnumber=scanner.next();
				    patientfile.get(i).setMoblienumber(newnumber);
				}
			}
			
			
			
		}
		return patientfile;
//		
	//	return null;
	}



	@Override
	public ArrayList<Patient> deletePatient(ArrayList<Patient> patientfile) {
		// TODO Auto-generated method stub
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
	public ArrayList<Doctor> editDoctor(ArrayList<Doctor> doctorfile) {
		// TODO Auto-generated method stub
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
					System.out.println("enter name");
					String newname=scanner.next();
					doctorfile.get(i).setName(newname);
					
				}
			}
			
			
			
		}
		return doctorfile;
		//return null;
	}



	@Override
	public ArrayList<Doctor> deleteDoctor(ArrayList<Doctor> doctorfile) {
		// TODO Auto-generated method stub
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
	public ArrayList<Patient> addPatient() {
		// TODO Auto-generated method stub
		System.out.println(patientlist);
		do {
			Patient patient=new Patient();
			System.out.println("enter the patient name");
			String  name=scanner.next();
			patient.setName(name);
			System.out.println("enter the patient id");

			int id=scanner.nextInt();
			boolean b;
			
			b=patientValidtly(id);
			while(b) {
				System.out.println("enter new id");
				id=scanner.nextInt();
				b=patientValidtly(id);
			}
			
			patient.setId(id);
			System.out.println("enter the patient number");
			
			

			String mobilenumber=scanner.next();
			patient.setMoblienumber(mobilenumber);
			System.out.println("enter the patient age");
			int age=scanner.nextInt();
			patient.setAge(age);

			
			
				System.out.println("type yes to contiue adding and editing process in the list");
			    say=scanner.next();
			    
			    System.out.println(patient);
			
			    
			    
			    
			    patientlist.add(patient);
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    
			    System.out.println(patientlist.size());
	count++;
			    System.out.println(patientlist);
			}while(say.equals("yes"));
			
			System.out.println(patientlist.size());
			return patientlist;
			
			
	}



	@Override
	public ArrayList<Doctor> addDoctor() {
		// TODO Auto-generated method stub

		
		do {
		Doctor doctor=new Doctor();
		System.out.println("enter the doctor name");
		String  name=scanner.next();
		doctor.setName(name);
		System.out.println("enter the doctor id");

		int id=scanner.nextInt();
		boolean b;
		b=doctorValidtly(id);
		while(b) {
			System.out.println("enter new id");
			id=scanner.nextInt();
		b=doctorValidtly(id);
		}		doctor.setId(id);
		System.out.println("enter the doctor's specialization");

		String specialization=scanner.next();
		doctor.setSpecialization(specialization);

		System.out.println("enter doctor avability");
		String avability=scanner.next();
		doctor.setAvability(avability);
		System.out.println("no of count");
		doctor.setNumbeOfPatient(count);
		
			System.out.println("type yes to contiue");
		    say=scanner.next();
		    
		    
		    doctorlist.add(doctor);
		}while(say.equals("yes"));
		
		System.out.println(doctorlist);
		return doctorlist;
		
		
	
		
	}






	@Override
	public void savePatient(ArrayList<Patient> patientlist) {
		
		// TODO Auto-generated method stub
		System.out.println(patientlist);
		for(int i=0;i<patientlist.size();i++) {
			System.out.println(patientlist.get(i));
		}
//		try {
//			ArrayList<Patient> list=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"), new TypeReference<ArrayList<Patient>>() {
//			});
//			list.addAll(patientlist)
		
		
		
		
		
			String filename="/home/bridgeit/Desktop/2d/clinic/patientfile.json";
System.out.println(patientlist.size());
ArrayList<Patient>list=new ArrayList<>();
	 	File file =new File(filename);
		
	 	if(file.length()==0) {
	 	
	 	
	 	
	 	try {
		String json="[";
				int temp=0;
				for(int i=0;i<patientlist.size()-1;i++) {
					temp=i;
					//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
					json=json+mapper.writeValueAsString(patientlist.get(i))+",";
					
					
				}
				if(patientlist.size()>1) {
					json=json+mapper.writeValueAsString(patientlist.get(temp+1))+"]";
				}
				temp++;
				if(patientlist.size()==1) {
					//System.out.println(mapper.writeValueAsString(patientlist.get(0)));
				json=json+mapper.writeValueAsString(patientlist.get(0))+"]";
				
				}
				
			
			FileWriter filewrite=new FileWriter(filename);

			filewrite.write(json);
			filewrite.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}}
	 	else {
	 		
	 		
	 		try {
				list.addAll(mapper.readValue(new File(filename), new TypeReference<ArrayList<Patient>>() {
					
					
				}));
				
//				patientlist.addAll(list);
				
				try {
					for(int i=0;i<patientlist.size();i++) {
						int temp=0;
						//System.out.println("z"+patientlist.get(i));
						for(int j=0;j<list.size();j++) {
						//	System.out.println("qq"+patientlist.get(j));
						if(patientlist.get(temp).getId()==patientlist.get(j).getId()){
							
                        temp=i++;
                       i++;
						
						}
						else {
							temp=i;
						}
						list.add(patientlist.get(temp));
						}
						//System.out.println(p);
						
						
						
					}
					String json="[";
							int temp=0;
							for(int i=0;i<patientlist.size()-1;i++) {
								temp=i;
								//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
								json=json+mapper.writeValueAsString(patientlist.get(i))+",";
								
								
							}
							if(patientlist.size()>1) {
								json=json+mapper.writeValueAsString(patientlist.get(temp+1))+"]";
							}
							temp++;
							if(patientlist.size()==1) {
								//System.out.println(mapper.writeValueAsString(patientlist.get(0)));
							json=json+mapper.writeValueAsString(patientlist.get(0))+"]";
							
							}
							
						
							
						FileWriter filewrite=new FileWriter(filename);

						filewrite.write(json);
						filewrite.flush();
					}catch (Exception e) {
						// TODO: handle exception
					}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 	}


//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		}



	@Override
	public void saveDoctor(ArrayList<Doctor> doctorlist) {
		
		// TODO Auto-generated method stub
		System.out.println(doctorlist);
		for(int i=0;i<doctorlist.size();i++) {
			System.out.println(doctorlist.get(i));
		}
//		try {
//			ArrayList<Patient> list=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/patientfile.json"), new TypeReference<ArrayList<Patient>>() {
//			});
//			list.addAll(patientlist)
		
		
	/*	
		FileWriter filewrite=new FileWriter(filename);

		filewrite.write(json);
		filewrite.flush();

		*/
		
			String filename="/home/bridgeit/Desktop/2d/clinic/doctorfile.json";
System.out.println(doctorlist.size());
	 	File file =new File(filename);
		
	 	if(file.length()==0) {
	 	
	 	
	 	
	 	try {
		String json="[";
				int temp=0;
				for(int i=0;i<doctorlist.size()-1;i++) {
					temp=i;
					//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
					json=json+mapper.writeValueAsString(doctorlist.get(i))+",";
					
					
				}
				if(doctorlist.size()>1) {
					json=json+mapper.writeValueAsString(doctorlist.get(temp+1))+"]";
				}
				temp++;
				if(doctorlist.size()==1) {
					//System.out.println(mapper.writeValueAsString(patientlist.get(0)));
				json=json+mapper.writeValueAsString(doctorlist.get(0))+"]";
				
				}
				
				}catch (Exception e) {
			// TODO: handle exception
		}}
	 	else {
	 		
	 		ArrayList<Doctor>listdoctor=new ArrayList<>();

	 		try {
				listdoctor.addAll(mapper.readValue(new File(filename), new TypeReference<ArrayList<Doctor>>() {
					
					
				}));System.out.println(listdoctor);
				
//				patientlist.addAll(list);
				
				try {
					for(int i=0;i<doctorlist.size();i++) {
						int temp=0;
						//System.out.println("z"+patientlist.get(i));
						for(int j=0;j<listdoctor.size();j++) {
						//	System.out.println("qq"+patientlist.get(j));
						if(listdoctor.get(j).getId()==doctorlist.get(i).getId()){
							
                     listdoctor.set(j, doctorlist.get(i));
                     temp=1;
						
						}
						}if(temp==0) {
							listdoctor.add(doctorlist.get(i));
							}
						//System.out.println(p);
						
						
						
					}
					String json="[";
							int temp=0;
							for(int i=0;i<listdoctor.size()-1;i++) {
								temp=i;
								//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
								json=json+mapper.writeValueAsString(listdoctor.get(i))+",";
								
								
							}
							if(doctorlist.size()>1) {
								json=json+mapper.writeValueAsString(listdoctor.get(temp+1))+"]";
							}
							temp++;
							if(listdoctor.size()==1) {
								//System.out.println(mapper.writeValueAsString(patientlist.get(0)));
							json=json+mapper.writeValueAsString(listdoctor.get(0))+"]";
							
							}
							
System.out.println("aa"+json);						
							
						FileWriter filewrite=new FileWriter(filename);

						filewrite.write(json);
						filewrite.flush();
					}catch (Exception e) {
						// TODO: handle exception
					}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	 		
	 		
	 		
	 		
	 	}}
	 		
	 		


	@Override
	public boolean  patientValidtly(int id) {
		// TODO Auto-generated method stub
		ArrayList<Patient>list=new ArrayList<>();
	String filename="/home/bridgeit/Desktop/2d/clinic/patientfile.json";
File file=new File(filename);
System.out.println(patientlist.size());
if(file.length()==0) {
	if(patientlist.size()==0)
	{
		System.out.println("this is first element");
		return false;
		
	}else
	{
		for(int i=0;i<patientlist.size();i++) {
			if(id==patientlist.get(i).getId()) {
				return true;
			}
		} 
	}
	
	
	
	
}
else {
	
try {
	list.addAll(mapper.readValue(new File(filename), new TypeReference<ArrayList<Patient>>() {
				
			}));
	patientlist.addAll(list);
	if(patientlist.size()==0) {
		for(int i=0;i<patientlist.size();i++) {
			if(id==patientlist.get(i).getId()) {
				return true;
			}
		}
	}
	else {
		for(int i=0;i<patientlist.size();i++) {
				
			if(id==patientlist.get(i).getId()) {
				return true;
			}
			
			
		}
	}
	
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return false;
		
		
		}


	@Override
	public boolean  doctorValidtly(int id) {
		// TODO Auto-generated method stub
		ArrayList<Doctor>list=new ArrayList<>();
		String filename="/home/bridgeit/Desktop/2d/clinic/doctorfile.json";
	File file=new File(filename);
	System.out.println(doctorlist.size());
	if(file.length()==0) {
		if(doctorlist.size()==0)
		{
			System.out.println("this is first element");
			return false;
			
		}else
		{
			for(int i=0;i<doctorlist.size();i++) {
				if(id==doctorlist.get(i).getId()) {
					return true;
				}
			} 
		}
		
		
		
		
	}
	else {
		
	try {
		list.addAll(mapper.readValue(new File(filename), new TypeReference<ArrayList<Doctor>>() {
					
				}));
		doctorlist.addAll(list);
		if(doctorlist.size()==0) {
			for(int i=0;i<doctorlist.size();i++) {
				if(id==doctorlist.get(i).getId()) {
					return true;
				}
			}
		}
		else {
			for(int i=0;i<doctorlist.size();i++) {
					
				if(id==doctorlist.get(i).getId()) {
					return true;
				}
				
				
			}
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		
	}
			
		
			
			return false;
	}



	
	@Override
	public void fixAppointment(Doctor doctor, Patient patient) {
	//ArrayList<Appointment> appointments=new ArrayList<>();
		
	
	Appointment appointment=new Appointment();
		appointment.setDoctorId(doctor.getId());
		appointment.setPatientID(patient.getId());
		appointment.setSpecialization(doctor.getSpecialization());
		
		appointment.setDoctorName(doctor.getName());
		appointment.setPatientName(patient.getName());
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		//   System.out.println(dtf.format(now));  
		
		
		appointment.setNoOfpatient(doctor.getNumbeOfPatient());
		
		appointment.setTime(dtf.format(now));
		
		// TODO Auto-generated method stub
		
		
		System.out.println(appointment);
	
		

	
			 	File file =new File("/home/bridgeit/Desktop/2d/clinic/appointment.json");
				System.out.println(file.length());
			 	if(file.length()==0) {
			 	
			 	
			 	
			 	
				String json="[";
					//	int temp=0;
							//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
							try {
								json=json+mapper.writeValueAsString(appointment)+"]";
								FileWriter filewrite=new FileWriter("/home/bridgeit/Desktop/2d/clinic/appointment.json");

								filewrite.write(json);
								filewrite.flush();
								System.out.println("success");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			 	}			
							
					
			 	else {
			 		
			 		ArrayList<Appointment>listappointment=new ArrayList<>();

			 		try {
			 			listappointment.addAll(mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/appointment.json"), new TypeReference<ArrayList<Appointment>>() {
							
							
						}));System.out.println("ss"+listappointment);
						
//						patientlist.addAll(list);
						
						listappointment.add(appointment);
								System.out.println(listappointment.size());
							System.out.println(listappointment);
							
							
							
							String json="[";
									int temp=0;
									for(int i=0;i<listappointment.size()-1;i++) {
										temp=i;
										//System.out.println(mapper.writeValueAsString(patientlist.get(i)));
										json=json+mapper.writeValueAsString(listappointment.get(i))+",";
										
										
									}
									if(listappointment.size()>1) {
										json=json+mapper.writeValueAsString(listappointment.get(temp+1))+"]";
									}
									temp++;
									if(listappointment.size()==1) {
										//System.out.println(mapper.writeValueAsString(patientlist.get(0)));
									json=json+mapper.writeValueAsString(listappointment.get(0))+"]";
									
									}
									
		System.out.println("aa"+json);						
									
								FileWriter filewrite=new FileWriter("/home/bridgeit/Desktop/2d/clinic/appointment.json");

								filewrite.write(json);
								filewrite.flush();
								System.out.println("success");
							}catch (Exception e) {
								// TODO: handle exception
							}
						
					} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}




	



	}
