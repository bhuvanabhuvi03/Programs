package com.services;

import com.model.Student;
import com.repository.DataBaseImpl;
import com.repository.DataBaseRespository;

public class ServiceImpl implements ServiseInter{

	@Override
	public void serviceInterface(Student student) {

		DataBaseRespository  baseRespository=new DataBaseImpl();
		baseRespository.createStudent(student);
		
	}

}
