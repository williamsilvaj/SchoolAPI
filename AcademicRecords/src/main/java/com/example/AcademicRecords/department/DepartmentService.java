package com.example.AcademicRecords.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	// Create, read, update and delete

	// Saving department
	public Department saveDepartment(Department dep) {
		return departmentRepository.save(dep);
	}

	// Return all departments saved
	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	// Returns the department that has the 'departmentId' id
	public Department getDepartmentById(int departmentId) {
		return departmentRepository.findById(departmentId).orElse(null);
	}

	// Delete the department that has the 'departmentId' id
	public void deleteDepartmentById(int departmentId) {
		departmentRepository.deleteById(departmentId);
	}

}
