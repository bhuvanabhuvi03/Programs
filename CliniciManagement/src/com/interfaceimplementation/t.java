package com.interfaceimplementation;

import java.io.File;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class t {
	ArrayList<Appointment>listAppointment=new ArrayList<>();

ObjectMapper mapper=new ObjectMapper();

	listAppointment=mapper.readValue(new File("/home/bridgeit/Desktop/2d/clinic/appointment.json"), new TypeReference<ArrayList<Appointment>>() {
	});
	for(int i=0;i<listAppointment.size();i++) {
		System.out.println(listAppointment.get(i));
	}
}

