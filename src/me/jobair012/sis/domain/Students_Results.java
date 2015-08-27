package me.jobair012.sis.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Students_Results {

	private int studentId;
	private String name;
	private int roll;
	private String depertment;
	private String semester;
	private String degree;
	private Date admissionDate;
	private String session;
	private String batchNumber;
	private String phoneNumber;
	private String address;

	private int resultId;
	private String examName;
	private double cgpa;
	private int students_studentId;

	public Students_Results() {
	}

	public Students_Results(int studentId, String name, int roll,
			String depertment, String semester, String degree,
			Date admissionDate, String session, String batchNumber,
			String phoneNumber, String address, int resultId, String examName,
			double cgpa, int students_studentId) {
		this.studentId = studentId;
		this.name = name;
		this.roll = roll;
		this.depertment = depertment;
		this.semester = semester;
		this.degree = degree;
		this.admissionDate = admissionDate;
		this.session = session;
		this.batchNumber = batchNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.resultId = resultId;
		this.examName = examName;
		this.cgpa = cgpa;
		this.students_studentId = students_studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getDepertment() {
		return depertment;
	}

	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getStudents_studentId() {
		return students_studentId;
	}

	public void setStudents_studentId(int students_studentId) {
		this.students_studentId = students_studentId;
	}

}
