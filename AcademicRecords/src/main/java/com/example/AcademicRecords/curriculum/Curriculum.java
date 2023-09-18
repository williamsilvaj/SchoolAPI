package com.example.AcademicRecords.curriculum;

import com.example.AcademicRecords.course.Course;
import com.example.AcademicRecords.student.Student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "curriculum")
public class Curriculum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-incrementing strategy
	@Column(name = "id")
	private int curriculumId;

	private String status;
	private String InitialPeriod;
	private int ieach;
	private int iepi;
	private int mc;
	private int iea;
	private String register;

	@ManyToOne
	@JoinColumn(name = "studentId")
	private Student student;

	@ManyToOne
	@JoinColumn(name = "courseId")
	private Course course;

	private String ingressForm;
	private String certification;
	private String conclusionDeadlinePeriod;
	private int locksNumber;
	private int extensionsNumber;
	private String leavingDate;
	private String leavindReason;
	private String graduationDate;
	private int requiredComponentWorkload;
	private int fulfilledComponentWorkload;
	private int requiredActivityWorkload;
	private int fulfilledActivityWorkload;

	private String currentPeriodNumber;

	public Curriculum() {

	}

	public Curriculum(int curriculumId, String status, String initialPeriod, int ieach, int iepi, int mc, int iea,
			String register, Student student, Course course, String ingressForm, String certification,
			String conclusionDeadlinePeriod, int locksNumber, int extensionsNumber, String leavingDate,
			String leavindReason, String graduationDate, int requiredComponentWorkload, int fulfilledComponentWorkload,
			int requiredActivityWorkload, int fulfilledActivityWorkload, String currentPeriodNumber) {
		this.curriculumId = curriculumId;
		this.status = status;
		InitialPeriod = initialPeriod;
		this.ieach = ieach;
		this.iepi = iepi;
		this.mc = mc;
		this.iea = iea;
		this.register = register;
		this.student = student;
		this.course = course;
		this.ingressForm = ingressForm;
		this.certification = certification;
		this.conclusionDeadlinePeriod = conclusionDeadlinePeriod;
		this.locksNumber = locksNumber;
		this.extensionsNumber = extensionsNumber;
		this.leavingDate = leavingDate;
		this.leavindReason = leavindReason;
		this.graduationDate = graduationDate;
		this.requiredComponentWorkload = requiredComponentWorkload;
		this.fulfilledComponentWorkload = fulfilledComponentWorkload;
		this.requiredActivityWorkload = requiredActivityWorkload;
		this.fulfilledActivityWorkload = fulfilledActivityWorkload;
		this.currentPeriodNumber = currentPeriodNumber;
	}

	public int getCurriculumId() {
		return curriculumId;
	}

	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInitialPeriod() {
		return InitialPeriod;
	}

	public void setInitialPeriod(String initialPeriod) {
		InitialPeriod = initialPeriod;
	}

	public int getIeach() {
		return ieach;
	}

	public void setIeach(int ieach) {
		this.ieach = ieach;
	}

	public int getIepi() {
		return iepi;
	}

	public void setIepi(int iepi) {
		this.iepi = iepi;
	}

	public int getMc() {
		return mc;
	}

	public void setMc(int mc) {
		this.mc = mc;
	}

	public int getIea() {
		return iea;
	}

	public void setIea(int iea) {
		this.iea = iea;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getIngressForm() {
		return ingressForm;
	}

	public void setIngressForm(String ingressForm) {
		this.ingressForm = ingressForm;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getConclusionDeadlinePeriod() {
		return conclusionDeadlinePeriod;
	}

	public void setConclusionDeadlinePeriod(String conclusionDeadlinePeriod) {
		this.conclusionDeadlinePeriod = conclusionDeadlinePeriod;
	}

	public int getLocksNumber() {
		return locksNumber;
	}

	public void setLocksNumber(int locksNumber) {
		this.locksNumber = locksNumber;
	}

	public int getExtensionsNumber() {
		return extensionsNumber;
	}

	public void setExtensionsNumber(int extensionsNumber) {
		this.extensionsNumber = extensionsNumber;
	}

	public String getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(String leavingDate) {
		this.leavingDate = leavingDate;
	}

	public String getLeavindReason() {
		return leavindReason;
	}

	public void setLeavindReason(String leavindReason) {
		this.leavindReason = leavindReason;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public int getRequiredComponentWorkload() {
		return requiredComponentWorkload;
	}

	public void setRequiredComponentWorkload(int requiredComponentWorkload) {
		this.requiredComponentWorkload = requiredComponentWorkload;
	}

	public int getFulfilledComponentWorkload() {
		return fulfilledComponentWorkload;
	}

	public void setFulfilledComponentWorkload(int fulfilledComponentWorkload) {
		this.fulfilledComponentWorkload = fulfilledComponentWorkload;
	}

	public int getRequiredActivityWorkload() {
		return requiredActivityWorkload;
	}

	public void setRequiredActivityWorkload(int requiredActivityWorkload) {
		this.requiredActivityWorkload = requiredActivityWorkload;
	}

	public int getFulfilledActivityWorkload() {
		return fulfilledActivityWorkload;
	}

	public void setFulfilledActivityWorkload(int fulfilledActivityWorkload) {
		this.fulfilledActivityWorkload = fulfilledActivityWorkload;
	}

	public String getCurrentPeriodNumber() {
		return currentPeriodNumber;
	}

	public void setCurrentPeriodNumber(String currentPeriodNumber) {
		this.currentPeriodNumber = currentPeriodNumber;
	}

}
