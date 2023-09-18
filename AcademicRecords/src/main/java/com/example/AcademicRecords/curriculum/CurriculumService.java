package com.example.AcademicRecords.curriculum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurriculumService {

	@Autowired
	private CurriculumRepository repository;

	public Curriculum saveCurriculum(Curriculum curriculum) {
		return repository.save(curriculum);
	}

	public List<Curriculum> getCurriculum() {
		return repository.findAll();
	}

	public Curriculum getCurriculumById(int id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteCurriculum(int id) {
		repository.deleteById(id);
		return "Curriculum removed.";
	}

}
