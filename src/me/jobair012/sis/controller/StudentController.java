package me.jobair012.sis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import me.jobair012.sis.domain.Results;
import me.jobair012.sis.domain.Student;
import me.jobair012.sis.services.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	private Services services;

	
	/*--------- SEE List of All Students ----------*/
	
	@RequestMapping(value = "/allStudents", method = RequestMethod.GET)
	public ModelAndView allStudents() {
		ModelAndView model = new ModelAndView("studentPage");

		model.addObject("allStudents", services.getStudents());

		return model;
		
		
	}

	
	
	/*--------- Form Controller to ADD STUDENT ----------*/
	
	@RequestMapping(value = "/addNewStudent", method = RequestMethod.GET)
	public ModelAndView addNewStudent() {
		ModelAndView model = new ModelAndView("admissionFormPage");

		Student student = new Student();

		model.addObject("student", student);
		
	//	Date todaysDate = new Date();
		model.addObject("todaysDate", new java.util.Date());

		List<String> departmentList = new ArrayList<String>();
		departmentList.add("CSE");
		departmentList.add("ECE");
		departmentList.add("BBA");
		model.addObject("departmentList", departmentList);

		String[] semesterList = { "1st", "2nd", "3rd", "4th", "5th", "6th",
				"7th", "8th" };
		model.addObject("semesterList", semesterList);

		List<String> degreeList = new ArrayList<String>();
		degreeList.add("Undergraduate");
		degreeList.add("Graduate");
		degreeList.add("Diploma");
		model.addObject("degreeList", degreeList);

		return model;
	}
	
	
	
	
	
	/*--------- INSERT or UPDATE Student ----------*/

	@RequestMapping(value = "/saveOrUpdateStudent", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateStudent(
			@ModelAttribute("student") Student student) {
		services.saveOrUpdateStudents(student);

		return new ModelAndView("redirect:/allStudents");
	}

	
	
	
	
	
	
	/*--------- Edit Student Information (EDIT STUDENT) ----------*/
	
	
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editStudent(HttpServletRequest request) {

		ModelAndView model = new ModelAndView("admissionFormPage");

		int studentId = Integer.parseInt(request.getParameter("id"));

		model.addObject("student", services.getParticularStudent(studentId));

		List<String> departmentList = new ArrayList<String>();
		departmentList.add("CSE");
		departmentList.add("ECE");
		departmentList.add("BBA");
		model.addObject("departmentList", departmentList);

		String[] semesterList = { "1st", "2nd", "3rd", "4th", "5th", "6th",
				"7th", "8th" };
		model.addObject("semesterList", semesterList);

		List<String> degreeList = new ArrayList<String>();
		degreeList.add("Undergraduate");
		degreeList.add("Graduate");
		degreeList.add("Diploma");
		model.addObject("degreeList", degreeList);

		return model;
	}
	
	
	
	
	
	/*--------- Delete A Particular Student ----------*/

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteStudent(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));

		services.deleteStudent(studentId);
		;

		return new ModelAndView("redirect:/allStudents");
	}

	
	
	
	
	/*--------- View Details of Particular Students (VIEW MORE) ----------*/

	@RequestMapping(value = "/viewMore", method = RequestMethod.GET)
	public ModelAndView viewMore(HttpServletRequest request) {

		ModelAndView model = new ModelAndView("studentsDetailPage");
		int studentId = Integer.parseInt(request.getParameter("id"));

		Student student = services.getParticularStudent(studentId);
		model.addObject("student", student);

		List<Results> results = services
				.getResultsOfParticularStuents(studentId);
		model.addObject("results", results);

		return model;
	}
	
	
	
	@RequestMapping(value = "/addNewResult", method = RequestMethod.GET)
	public ModelAndView addNewResult()
	{
		ModelAndView model = new ModelAndView("resultFormPage");
		
		Results results = new Results();
		model.addObject("results", results);
		
		List<String> examNameList = new ArrayList<String>();
		examNameList.add("1st Incourse");
		examNameList.add("2nd Incourse");
		examNameList.add("Model Test");
		examNameList.add("Semester Final");
		model.addObject("examNameList", examNameList);
		
		return model;
	}
	
	
	
	@RequestMapping(value = "/saveOrUpdateResult", method = RequestMethod.GET)
	public ModelAndView saveOrUpdateResult(@ModelAttribute("results") Results results, HttpServletRequest request)
	{
		ModelAndView model = new ModelAndView("studentsDetailPage");
		
		int studentId = Integer.parseInt(request.getParameter("students_studentId"));
		
		services.saveOrUpdateResults(results);

		Student student = services.getParticularStudent(studentId);
		model.addObject("student", student);

		List<Results> results1 = services
				.getResultsOfParticularStuents(studentId);
		model.addObject("results", results1);

		return model;
	}
	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchStudent()
	{		
		ModelAndView model = new ModelAndView("searchPage");
		
		Student student = new Student();
		
		model.addObject("student", student);
		
		List<String> departmentList = new ArrayList<String>();
		departmentList.add("CSE");
		departmentList.add("ECE");
		departmentList.add("BBA");
		model.addObject("departmentList", departmentList);
		
		
		return model;
	}
	
	@RequestMapping(value = "/doSearch", method = RequestMethod.GET)
	public ModelAndView searchStudentById(@ModelAttribute("student") Student student, HttpServletRequest request)
	{			
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		
		ModelAndView model = new ModelAndView("studentsDetailPage");

		Student student1 = services.getParticularStudent(studentId);
		model.addObject("student", student1);

		List<Results> results = services
				.getResultsOfParticularStuents(studentId);
		model.addObject("results", results);

		return model;
	}
	
	@RequestMapping(value = "/doSearchByDepartment", method = RequestMethod.GET)
	public ModelAndView searchStudentByDepartment(@ModelAttribute("student") Student student, HttpServletRequest request)
	{	
		ModelAndView model = new ModelAndView("studentPage");

		String department = request.getParameter("depertment");
		
		model.addObject("allStudents", services.getAllStudentsByDepartment(department));

		return model;
	}
}
