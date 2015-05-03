<!--Lakshmi Venkataiah-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>CS Dept. student</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyStruts/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyStruts/resources/css/custom.css" />
</head>

<body>
	<div id="greeting1"></div>
	<div id="greeting2"></div>
	<div id="greeting3"></div>
	<table style="width: 100%">
		<tr>
			<td>
				<div class="container">
					<h1>Welcome to CS Dept. student!!</h1>

					<table class="table">
						<tr>
							<td colspan="3"><div id="error" style="color: red"></div></td>
						</tr>
						<tr>
							<td width="33%">Student ID: <span class="form-control">
									<s:property value="student.id" />
							</span>
							</td>
							<td width="33%">Full Name:<span class="form-control">
									<s:property value="student.name" />
							</span></td>
							<td width="33%">Address: <span class="form-control">
									<s:property value="student.address" />
							</span></td>
						</tr>
						<tr>
							<td>City:<span class="form-control"> <s:property
										value="student.city" /></span></td>
							<td>State:<span class="form-control"> <s:property
										value="student.state" /></span></td>
							<td>Zip: <span class="form-control"> <s:property
										value="student.zip" /></span></td>
						</tr>
						<tr>
							<td>E-mail:<span class="form-control"> <s:property
										value="student.email" /></span></td>
							<td>URL:<span class="form-control"> <s:property
										value="student.url" /></span></td>
							<td>Data:<span class="form-control"> <s:property
										value="student.data" /></span></td>
						</tr>
						<tr>
							<td>Phone:<span class="form-control"> <s:property
										value="student.phone" /></span></td>
							<td>What you liked the most about the campus?<br> <span
								class="form-control"> <s:property
										value="student.campusliking" /></span></td>
						</tr>
						<tr>
							<td>Choose your graduation month and enter year in the text
								box.<span class="form-control"> <s:property
										value="student.month" />
							</span><br> Year:<span class="form-control"> <s:property
										value="student.year" /></span>
							</td>
							<td>Likelihood of you recommending this school for other
								students:<span class="form-control"> <s:property
										value="student.likelyrecommend" /></span>
							</td>
							<td>Enter your comments here:<span class="form-control">
									<s:property value="student.likelyrecommend" />
							</span></td>
						</tr>
						<tr>
							<td>Date:<span class="form-control"> <s:property
										value="student.date" /></span></td>
							<td></td>
							<td align="center"><a
								href="/StudentSurveyStruts/createsurvey" class="btn btn-default">
									Create Another survey </a></td>
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

	<script src="/StudentSurveyStruts/resources/js/jquery.js"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="/StudentSurveyStruts/resources/js/displaysurvey.js"></script>
</body>

</html>