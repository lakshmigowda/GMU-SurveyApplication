<!-- Lakshmi Venkataiah-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Welcome Page</title>
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyServlet4/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyServlet4/resources/css/custom.css" />
</head>
<body class="body">
	<div class="container">
		<h4>Thanks for submitting the survey!</h4>
		<p>Survey Results</p>
		<p>Name: ${name}</p>
		<p>Mean: ${databean.mean}</p>
		<p>Standard Deviation: ${databean.sd}</p>
		<p>
			<a href="/StudentSurveyServlet4/createsurvey">Back to Create
				Survey Page</a>
		</p>

		<h4>Current Surveys</h4>
		<c:forEach var="survey" items="${surveys}">
			<a href="/StudentSurveyServlet4/displaysurvey?student=${survey.id}">
				<c:out value="${survey.id}" />
			</a>
			<br>
		</c:forEach>
	</div>
</body>
</html>