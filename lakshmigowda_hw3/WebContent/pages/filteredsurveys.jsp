<!-- 
Lakshmi Venkataiah
This is list survey jsp file which shows list of surveys data.
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search survey</title>
<style type="text/css">
.body {
	background-color: #CCEEFF;
}
</style>
</head>

<body class="body">

	<div class="form-container">
		<h3>List of filtered surveys!</h3>
		<table border="1px solid">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Phone</th>
				<th>Email</th>
				<th>Survey Date</th>
				<th>Most Liked</th>
				<th>Interest</th>
				<th>Recommend</th>
				<th>Raffle</th>
				<th>Comments</th>
			</tr>
			<s:iterator value="surveylist">
				<tr>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="streetAddress" /></td>
					<td><s:property value="city" /></td>
					<td><s:property value="state" /></td>
					<td><s:property value="phone" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="surveyDate" /></td>
					<td><s:property value="likedAboutSchool" /></td>
					<td><s:property value="interest" /></td>
					<td><s:property value="recommend" /></td>
					<td><s:property value="raffle" /></td>
					<td><s:property value="comments" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
	<br>
	<button onclick="location.href='/lakshmigowda_hw3/searchsurvey'"
		class="submit-button">Search again!</button>
	<br>
	<br>
	<button onclick="location.href='/lakshmigowda_hw3/welcome'"
		class="submit-button">Back to homepage!</button>

</body>
</html>