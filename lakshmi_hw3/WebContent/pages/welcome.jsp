<!-- 
Lakshmi Venkataiah
This is welcome page of the application which has links to create survey and list survey pages 
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Welcome Page</title>
<style type="text/css">
.body {
	background-color: #CCEEFF;
}
</style>
</head>
<body class="body">
	<div class="form-container">
		<h3 class="label">Welcome to Volgenau School!</h3>
		<p class="label">
			Volgenau School wishes to conduct students survey to know about
			student's satisfaction about various aspects of School. Kindly,
			follow the below link to complete the survey.<br> <a
				href="/lakshmi_hw3/createsurvey">Student Survey</a>
		</p>
		<p class="label">
			You can also find the list of surveys submitted here<br> <a
				href="/lakshmi_hw3/surveylist">Survey List</a>
		</p>
	</div>
</body>
</html>