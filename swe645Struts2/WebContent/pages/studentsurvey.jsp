<!-- 
Lakshmi Venkataiah
This is student survey page which has a form to get all the survey data
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Survey Form</title>
<style type="text/css">
.error {
	background-color: #FFCCCC;
	width: 500px;
	border: 1px solid #CC0000;
}

.body {
	background-color: #CCEEFF;
}
</style>

</head>

<body class="body">
	<div class="form-container">

		<s:if test="hasActionErrors()">
			<div class="error">
				<s:actionerror />
			</div>
		</s:if>
		<s:form action="storesurvey.action">
			<div class="form-title">
				<h2>Welcome to Volgenau School's Student Survey!!</h2>
			</div>
			<table>
				<tr>
					<td><label for="student.firstName">First Name</label></td>
					<td><s:textfield name="student.firstName" label="First Name" /></td>
				</tr>
				<tr>
					<td><label for="student.lastName">Last Name</label></td>
					<td><s:textfield name="student.lastName" label="Last Name" /></td>
				</tr>
				<tr>
					<td><label for="student.streetAddress">Street Address</label></td>
					<td><s:textfield name="student.streetAddress"
							label="Street Address" /></td>
				</tr>
				<tr>
					<td><label for="student.city">City</label></td>
					<td><s:textfield name="student.city" label="City" /></td>
				</tr>
				<tr>
					<td><label for="student.state">State</label></td>
					<td><s:textfield name="student.state" label="State" /></td>
				</tr>
				<tr>
					<td><label for="student.phone">Phone</label></td>
					<td><s:textfield name="student.phone" label="Phone" /></td>
				</tr>
				<tr>
					<td><label for="student.email">Mail</label></td>
					<td><s:textfield name="student.email" label="Email" /></td>
				</tr>
				<tr>
					<td><label for="student.surveyDate">Survey Date</label></td>
					<td><s:textfield name="student.surveyDate" label="Survey Date"
							id="surveydate" /></td>
				</tr>
				<tr>
					<td><label for="student.likedAboutSchool" class="form-label">
							What you liked most about the school? You are allowed to make
							multiple selections.</label></td>
					<td><s:checkboxlist key="student.likedAboutSchool"
							list="likinglist" /></td>
				</tr>
				<tr>
					<td><label for="student.interest" class="form-label">How
							did you become interested in Virginia School? :</label></td>
					<td><s:radio key="student.interest" list="interestlist" /></td>
				</tr>
				<tr>
					<td><label for="student.recommend" class="form-label">How
							likely you recommend Virginia School to your friends?</label></td>
					<td><s:select key="student.recommend"
							list="recommendationlist" /></td>
				</tr>
				<tr>
					<td><label for="student.raffle">Enter
							10 numbers between 1 and 100 separated by comma to win a raffle
							ticket to movie</label></td>
					<td><s:textfield name="student.raffle"
							label="Raffle" /></td>
				</tr>
				<tr>
					<td><label for="student.comments">Comments </label></td>
					<td><s:textarea name="student.comments" label="Comments"
							rows="5" cols="30" /></td>
				</tr>
				<tr>
					<td align="left"><s:submit class="submit-button form-submit" /></td>
				</tr>
			</table>
		</s:form>
		<button onclick="location.href='/swe645Struts2/welcome'"
			class="submit-button">Cancel</button>
	</div>
</body>
</html>