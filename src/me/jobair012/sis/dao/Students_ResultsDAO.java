package me.jobair012.sis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import me.jobair012.sis.domain.Students_Results;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class Students_ResultsDAO {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Students_Results> getAllDetailsOfParticularStudent(int studentId) {
		
		String sql = "SELECT * FROM results INNER JOIN students on students.studentId = results.students_studentId WHERE students_studentId = " +studentId;
	
		return jdbcTemplate.query(sql, new RowMapper<Students_Results>(){

			@Override
			public Students_Results mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {
				
				Students_Results studentsResults = new Students_Results();
				
				studentsResults.setStudentId(resultSet.getInt("studentId"));
				studentsResults.setName(resultSet.getString("name"));
				studentsResults.setRoll(resultSet.getInt("roll"));
				studentsResults.setSemester(resultSet.getString("semester"));
				studentsResults.setDepertment(resultSet.getString("depertment"));
				studentsResults.setDegree(resultSet.getString("degree"));
				studentsResults.setAdmissionDate(resultSet.getDate("admissionDate"));
				studentsResults.setSession(resultSet.getString("session"));
				studentsResults.setBatchNumber(resultSet.getString("batchNumber"));
				studentsResults.setPhoneNumber(resultSet.getString("phoneNumber"));
				studentsResults.setAddress(resultSet.getString("address"));
				
				studentsResults.setResultId(resultSet.getInt("resultId"));
				studentsResults.setExamName(resultSet.getString("examName"));
				studentsResults.setCgpa(resultSet.getDouble("cgpa"));
				studentsResults.setStudents_studentId(resultSet.getInt("students_studentId"));
				
				return studentsResults;
			}
			
		});
	}

	public List<Students_Results> getAllDetailsOfAllStudent() {
		
		String sql = "SELECT * FROM results INNER JOIN students";
	
		return jdbcTemplate.query(sql, new RowMapper<Students_Results>(){

			@Override
			public Students_Results mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {
				
				Students_Results studentsResults = new Students_Results();
				
				studentsResults.setStudentId(resultSet.getInt("studentId"));
				studentsResults.setName(resultSet.getString("name"));
				studentsResults.setRoll(resultSet.getInt("roll"));
				studentsResults.setSemester(resultSet.getString("semester"));
				studentsResults.setDepertment(resultSet.getString("depertment"));
				studentsResults.setDegree(resultSet.getString("degree"));
				studentsResults.setAdmissionDate(resultSet.getDate("admissionDate"));
				studentsResults.setSession(resultSet.getString("session"));
				studentsResults.setBatchNumber(resultSet.getString("batchNumber"));
				studentsResults.setPhoneNumber(resultSet.getString("phoneNumber"));
				studentsResults.setAddress(resultSet.getString("address"));
				
				studentsResults.setResultId(resultSet.getInt("resultId"));
				studentsResults.setExamName(resultSet.getString("examName"));
				studentsResults.setCgpa(resultSet.getDouble("cgpa"));
				studentsResults.setStudents_studentId(resultSet.getInt("students_studentId"));
				
				return studentsResults;
			}
			
		});
	}

}
