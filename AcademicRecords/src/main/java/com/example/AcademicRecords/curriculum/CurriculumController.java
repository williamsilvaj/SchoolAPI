package com.example.AcademicRecords.curriculum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurriculumController {

	@Autowired
	private CurriculumService service;

	@PostMapping("/addCurriculum")
	public Curriculum addCurriculum(@RequestBody Curriculum curriculum) {
		return service.saveCurriculum(curriculum);
	}

	@GetMapping("/curriculum")
	public List<Curriculum> findAllCurriculum() {
		return service.getCurriculum();
	}

	@GetMapping("/curriculum/id")
	public Curriculum findCurriculum(@PathVariable int id) {
		return service.getCurriculumById(id);
	}

	@DeleteMapping("/deleteCurriculum/{id}")
	public String updateCurriculum(@PathVariable int id) {
		return service.deleteCurriculum(id);
	}

}