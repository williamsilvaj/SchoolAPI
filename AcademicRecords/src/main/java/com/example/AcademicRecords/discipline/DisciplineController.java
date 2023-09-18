package com.example.AcademicRecords.discipline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplineController {

	@Autowired
	private DisciplineService service;

	@PostMapping("/addDiscipline")
	public Discipline addDiscipline(@RequestBody Discipline discipline) {
		return service.saveDiscipline(discipline);
	}

	@GetMapping("/disciplines")
	public List<Discipline> findAllDiscipline() {
		return service.getDiscipline();
	}

	@GetMapping("/discipline/{id}")
	public Discipline findDiscipline(@PathVariable int id) {
		return service.getDisciplineById(id);
	}

	@DeleteMapping("/deleteDiscipline/{id}")
	public void updateUser(@PathVariable int id) {
		service.deleteDiscipline(id);
	}

}
