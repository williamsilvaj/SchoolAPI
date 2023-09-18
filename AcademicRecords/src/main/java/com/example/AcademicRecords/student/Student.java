package com.example.AcademicRecords.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student", schema = "academy")
public class Student {

//	id: INTEGER
//	name: VARCHAR
//	bithday: DATE
//	birth_place: VARCHAR
//	nacionality: VARCHAR
//	cpf: VARCHAR

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-incrementing strategy
	@Column(name = "id")
	private int studentId;

	private String name;
	private String birthday;
	private String birthPlace;
	private String nacionality;
	private String cpf;

	public Student(int studentInd, String name, String birthday, String birthPlace, String nacionality, String cpf) {
		this.studentId = studentId;
		this.name = name;
		this.birthday = birthday;
		this.birthPlace = birthPlace;
		this.nacionality = nacionality;
		this.cpf = cpf;
	}

	public Student() {

	}

	public int getStudentInd() {
		return studentId;
	}

	public void setStudentInd(int studentInd) {
		this.studentId = studentInd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}