<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="header">
	<div class="headerUp">
		<div id="logo">
			<a href="/StudentInformationSystem/"><img
				src="${pageContext.request.contextPath}/resources/images/logo.png" /></a>
		</div>

		<!-- <div class="login_pannel">
			<a href="login.jsp"> <span>login</span></a>
		</div> -->

		<%--  <c:url value="/logout" var="logoutUrl" /> --%>

		<form action="logout" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<script>
			function formSubmit() {
				document.getElementById("logoutForm").submit();
			}
		</script>

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<p>
				<span>Hi, ${pageContext.request.userPrincipal.name}</span> | <a
					href="javascript:formSubmit()"> Logout</a>
			</p>
		</c:if>


	</div>

	<div class="headerDown">
		<div class="navigation">
			<ul>
				<li><a href="${pageContext.request.contextPath}/allStudents">SEE
						ALL STUDENTS</a></li>
				<li><a href="${pageContext.request.contextPath}/addNewStudent">ADD
						A NEW STUDENT</a></li>
				<li><a href="${pageContext.request.contextPath}/search">SEARCH
						STUDENTS</a></li>
				<li><a href="${pageContext.request.contextPath}/addNewResult">INSERT
						RESULT</a></li>
			</ul>
		</div>
	</div>
</div>