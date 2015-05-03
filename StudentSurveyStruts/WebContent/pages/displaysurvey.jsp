<!--Lakshmi Venkataiah-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>CS Dept. Survey</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/custom.css" />
</head>

<body>
	<div id="greeting1"></div>
	<div id="greeting2"></div>
	<div id="greeting3"></div>
	<table style="width: 100%">
		<tr>
			<td>
				<div class="container">
					<h1>Welcome to CS Dept. Survey!!</h1>

					<table class="table">
						<tr>
							<td colspan="3"><div id="error" style="color: red"></div></td>
						</tr>
						<tr>
							<td width="33%">Student ID:<s:property value="survey.id" /></td>
							<td width="33%">Full Name:<s:property value="survey.name" /></td>
							<td width="33%">Address: <s:property value="survey.address" /></td>
						</tr>
						<tr>
							<td>City:<s:property value="survey.city" /></td>
							<td>State:<s:property value="survey.state" /></td>
							<td>Zip: <s:property value="survey.zip" /></td>
						</tr>
						<tr>
							<td>E-mail:<s:property value="survey.email" /></td>
							<td>URL:<s:property value="survey.url" /></td>
							<td>Data:<s:property value="survey.data" /></td>
						</tr>
						<tr>
							<td>Phone:<s:property value="survey.phone" /></td>
							<td>What you liked the most about the campus?<br> <s:property
									value="survey.campusliking" /></td>
						</tr>
						<tr>
							<td>Choose your graduation month and enter year in the text
								box.<s:property value="survey.month" /> <br> Year:<s:property
									value="survey.year" />
							</td>
							<td>Likelihood of you recommending this school for other
								students:<s:property value="survey.likelyrecommend" />
							</td>
							<td>Enter your comments here:<s:property
									value="survey.likelyrecommend" /></td>
						</tr>
						<tr>
							<td>Date:<s:property value="survey.date" /></td>
							<td></td>
							<td align="center"><a
								href="/StudentSurveyStruts/createsurvey" class="btn btn-default">
									Create Another Survey </a></td>
						</tr>
					</table>
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<div align="right" class="imgdiv"
					title="Please visit http://www.gmu.edu for more information.">
					<a href=" https://www.gmu.edu/"> <img
						src="http://mason.gmu.edu/~lvenkat2/testaccess/assign3/gmu.jpg"
						alt="George Mason University">
					</a>
				</div>
			</td>
		</tr>
	</table>

	<script src="/resources/js/jquery.js" type="text/javascript"></script>
	<script type="text/javascript" src="/resources/js/displaysurvey.js"></script>
</body>

</html>