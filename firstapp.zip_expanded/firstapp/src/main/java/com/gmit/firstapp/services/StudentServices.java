package com.gmit.firstapp.services;

import java.util.List;

import com.gmit.firstapp.model.Student;

public interface StudentServices {
	//Register or Update	
	Student save(Student s);
	
	//getAll Students
	List<Student> getAllStudents();
	
	//get Student By Id
	Student getStudentById(Long id);
	
	//delete Student
	String deleteStudent(Long id);
}
