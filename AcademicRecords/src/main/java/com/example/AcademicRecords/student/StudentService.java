package com.example.AcademicRecords.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public List<Student> getStudent() {
		return repository.findAll();
	}

	public Student getStudentById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteStudent(int id) {
		repository.deleteById(id);
	}

}
