<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test welcome page</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="/swe645project/resources/css/test.css" />
<script src="/swe645project/resources/js/test.js"></script>

</head>

<body>
	<div>
		<form:form method="POST" action="/swe645project/testsubmit"
			commandName="padma">
			<p class="test">Welcome to Lakshmi's Spring MVC Test Project!!</p>
			<table>
				<tr>
					<td><form:label path="testName">TestName:</form:label></td>
					<td><form:input path="testName" id="name"></form:input></td>
				</tr>
				<tr>
				<tr>
					<td><input type="submit" id="submit" class="submitbtn"
						value="Submit"></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>