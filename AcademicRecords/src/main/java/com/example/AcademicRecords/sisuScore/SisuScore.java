package com.example.AcademicRecords.sisuScore;

import com.example.AcademicRecords.student.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sisu_score")
public class SisuScore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne
	@JoinColumn(name = "student_id")
	private Student studentId;

	private int scoreAverage;
	private String quotaType;
	private int classification;
	private String createdAt;

	public SisuScore(int id, Student studentId, int scoreAverage, String quotaType, int classification,
			String createdAt) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.scoreAverage = scoreAverage;
		this.quotaType = quotaType;
		this.classification = classification;
		this.createdAt = createdAt;
	}

	public SisuScore() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	public int getScoreAverage() {
		return scoreAverage;
	}

	public void setScoreAverage(int scoreAverage) {
		this.scoreAverage = scoreAverage;
	}

	public String getQuotaType() {
		return quotaType;
	}

	public void setQuotaType(String quotaType) {
		this.quotaType = quotaType;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
