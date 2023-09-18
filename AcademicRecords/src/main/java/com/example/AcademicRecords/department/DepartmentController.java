package com.example.AcademicRecords.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/addDepartment")
	public Department addProfessor(@RequestBody Department dep) {
		return departmentService.saveDepartment(dep);
	}

	@GetMapping("/departments")
	public List<Department> findAllDepartments() {
		return departmentService.getDepartment();
	}

	@GetMapping("/department/{id}")
	public Department findDepartment(@PathVariable int id) {
	    return departmentService.getDepartmentById(id);
	}

	@DeleteMapping("/deleteDepartment/{id}")
	public void updateDep(@PathVariable int id) {
		departmentService.deleteDepartmentById(id);
	}

}
