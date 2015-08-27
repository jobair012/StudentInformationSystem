<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Result Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>
	All results
	<br>

	<table>
		<c:forEach var="results" items="${allResults}">
			<tr>
				<td><c:out value="${results.resultId}"></c:out></td>
				<td><c:out value="${results.examName}"></c:out></td>
				<td><c:out value="${results.cgpa}"></c:out></td>
				<td><c:out value="${results.students_studentId}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>