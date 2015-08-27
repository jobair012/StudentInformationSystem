package me.jobair012.sis.services;

import java.util.List;

import me.jobair012.sis.dao.ResultDAO;
import me.jobair012.sis.dao.StudentDAO;
import me.jobair012.sis.dao.Students_ResultsDAO;
import me.jobair012.sis.domain.Results;
import me.jobair012.sis.domain.Student;
import me.jobair012.sis.domain.Students_Results;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

	@Autowired
	private StudentDAO studentsDAO;
	
	@Autowired
	private ResultDAO resultDAO;
	
	@Autowired
	private Students_ResultsDAO students_ResultsDAO;
	
	
	public List<Student> getStudents()
	{
		return studentsDAO.getAllStudents();
	}
	
	public List<Student> getAllStudentsByDepartment(String department) {
		return studentsDAO.getAllStudentsByDepartment(department);
	}
	
	public Student getParticularStudent(int studentId)
	{
		return studentsDAO.getDetailsOfParicularStudent(studentId);
	}
	
	public void saveOrUpdateStudents(Student students)
	{
		studentsDAO.saveOrUpdate(students);
	}
	
	public void deleteStudent(int studentId)
	{
		studentsDAO.delete(studentId);
	}
	
	public List<Results> getResults() {
		return resultDAO.getResultsOfAllStudents();
	}
	
	public void saveOrUpdateResults(Results results) {
		resultDAO.saveOrUpdate(results);
	}
	
	public List<Results> getResultsOfParticularStuents(int students_studentId) {
		return resultDAO.getResultsOfParticularStudents(students_studentId);
	}
	
	public List<Students_Results> getAllDetailsOfParticularStuents(int students_studentId) {
		return students_ResultsDAO.getAllDetailsOfParticularStudent(students_studentId);
	}
	
	public List<Students_Results> getAllDetailsOfAllStuents() {
		return students_ResultsDAO.getAllDetailsOfAllStudent();
	}
}
