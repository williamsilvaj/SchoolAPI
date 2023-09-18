package com.example.AcademicRecords.discipline;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "discipline")
public class Discipline {
//	id: integer
//	code: varchar UNIQUE
//	name: varchar
//	workload: decimal

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-incrementing strategy
	@Column(name = "id")
	private int disciplineId;
	private String code;
	private String name;
	private int workload;

	public Discipline(int disciplineId, String code, String name, int workload) {
		this.disciplineId = disciplineId;
		this.code = code;
		this.name = name;
		this.workload = workload;
	}

	public Discipline() {
	}

	public int getDisciplineId() {
		return disciplineId;
	}

	public void setDisciplineId(int disciplineId) {
		this.disciplineId = disciplineId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

}
