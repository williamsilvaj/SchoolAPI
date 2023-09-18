package com.example.AcademicRecords.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;

	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}

	@GetMapping("/courses")
	public List<Course> findAllCourses() {
		return service.getCourse();
	}

	@GetMapping("/course/{id}")
	public Course findCourse(@PathVariable int id) {
		return service.getCourseById(id);
	}

	@DeleteMapping("/deleteCourse/{id}")
	public void updateCourse(@PathVariable int id) {
		service.deleteCourse(id);
	}

}