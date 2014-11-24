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
	<s:form action="getfilteredsurveys.action">
		<div class="form-title">
			<h3>Search student surveys!</h3>
		</div>
		<table>
			<tr>
				<td><label for="search.firstName">First Name</label></td>
				<td><s:textfield name="search.firstName" label="First Name" /></td>
			</tr>
			<tr>
				<td><label for="search.lastName">Last Name</label></td>
				<td><s:textfield name="search.lastName" label="Last Name" /></td>
			</tr>
			<tr>
				<td><label for="search.city">City</label></td>
				<td><s:textfield name="search.city" label="City" /></td>
			</tr>
			<tr>
				<td><label for="search.state">State</label></td>
				<td><s:textfield name="search.state" label="State" /></td>
			</tr>

			<tr>
				<td align="left"><s:submit class="submit-button form-submit" /></td>
			</tr>
		</table>
	</s:form>

	<br>
	<button onclick="location.href='/lakshmi_ws_client/welcome'"
		class="submit-button">Back to homepage!</button>

</body>
</html>