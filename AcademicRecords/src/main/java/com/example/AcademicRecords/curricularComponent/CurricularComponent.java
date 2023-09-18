package com.example.AcademicRecords.curricularComponent;

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
@Table(name = "curricular_component")
public class CurricularComponent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int curricularComponentId;

	private String period;
	private int classNumber;
	private int frequency;
	private String situation;
	private int grade;
	private String type;

	@ManyToOne // Many CurricularComponents can be associated with one Curriculum
	@JoinColumn(name = "curriculum_id")
	private Curriculum curriculum;

	@ManyToOne // Many CurricularComponents can be associated with one Discipline
	@JoinColumn(name = "discipline_id")
	private Discipline discipline;

	public CurricularComponent(int curricularComponentId, String period, int classNumber, int frequency,
			String situation, int grade, String type, Curriculum curriculum, Discipline discipline) {
		super();
		this.curricularComponentId = curricularComponentId;
		this.period = period;
		this.classNumber = classNumber;
		this.frequency = frequency;
		this.situation = situation;
		this.grade = grade;
		this.type = type;
		this.curriculum = curriculum;
		this.discipline = discipline;
	}

	public CurricularComponent() {

	}

	public int getCurricularComponentId() {
		return curricularComponentId;
	}

	public void setCurricularComponentId(int curricularComponentId) {
		this.curricularComponentId = curricularComponentId;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

}
