<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Student Information System</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>

<body>
	<%@ include file="header.jsp"%>

	<img class="flatImage"
		src="${pageContext.request.contextPath}/resources/images/flatImage.jpg">

	<div class="iconArea">
		<table>
			<tr>
				<td><a href="${pageContext.request.contextPath}/addNewStudent"><img
						src="${pageContext.request.contextPath}/resources/images/addNew.png">
						<br> <br> Add a new Student</a></td>
				<td><a href="${pageContext.request.contextPath}/allStudents"><img
						src="${pageContext.request.contextPath}/resources/images/listb.png"><br>
						<br>List of All Student</a></td>
				<td><a href="${pageContext.request.contextPath}/search"><img
						src="${pageContext.request.contextPath}/resources/images/search.gif"><br>
						<br>Search Student</a></td>
			</tr>
		</table>
	</div>

	<div class="footerDown">
		<span>&copy; All rights reserved by jobair012</span>
	</div>
</body>
</html>