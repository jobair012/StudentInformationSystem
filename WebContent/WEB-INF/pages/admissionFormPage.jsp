<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Admission Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="container">
		<table>
			<form:form action="saveOrUpdateStudent" method="post"
				commandName="student">
				<h2>Fill the following form please!</h2>
				<br>
				<form:hidden path="studentId" />
				<form:hidden path="admissionDate" value="2014/09/09" />

				<tr>
					<td>Name:</td>
					<td><form:input path="name" placeholder="Enter Your Name" /></td>
				</tr>
				<tr>
					<td>Roll:</td>
					<td><form:input path="roll" placeholder="Enter Your Roll" /></td>
				</tr>
				<tr>
					<td>Semester:</td>
					<td><form:select path="semester">
							<form:option value="" label="Select" />
							<form:options items="${semesterList}" />
						</form:select></td>
				</tr>
				<tr>
					<td>Degree:</td>
					<td><form:radiobuttons path="degree" items="${degreeList}" /></td>
				</tr>


				<tr>
					<td>Department:</td>
					<td><form:radiobuttons path="depertment"
							items="${departmentList}" /></td>
				</tr>
				<tr>
					<td>Session:</td>
					<td><form:input path="session"
							placeholder="Enter Your session" /></td>
				</tr>
				<tr>
					<td>Batch:</td>
					<td><form:input path="batchNumber" placeholder="Enter Batch" /></td>
				</tr>
				<tr>
					<td>Phone Number:</td>
					<td><form:input path="phoneNumber" placeholder="0123 456 789" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" placeholder="Enter Batch" /></td>
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