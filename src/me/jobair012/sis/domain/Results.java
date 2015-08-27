package me.jobair012.sis.domain;

import org.springframework.stereotype.Component;

@Component
public class Results {

	private int resultId;
	private String examName;
	private double cgpa;
	private int students_studentId;

	public Results() {
	}

	public Results(int resultId, String examName, double cgpa,
			int students_studentId) {
		this.resultId = resultId;
		this.examName = examName;
		this.cgpa = cgpa;
		this.students_studentId = students_studentId;
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
