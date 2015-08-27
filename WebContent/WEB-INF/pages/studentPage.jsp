<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Students</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="container">

		<p>List of All Students</p>

		<table>
			<tr>
				<th><c:out value="Student ID"></c:out></th>
				<th><c:out value="Name"></c:out></th>
				<th><c:out value="Roll"></c:out></th>
				<th><c:out value="Department"></c:out></th>
				<th><c:out value="Semester"></c:out></th>
				<th><c:out value="Degree"></c:out></th>
				<th><c:out value="Action"></c:out></th>
			</tr>
			<c:forEach var="students" items="${allStudents}">
				<tr>
					<td><c:out value="${students.studentId}"></c:out></td>
					<td><c:out value="${students.name}"></c:out></td>
					<td><c:out value="${students.roll}"></c:out></td>
					<td><c:out value="${students.depertment}"></c:out></td>
					<td><c:out value="${students.semester}"></c:out></td>
					<td><c:out value="${students.degree}"></c:out></td>
					<td>
						<a href="${pageContext.request.contextPath}/editStudent?id=${students.studentId}">Edit</a>
						&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath}/deleteStudent?id=${students.studentId}">Delete</a>
						&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath}/viewMore?id=${students.studentId}">View More</a>
					</td>
				</tr>
			</c:forEach>
		</table>

	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>