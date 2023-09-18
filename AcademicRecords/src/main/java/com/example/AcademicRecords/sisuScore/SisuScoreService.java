package com.example.AcademicRecords.sisuScore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SisuScoreService {

	@Autowired
	private SisuScoreRepository repository;

	public SisuScore saveSisuScore(SisuScore sisuScore) {
		return repository.save(sisuScore);
	}

	public List<SisuScore> getSisuScore() {
		return repository.findAll();
	}

	public SisuScore getSisuScoreById(int id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteSisuScore(int id) {
		repository.deleteById(id);
	}

}