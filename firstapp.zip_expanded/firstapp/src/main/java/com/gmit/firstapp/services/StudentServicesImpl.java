package com.gmit.firstapp.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmit.firstapp.model.Student;
import com.gmit.firstapp.repo.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices
{
	@Autowired
	private StudentRepository repository;

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return repository.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
	    // findById returns Optional<Student>, so handle it properly
	    return repository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
	}

	@Override
	public String deleteStudent(Long id) {
	    if (repository.existsById(id)) {
	        repository.deleteById(id);
	        return "Student deleted successfully!";
	    } else {
	        return "Student not found!";
	    }
	}

}
