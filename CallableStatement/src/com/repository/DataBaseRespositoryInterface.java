package com.repository;

import com.model.Student;

public interface DataBaseRespositoryInterface {
void insertStudent(Student student);
void deleteStudent();
void updateStudent();
void readStudent();

}
