package com.interfaceimplementation;

import java.util.ArrayList;

public class SearchImplementation implements SearchInterface {

	@Override
	public void searchByPatientName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByDoctorName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchByDoctorId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient searchByPatientId(int patientID,ArrayList<Patient>patientlist) {
		// TODO Auto-generated method stub
		for(int i=0;i<patientlist.size();i++)
		if(patientID==patientlist.get(i).getId()) {
			return patientlist.get(i);
		}
		
		return null;
	}

	@Override
	public void searchByDoctorSpecialization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor searchByAvability(int doctorId,ArrayList<Doctor>doctorlist) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<doctorlist.size();i++) {
			if(doctorId==doctorlist.get(i).getId()) {
				int count=doctorlist.get(i).getNumbeOfPatient();		
				count++;
				doctorlist.get(i).setNumbeOfPatient(count);
				
				return doctorlist.get(i); 
			}
		}
		return null;
	}

}
