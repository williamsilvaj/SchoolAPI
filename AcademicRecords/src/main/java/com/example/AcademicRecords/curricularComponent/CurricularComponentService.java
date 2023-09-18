package com.example.AcademicRecords.curricularComponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurricularComponentService {

	@Autowired
	private CurricularComponentRepository curricularComponentRepository;

	// Create, read, update and delete

	public CurricularComponent saveCurricularComponent(CurricularComponent curricularComponent) {
		return curricularComponentRepository.save(curricularComponent);
	}

	public List<CurricularComponent> getCurricularComponent() {
		return curricularComponentRepository.findAll();
	}

	public CurricularComponent getCurricularComponentById(int curricularComponentId) {
		return curricularComponentRepository.findById(curricularComponentId).orElse(null);
	}

	public void deleteCurricularComponentById(int curricularComponentId) {
		curricularComponentRepository.deleteById(curricularComponentId);
	}

}
