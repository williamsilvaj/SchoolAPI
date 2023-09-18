package com.example.AcademicRecords.professorWorkload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorWorkloadController {

	@Autowired
	private ProfessorWorkloadService service;

	@PostMapping("/addProfessorWorkload")
	public ProfessorWorkload addProfessorWorkload(@RequestBody ProfessorWorkload professorWorkload) {
		return service.saveProfessorWorkload(professorWorkload);
	}

	@GetMapping("/professorWorkload")
	public List<ProfessorWorkload> findAllProfessorWorkload() {
		return service.getProfessorWorkload();
	}

	@GetMapping("/professorWorkload/{id}")
	public ProfessorWorkload findProfessorWorkload(@PathVariable int id) {
		return service.getProfessorWorkloadById(id);
	}

	@DeleteMapping("/deleteProfessorWorkload/{id}")
	public void updateProfessorWorkload(@PathVariable int id) {
		service.deleteProfessorWorkload(id);
	}

}