<!-- 
Lakshmi Venkataiah
This is winning acknowledgement page which displays winning message, name, mean and sd 
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Welcome Page</title>
</head>
<body>
	<div class="form-container">
		<h1 class="label">Congratulations! You have won 2 movie tickets!</h1>
		<h1 class="label">Thanks for submitting the survey!</h1>
		<p class="label">Survey Results</p>
		<p>
			Name:
			<s:property value="name" />
		</p>
		<p>
			Mean:
			<s:property value="winningResult.mean" />
		</p>
		<p>
			Standard Deviation:
			<s:property value="winningResult.standardDeviation" />
		</p>
		<p>
			<a href="/swe645Struts2/welcome">Back to Welcome Page</a>
		</p>
		<p>
			<a href="/swe645Struts2/createsurvey">Back to Create Survey Page</a>
		</p>
	</div>
</body>
</html>