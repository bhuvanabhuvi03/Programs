package com.controller;

import com.model.Student;
import com.repository.DataBaseRespositoryImple;
import com.repository.DataBaseRespositoryInterface;
import com.services.CallableServiceInterface;

public class ServiceImple implements CallableServiceInterface{

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub
		DataBaseRespositoryInterface baseRespositoryInterface=new DataBaseRespositoryImple();
		baseRespositoryInterface.insertStudent(student);
	}
	

}
