package me.jobair012.sis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import me.jobair012.sis.domain.Results;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class ResultDAO {

	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void saveOrUpdate(Results results)
	{
		if (results.getResultId() > 0) {
			// update
			
			String sql = "UPDATE results SET examName = ?, cgpa = ?, students_studentId = ? WHERE resultId = ?";
			
			jdbcTemplate.update(sql, results.getExamName(), results.getCgpa(), results.getStudents_studentId());
		}
		
		else {
			// save
			
			String sql = "INSERT INTO results (examName, cgpa, students_studentId) VALUES (?, ?, ?)";
			
			jdbcTemplate.update(sql, results.getExamName(), results.getCgpa(), results.getStudents_studentId());
		}
	}
	
	public List<Results> getResultsOfAllStudents()
	{
		String sql = "SELECT * FROM results";
		
		return jdbcTemplate.query(sql, new RowMapper<Results>(){

			@Override
			public Results mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				
				Results result = new Results();
				
				result.setResultId(resultSet.getInt("resultId"));
				result.setExamName(resultSet.getString("examName"));
				result.setCgpa(resultSet.getDouble("cgpa"));
				result.setStudents_studentId(resultSet.getInt("students_studentId"));
				
				return result;
			}
			
		});
	}
	
	public List<Results> getResultsOfParticularStudents(int students_studentId)
	{
		String sql = "SELECT * FROM results WHERE students_studentId = " + students_studentId;
		
		return jdbcTemplate.query(sql, new RowMapper<Results>(){

			@Override
			public Results mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				
				Results result = new Results();
				
				result.setResultId(resultSet.getInt("resultId"));
				result.setExamName(resultSet.getString("examName"));
				result.setCgpa(resultSet.getDouble("cgpa"));
				result.setStudents_studentId(resultSet.getInt("students_studentId"));
				
				return result;
			}
			
		});
	}
	
	public void deleteResult(int students_studentId) {
		
		String sql = "DELETE FROM results WHERE students_studentId = " + students_studentId;
		
		jdbcTemplate.update(sql);
		
	}
}
