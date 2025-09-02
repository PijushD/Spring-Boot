package com.gmit.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmit.firstapp.model.Student;
import com.gmit.firstapp.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	private StudentServices services;
	
	// Create a new Note
	@PostMapping("/save")
	public Student save(@RequestBody Student s) {
	    return services.save(s);
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents() {
	    return services.getAllStudents();
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable(value = "id") Long id) {
	    return services.getStudentById(id);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteStudentById(@PathVariable(value = "id") Long id) {	    
	    return services.deleteStudent(id);
	}
}
