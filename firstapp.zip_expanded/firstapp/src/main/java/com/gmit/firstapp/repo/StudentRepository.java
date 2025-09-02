package com.gmit.firstapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmit.firstapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{
	/*
	save(S entity) → Save or update a student.

	saveAll(Iterable<S> entities) → Save multiple students.

	findById(ID id) → Find a student by primary key (Long in your case).

	findAll() → Get all students.

	findAllById(Iterable<ID> ids) → Get students by multiple IDs.

	existsById(ID id) → Check if a student exists by ID.

	count() → Count total students.

	deleteById(ID id) → Delete student by ID.

	delete(Student entity) → Delete a specific student.

	deleteAll() → Delete all students
	*/
}
