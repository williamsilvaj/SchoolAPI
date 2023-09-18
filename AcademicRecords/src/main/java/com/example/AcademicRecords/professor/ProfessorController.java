package com.example.AcademicRecords.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService service;

	@PostMapping("/addProf")
	public Professor addProf(@RequestBody Professor prof) {
		return service.saveProf(prof);
	}

	@GetMapping("/users")
	public List<Professor> findAllUsers() {
		return service.getProf();
	}

	@GetMapping("/user/{id}")
	public Professor findUser(@PathVariable int id) {
		return service.getProfById(id);
	}

	@DeleteMapping("/deleteProf/{id}")
	public void updateUser(@PathVariable int id) {
		service.deleteProf(id);
	}

}