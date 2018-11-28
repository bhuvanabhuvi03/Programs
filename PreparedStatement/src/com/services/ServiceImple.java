package com.services;

import com.model.Student;
import com.respository.DataBaseRespository;
import com.respository.RespositoryImpl;

public class ServiceImple  implements ServiceInter{

	@Override
	public void serviceInterface(Student student) {
DataBaseRespository baseRespository=new RespositoryImpl();
		baseRespository.createStudent(student);
	}

}
