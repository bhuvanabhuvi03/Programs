package com.interfaceimplementation;

import java.util.ArrayList;

public interface SearchInterface {

	void searchByPatientName();
	void searchByDoctorName();
	void searchByDoctorId();
	Patient searchByPatientId(int patientId,ArrayList<Patient>patientlist);
	void searchByDoctorSpecialization();
	Doctor searchByAvability(int doctorId,ArrayList<Doctor>doctorlist);
	
	
	
	
}
