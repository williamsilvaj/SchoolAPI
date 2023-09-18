package com.example.AcademicRecords.professorWorkload;

import com.example.AcademicRecords.curricularComponent.CurricularComponent;
import com.example.AcademicRecords.professor.Professor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor_workload")
public class ProfessorWorkload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int professorWorkloadId;

	@ManyToOne // Many ProfessorWorkloads can be associated with one CurricularComponent
	@JoinColumn(name = "curricular_component_id")
	private CurricularComponent curricularComponent;

	@OneToOne // One ProfessorWorkload is associated with one Professor
	@JoinColumn(name = "professor_id")
	private Professor professor;

	private int workload;

	public ProfessorWorkload(int professorWorkloadId, CurricularComponent curricularComponent, Professor professor,
			int workload) {
		super();
		this.professorWorkloadId = professorWorkloadId;
		this.curricularComponent = curricularComponent;
		this.professor = professor;
		this.workload = workload;
	}

	public ProfessorWorkload() {

	}

	public int getProfessorWorkloadId() {
		return professorWorkloadId;
	}

	public void setProfessorWorkloadId(int professorWorkloadId) {
		this.professorWorkloadId = professorWorkloadId;
	}

	public CurricularComponent getCurricularComponent() {
		return curricularComponent;
	}

	public void setCurricularComponent(CurricularComponent curricularComponent) {
		this.curricularComponent = curricularComponent;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

}
