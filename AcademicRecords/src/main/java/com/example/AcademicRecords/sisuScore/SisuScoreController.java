package com.example.AcademicRecords.sisuScore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SisuScoreController {

	@Autowired
	private SisuScoreService service;

	@PostMapping("/addSisuScore")
	public SisuScore addStudent(@RequestBody SisuScore sisuScore) {
		return service.saveSisuScore(sisuScore);
	}

	@GetMapping("/sisuScore")
	public List<SisuScore> findAllStudents() {
		return service.getSisuScore();
	}

	@GetMapping("/sisuScore/{id}")
	public SisuScore findStudent(@PathVariable int id) {
		return service.getSisuScoreById(id);
	}

	@DeleteMapping("/deleteSisuScore/{id}")
	public void updateSisuScore(@PathVariable int id) {
		service.deleteSisuScore(id);
	}

}