package me.jobair012.sis.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Student {

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

	public Student() {

	}

	public Student(String name, int roll, String depertment,
			String semester, String degree, Date admissionDate, String session,
			String batchNumber, String phoneNumber, String address) {
		
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

}
