package com.example.AcademicRecords.discipline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplineService {

	@Autowired
	private DisciplineRepository repository;

	public Discipline saveDiscipline(Discipline discipline) {
		return repository.save(discipline);
	}

	public List<Discipline> getDiscipline() {
		return repository.findAll();
	}

	public Discipline getDisciplineById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteDiscipline(int id) {
		repository.deleteById(id);
	}

}
