package me.jobair012.sis.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import me.jobair012.sis.domain.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(Student student) {
		if (student.getStudentId() > 0) {
			// update

			String sql = "UPDATE students SET name = ?, roll = ?, depertment = ?, semester = ?, degree = ?, admissionDate = ?, session = ?, batchNumber = ?, phoneNumber = ?, address = ? WHERE studentId = ?";

			jdbcTemplate.update(sql, student.getName(), student.getRoll(),
					student.getDepertment(), student.getSemester(),
					student.getDegree(), student.getAdmissionDate(),
					student.getSession(), student.getBatchNumber(),
					student.getPhoneNumber(), student.getAddress(),
					student.getStudentId());
		}

		else {
			// save

			String sql = "INSERT INTO students (name, roll, depertment, semester, degree, admissionDate, session, batchNumber, phoneNumber, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			jdbcTemplate.update(sql, student.getName(), student.getRoll(),
					student.getDepertment(), student.getSemester(),
					student.getDegree(), student.getAdmissionDate(),
					student.getSession(), student.getBatchNumber(),
					student.getPhoneNumber(), student.getAddress());
		}
	}

	public List<Student> getAllStudents() {
		String sql = "SELECT * FROM students";

		return jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {

				Student student = new Student();

				student.setStudentId(resultSet.getInt("studentId"));
				student.setName(resultSet.getString("name"));
				student.setRoll(resultSet.getInt("roll"));
				student.setSemester(resultSet.getString("semester"));
				student.setDepertment(resultSet.getString("depertment"));
				student.setDegree(resultSet.getString("degree"));
				student.setAdmissionDate(resultSet.getDate("admissionDate"));
				student.setSession(resultSet.getString("session"));
				student.setBatchNumber(resultSet.getString("batchNumber"));
				student.setPhoneNumber(resultSet.getString("phoneNumber"));
				student.setAddress(resultSet.getString("address"));

				return student;
			}

		});
	}

	public void delete(int studentId) {
		String sql = "DELETE FROM students WHERE studentId = " + studentId;

		jdbcTemplate.update(sql);
	}

	public Student getDetailsOfParicularStudent(int studentId) {
		String sql = "SELECT * FROM students WHERE studentId = " + studentId;

		return jdbcTemplate.query(sql, new ResultSetExtractor<Student>() {

			@Override
			public Student extractData(ResultSet resultSet)
					throws SQLException, DataAccessException {

				if (resultSet.next()) {

					Student student = new Student();

					student.setStudentId(resultSet.getInt("studentId"));
					student.setName(resultSet.getString("name"));
					student.setRoll(resultSet.getInt("roll"));
					student.setSemester(resultSet.getString("semester"));
					student.setDepertment(resultSet.getString("depertment"));
					student.setDegree(resultSet.getString("degree"));
					student.setAdmissionDate(resultSet.getDate("admissionDate"));
					student.setSession(resultSet.getString("session"));
					student.setBatchNumber(resultSet.getString("batchNumber"));
					student.setPhoneNumber(resultSet.getString("phoneNumber"));
					student.setAddress(resultSet.getString("address"));

					return student;

				}
				
				else {
					return null;
				}
			}

		});
	}
	
	
	public List<Student> getAllStudentsByDepartment(String department) {
		String sql = "SELECT * FROM students WHERE depertment = '" +department+ "'";
		
		return jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet resultSet, int rowNum)
					throws SQLException {

				Student student = new Student();

				student.setStudentId(resultSet.getInt("studentId"));
				student.setName(resultSet.getString("name"));
				student.setRoll(resultSet.getInt("roll"));
				student.setSemester(resultSet.getString("semester"));
				student.setDepertment(resultSet.getString("depertment"));
				student.setDegree(resultSet.getString("degree"));
				student.setAdmissionDate(resultSet.getDate("admissionDate"));
				student.setSession(resultSet.getString("session"));
				student.setBatchNumber(resultSet.getString("batchNumber"));
				student.setPhoneNumber(resultSet.getString("phoneNumber"));
				student.setAddress(resultSet.getString("address"));

				return student;
			}

		});
	}


}
