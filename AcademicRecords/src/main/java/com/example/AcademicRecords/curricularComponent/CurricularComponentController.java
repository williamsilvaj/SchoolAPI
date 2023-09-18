package com.example.AcademicRecords.curricularComponent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurricularComponentController {

	@Autowired
	private CurricularComponentService service;

	@PostMapping("/addCurricularComponent")
	public CurricularComponent addCurricularComponent(@RequestBody CurricularComponent curricularComponent) {
		return service.saveCurricularComponent(curricularComponent);
	}

	@GetMapping("/curricularComponent")
	public List<CurricularComponent> findAllCurricularComponents() {
		return service.getCurricularComponent();
	}

	@GetMapping("/curricularComponent/id")
	public CurricularComponent findCurriculum(@PathVariable int id) {
		return service.getCurricularComponentById(id);
	}

	@DeleteMapping("/deleteCurricularComponent/{id}")
	public void updateCurricularComponent(@PathVariable int id) {
		service.deleteCurricularComponentById(id);
	}

}