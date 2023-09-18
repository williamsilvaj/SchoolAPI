package com.example.AcademicRecords.requiredPendingDiscipline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequiredPendingDisciplineService {

	@Autowired
	private RequiredPendingDisciplineRepository repository;

	public RequiredPendingDiscipline saveRequiredPendingDiscipline(
			RequiredPendingDiscipline requiredPendingDiscipline) {
		return repository.save(requiredPendingDiscipline);
	}

	public List<RequiredPendingDiscipline> getRequiredPendingDiscipline() {
		return repository.findAll();
	}

	public RequiredPendingDiscipline getRequiredPendingDisciplineById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteRequiredPendingDiscipline(int id) {
		repository.deleteById(id);
	}

}
