package com.example.AcademicRecords.requiredPendingDiscipline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequiredPendingDisciplineController {

	@Autowired
	private RequiredPendingDisciplineService service;

	@PostMapping("/addRequiredPendingDiscipline")
	public RequiredPendingDiscipline addStudent(@RequestBody RequiredPendingDiscipline requiredPendingDiscipline) {
		return service.saveRequiredPendingDiscipline(requiredPendingDiscipline);
	}

	@GetMapping("/requiredPendingDiscipline")
	public List<RequiredPendingDiscipline> findAllRequiredPendingDiscipline() {
		return service.getRequiredPendingDiscipline();
	}

	@GetMapping("/requiredPendingDiscipline/{id}")
	public RequiredPendingDiscipline findStudent(@PathVariable int id) {
		return service.getRequiredPendingDisciplineById(id);
	}

	@DeleteMapping("/deleteRequiredPendingDiscipline/{id}")
	public void updateRequiredPendingDiscipline(@PathVariable int id) {
		service.deleteRequiredPendingDiscipline(id);
	}

}