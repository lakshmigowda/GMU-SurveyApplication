<!-- Lakshmi Venkataiah -->
<!-- This page has a survey form input fields, submit and cancel buttons. 
This is used to collect survey data from students -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Survey Page</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="/swe645project/resources/css/survey.css" />
<script src="/swe645project/resources/js/studentSurveyData.js"></script>

<script src="/swe645project/resources/jqueryui/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css"
	href="/swe645project/resources/jqueryui/jquery-ui.css" />
</head>

<body>
	<div>
		<form:form method="POST" action="/swe645project/surveysubmit"
			commandName="surveyresult" id="surveyform">
			<p class="red">Welcome to Volgenau School's Student Survey!!</p>
			<table>
				<tr>
					<td><form:label path="firstName">First Name:</form:label></td>
					<td><form:input path="firstName" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name:</form:label></td>
					<td><form:input path="lastName" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="streetAddress">Street Address:</form:label></td>
					<td><form:input path="streetAddress" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="city">City:</form:label></td>
					<td><form:input path="city" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="state">State:</form:label></td>
					<td><form:input path="state" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="phone">Telephone Number:</form:label></td>
					<td><form:input path="phone" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="email">E-mail:</form:label></td>
					<td><form:input path="email" class="input"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="surveyDate">Date of Survey:</form:label></td>
					<td><form:input path="surveyDate" class="input"
							id="surveydate"></form:input></td>
				</tr>
				<tr>
					<td>What you liked most about the school? You are allowed to
						make multiple selections.</td>
					<td><form:checkboxes items="${likingvalues}"
							path="likedAboutSchool" /></td>
				</tr>
				<tr>
					<td>How did you become interested in Virginia School? :</td>
					<td><form:radiobutton path="interest" value="friends" />Friends
						<form:radiobutton path="interest" value="television" />Television
						<form:radiobutton path="interest" value="internet" />Internet <form:radiobutton
							path="interest" value="other" />Other</td>
				</tr>
				<tr>
					<td>How likely you recommend Virginia School to your friends?</td>
					<td><form:select path="recommend">
							<form:option value="NONE" label="--- Select ---" />
							<form:option value="VERYLIKELY" label="Very Likely" />
							<form:option value="LIKELY" label="Likely" />
							<form:option value="UNLIKELY" label="Unlikely" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="raffle">Enter 10 numbers between 1 and 100 separated by comma to
						win a raffle ticket to movie</form:label></td>
					<td><form:input path="raffle" id="raffle"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="comments"> Enter any additional comments here:</form:label></td>
					<td><form:textarea path="comments" rows="5" cols="30" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" class="submitbtn"
						value="Submit"></td>
				</tr>
			</table>
		</form:form>
		<button onclick="location.href='/swe645project/studenthomepage'">Cancel</button>
	</div>
</body>
</html>