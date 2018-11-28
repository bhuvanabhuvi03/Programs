package com.repository;

import com.model.Student;

public interface DataBaseRespository {
void createStudent(Student student);
void deleteStudent();
void updateStudent();
void readStudent();

}
