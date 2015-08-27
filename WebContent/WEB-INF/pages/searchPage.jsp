<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Student Information System</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css" />
</head>

<body>
	<%@ include file="header.jsp"%>



	<form:form action="doSearch" method="get" commandName="student"
		id="searchForm">
	<p>Search Student by Student ID:</p>
	
		Student ID: <form:input path="studentId" />
		&nbsp;&nbsp;
		<form:button>Search</form:button>
	</form:form>
	
	<form:form action="doSearchByDepartment" method="get" commandName="student"
		id="searchFormByDepartment">
	<p>Search All Students of Particular Department</p>
	
		Department: <form:select path="depertment">
			<form:option value="" label="select"/>
			<form:options items="${departmentList}"/>
		</form:select>
		&nbsp;&nbsp;
		<form:button>Search</form:button>
	</form:form>

	<%@ include file="footer.jsp" %>
</body>
</html>