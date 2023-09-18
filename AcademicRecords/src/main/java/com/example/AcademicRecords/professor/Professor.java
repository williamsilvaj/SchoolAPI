package com.example.AcademicRecords.professor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-incrementing strategy
	@Column(name = "id")
	private int professorId;
	private String name;
	private String department;

	public Professor(int id, String name, String department) {
		this.professorId = id;
		this.name = name;
		this.department = department;
	}

	public Professor() {
	}

	public int getId() {
		return professorId;
	}

	public void setId(int id) {
		this.professorId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
