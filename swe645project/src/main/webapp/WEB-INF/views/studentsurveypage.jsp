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
	<div class="form-container">
		<form:form method="POST" action="/swe645project/surveysubmit"
			commandName="surveyresult" id="surveyform">
			<div class="form-title">
				<p class="red">Welcome to Volgenau School's Student Survey!!</p>
			</div>
			<table>
				<tr>
					<td><form:label path="firstName" class="form-label">First Name:</form:label></td>
					<td><form:input path="firstName" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="lastName" class="form-label">Last Name:</form:label></td>
					<td><form:input path="lastName" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="streetAddress" class="form-label">Street Address:</form:label></td>
					<td><form:input path="streetAddress" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="city" class="form-label">City:</form:label></td>
					<td><form:input path="city" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="state" class="form-label">State:</form:label></td>
					<td><form:input path="state" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="phone" class="form-label">Telephone Number:</form:label></td>
					<td><form:input path="phone" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="email" class="form-label">E-mail:</form:label></td>
					<td><form:input path="email" class="input form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="surveyDate" class="form-label">Date of Survey:</form:label></td>
					<td><form:input path="surveyDate" class="input form-field"
							id="surveydate"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="likedAboutSchool" class="form-label"> What you liked most about the school? You are allowed to
						make multiple selections.</form:label></td>
					<td><form:checkboxes items="${likingvalues}"
							class="form-field" path="likedAboutSchool" /></td>
				</tr>
				<tr>
					<td><form:label path="interest" class="form-label">How did you become interested in Virginia School? :</form:label></td>
					<td><form:radiobutton path="interest" value="friends"
							class="form-field" />Friends <form:radiobutton path="interest"
							value="television" class="form-field" />Television <form:radiobutton
							path="interest" value="internet" class="form-field" />Internet <form:radiobutton
							path="interest" value="other" class="form-field" />Other</td>
				</tr>
				<tr>
					<td><form:label path="recommend" class="form-label">How likely you recommend Virginia School to your friends?</form:label></td>
					<td><form:select path="recommend" class="form-field">
							<form:option value="NONE" label="--- Select ---" />
							<form:option value="VERYLIKELY" label="Very Likely" />
							<form:option value="LIKELY" label="Likely" />
							<form:option value="UNLIKELY" label="Unlikely" />
						</form:select></td>
				</tr>
				<tr>
					<td><form:label path="raffle" class="form-label">Enter 10 numbers between 1 and 100 separated by comma to
						win a raffle ticket to movie</form:label></td>
					<td><form:input path="raffle" id="raffle" class="form-field"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="comments" class="form-label"> Enter any additional comments here:</form:label></td>
					<td><form:textarea path="comments" rows="5" cols="30"
							class="form-field" /></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit"
						class="submit-button form-submit" value="Submit"></td>
				</tr>
			</table>
		</form:form>
		<button onclick="location.href='/swe645project/studenthomepage'"
			class="submit-button">Cancel</button>
	</div>
</body>
</html>