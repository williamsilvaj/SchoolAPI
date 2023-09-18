package com.example.AcademicRecords.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("/students")
	public List<Student> findAllStudents() {
		return service.getStudent();
	}

	@GetMapping("/student/{id}")
	public Student findStudent(@PathVariable int id) {
		return service.getStudentById(id);
	}

	@DeleteMapping("/deleteStudent/{id}")
	public void updateStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}

}
