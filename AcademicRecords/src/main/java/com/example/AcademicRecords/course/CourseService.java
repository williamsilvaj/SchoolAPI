package com.example.AcademicRecords.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.AcademicRecords.department.Department;
import com.example.AcademicRecords.department.DepartmentService;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/addCourse")
	public Course addCourse(Course course) {
	    int departmentId = course.getDepartment().getId();
	    Department department = departmentService.getDepartmentById(departmentId);

	    if (department == null) {
	        System.out.println("Department not found");
	        return null;
	    }

	    course.setDepartment(department);
	    return saveCourse(course);
	}


	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	public List<Course> getCourse() {
		return courseRepository.findAll();
	}

	public Course getCourseById(int id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
	}

}
