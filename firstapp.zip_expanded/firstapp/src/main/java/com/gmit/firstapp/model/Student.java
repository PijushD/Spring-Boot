package com.gmit.firstapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEnrolledcourse() {
		return enrolledcourse;
	}

	public void setEnrolledcourse(String enrolledcourse) {
		this.enrolledcourse = enrolledcourse;
	}

	private String name;
	private int age;
	private String enrolledcourse;
	
	public Student(Long id, String name, int age, String enrolledcourse) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.enrolledcourse = enrolledcourse;
	}

	public Student(String name, int age, String enrolledcourse) {
		super();
		this.name = name;
		this.age = age;
		this.enrolledcourse = enrolledcourse;
	}

	public Student() {
		super();
	}
	
	
}
