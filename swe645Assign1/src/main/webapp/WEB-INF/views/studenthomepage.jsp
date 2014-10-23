<!-- Lakshmi Venkataiah -->
<!--  This is a HTML page for student homepage.
This has welcome message and link to the survey page-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Home Page</title>
<link rel="stylesheet" type="text/css"
	href="/swe645Assign1/resources/css/survey.css" />
</head>
<body>
	<div class="form-container">
		<h1 class="label">Welcome to Volgenau School!!!</h1>
		<p class="label">
			Volgenau School wishes to conduct students survey to know about
			student's satisfaction about various aspects of School. Kindly,
			follow the below link to complete the survey.<br> <a
				href="/swe645Assign1/studentsurveypage">Student Survey</a>
		</p>
		<p class="label">
			Link to second project<br> <a href="/swe645Assign2/welcome">Second
				Project</a>
		</p>
		<p class="label">
			Link to third project<br> <a href="/lakshmi_hw3/welcome">Third
				project Survey</a>
		</p>
	</div>
</body>
</html>