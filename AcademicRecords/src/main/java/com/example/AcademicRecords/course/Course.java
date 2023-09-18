package com.example.AcademicRecords.course;

import com.example.AcademicRecords.department.Department;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

//	id: Integer
//	name :
//	department FK
//	type string
//	level string

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int courseId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	private String type;
	private String level;

	public Course(int id, String name, Department department, String type, String level) {
		this.courseId = id;
		this.name = name;
		this.department = department;
		this.type = type;
		this.level = level;
	}

	public Course() {

	}

	public int getId() {
		return courseId;
	}

	public void setId(int id) {
		this.courseId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

}
