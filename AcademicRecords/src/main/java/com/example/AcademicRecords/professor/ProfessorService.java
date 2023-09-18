package com.example.AcademicRecords.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository repository;

	public Professor saveProf(Professor prof) {
		return repository.save(prof);
	}

	public List<Professor> getProf() {
		return repository.findAll();
	}

	public Professor getProfById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteProf(int id) {
		repository.deleteById(id);
	}

}