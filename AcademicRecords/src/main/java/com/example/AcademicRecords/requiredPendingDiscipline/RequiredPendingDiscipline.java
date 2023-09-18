package com.example.AcademicRecords.requiredPendingDiscipline;

import com.example.AcademicRecords.curriculum.Curriculum;
import com.example.AcademicRecords.discipline.Discipline;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "required_pending_discipline")
public class RequiredPendingDiscipline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne // Many RequiredPendingDisciplines can be associated with one Curriculum
	@JoinColumn(name = "curriculum_id")
	private Curriculum curriculum;

	@ManyToOne // Many RequiredPendingDisciplines can be associated with one Discipline
	@JoinColumn(name = "discipline_id")
	private Discipline discipline;

	private int level;

	public RequiredPendingDiscipline(int id, Curriculum curriculum, Discipline discipline, int level) {
		super();
		this.id = id;
		this.curriculum = curriculum;
		this.discipline = discipline;
		this.level = level;
	}

	public RequiredPendingDiscipline() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
