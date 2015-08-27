<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Students Detail</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="container">

		<p>General Information:</p>


		<table>
			<tr>
				<td>ID:</td>
				<td><c:out value="${student.studentId}"></c:out></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><c:out value="${student.name}"></c:out></td>
			</tr>
			<tr>
				<td>Roll:</td>
				<td><c:out value="${student.roll}"></c:out></td>
			</tr>
			<tr>
				<td>Department:</td>
				<td><c:out value="${student.depertment}"></c:out></td>
			</tr>
			<tr>
				<td>Semester:</td>
				<td><c:out value="${student.semester}"></c:out></td>
			</tr>
			<tr>
				<td>Session:</td>
				<td><c:out value="${student.session}"></c:out></td>
			</tr>
			<tr>
				<td>Batch:</td>
				<td><c:out value="${student.batchNumber}"></c:out></td>
			</tr>
			<tr>
				<td>Degree:</td>
				<td><c:out value="${student.degree}"></c:out></td>
			</tr>
			<tr>
				<td>Admission Date:</td>
				<td><c:out value="${student.admissionDate}"></c:out></td>
			</tr>
			<tr>
				<td><a
					href="${pageContext.request.contextPath}/deleteStudent?id=${student.studentId}">Delete
						Student</a></td>
				<td><a
					href="${pageContext.request.contextPath}/editStudent?id=${student.studentId}">Edit
						Details</a></td>
			</tr>
		</table>


		<p>Results:</p>

		<a href="${pageContext.request.contextPath}/addNewResult?id=${student.studentId}">Add results</a>

		<table>
			<tr>
				<th><c:out value="Examination Name"></c:out></th>
				<th><c:out value="Marks or CGPA"></c:out></th>
				<th><c:out value="Student ID"></c:out></th>
			</tr>
			<c:forEach var="result" items="${results}">
				<tr>
					<td><c:out value="${result.examName}"></c:out></td>
					<td><c:out value="${result.cgpa}"></c:out></td>
					<td><c:out value="${result.students_studentId}"></c:out></td>
				</tr>
			</c:forEach>
		</table>

	</div>


	<%@ include file="footer.jsp"%>

</body>
</html>