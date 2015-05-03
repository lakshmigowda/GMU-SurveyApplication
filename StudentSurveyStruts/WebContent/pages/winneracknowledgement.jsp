<!--Lakshmi Venkataiah-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Welcome Page</title>
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyStruts/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyStruts/resources/css/custom.css" />
</head>
<body class="body">
	<div class="container">
		<h1>Congratulations! You have won 2 movie tickets!</h1>
		<h1>Thanks for submitting the survey!</h1>
		<p>Survey Results</p>
		<p>
			Name:
			<s:property value="student.name" />
		</p>
		<p>
			Mean:
			<s:property value="databean.mean" />
		</p>
		<p>
			Standard Deviation:
			<s:property value="databean.sd" />
		</p>
		<p>
			<a href="/StudentSurveyStruts/createsurvey">Back to Create Survey
				Page</a>
		</p>

		<h4>Current Surveys</h4>
		<c:forEach var="survey" items="${surveys}">
			<a href="/StudentSurveyStruts/displaysurvey?student=${survey.id}">
				<c:out value="${survey.id}" />
			</a>
			<br>
		</c:forEach>
	</div>
</body>
</html>