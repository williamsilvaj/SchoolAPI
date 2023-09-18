package com.example.AcademicRecords.professorWorkload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorWorkloadService {

	@Autowired
	private ProfessorWorkloadRepository repository;

	public ProfessorWorkload saveProfessorWorkload(ProfessorWorkload professorWorkload) {
		return repository.save(professorWorkload);
	}

	public List<ProfessorWorkload> getProfessorWorkload() {
		return repository.findAll();
	}

	public ProfessorWorkload getProfessorWorkloadById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteProfessorWorkload(int id) {
		repository.deleteById(id);
	}

}