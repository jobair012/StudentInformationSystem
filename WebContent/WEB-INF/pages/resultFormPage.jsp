<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Result Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
</head>
<body>
	<%@ include file="header.jsp"%>

	<div class="container">
		<table>
			<form:form action="saveOrUpdateResult" method="get"
				commandName="results">
				<h2>Fill the following form please!</h2>
				<br>

				<tr>
					<td>Student ID:</td>
					<td><form:input path="students_studentId" placeholder="Enter student ID" /></td>
				</tr>
				<tr>
					<td>Examination Name:</td>
					<td><form:select path="examName">
							<form:option value="" label="Select" />
							<form:options items="${examNameList}" />
						</form:select></td>
				</tr>
				<tr>
					<td>Marks/CGPA:</td>
					<td><form:input path="cgpa" placeholder="Enter marks or cgpa" /></td>
				</tr>


				<tr>
					<td><input type="reset" value="reset" /></td>
					<td><form:button>Submit</form:button></td>
				</tr>
				<tr>
			</form:form>
		</table>


	</div>


	<%@ include file="footer.jsp"%>
</body>
</html>