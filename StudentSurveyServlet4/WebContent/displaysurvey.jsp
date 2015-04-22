<!--Lakshmi Venkataiah-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>CS Dept. Survey</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyServlet4/resources/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/StudentSurveyServlet4/resources/css/custom.css" />
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
							<td width="33%">Student ID:<input type="text" id="id"
								class="form-control" value="${survey.id}" autofocus
								placeholder="Student ID" disabled="disabled"></td>
							<td width="33%">Full Name:<input type="text" id="name"
								class="form-control" name="name" autofocus
								placeholder="First name, Middle name, Last name"
								value="${survey.name}" disabled="disabled"></td>
							<td width="33%">Address: <input type="text" id="address"
								class="form-control" name="address" value="${survey.address}"
								disabled="disabled"></td>
						</tr>
						<tr>
							<td>City:<input type="text" id="city" class="form-control"
								name="city" value="${survey.city}" disabled="disabled"></td>
							<td>State:<input type="text" id="state" class="form-control"
								name="state" value="${survey.state}" disabled="disabled"></td>
							<td>Zip: <input type="text" id="zip" class="form-control"
								name="zip" value="${survey.zip}" disabled="disabled"></td>
						</tr>
						<tr>
							<td>E-mail:<input type="text" id="email"
								class="form-control" name="email" placeholder="xxx@xxxx.com"
								value="${survey.email}" disabled="disabled"></td>
							<td>URL:<input type="url" class="form-control" name="url"
								placeholder="Eg. www.google.com" value="${survey.url}"
								disabled="disabled">
							</td>
							<td>Data:<input type="text" class="form-control" name="data"
								id="data"
								placeholder="Enter 10 comma separated numbers from 1 through 100"
								value="${survey.data}" disabled="disabled"></td>
						</tr>
						<tr>
							<td>Phone:<input type="tel" class="form-control"
								name="phone" placeholder="xxx-xxx-xxxx" value="${survey.phone}"
								disabled="disabled"></td>
							<td>What you liked the most about the campus?<br> <input
								type="text" value="${survey.campusliking}" id="campusliking"
								disabled="disabled" class="form-control" /></td>
						</tr>
						<tr>
							<td>Choose your graduation month and enter year in the text
								box.<input list="months" name="month" class="form-control"
								value="${survey.month}" disabled="disabled"> <br>
								Year:<input type="text" value="${survey.year}" id="year"
								disabled="disabled" class="form-control" />
							</td>
							<td>Likelihood of you recommending this school for other
								students:<input type="text" value="${survey.likelyrecommend}"
								id="likelyrecommend" disabled="disabled" class="form-control" />
							</td>
							<td>Enter your comments here:<textarea class="form-control"
									rows="4" cols="50" name="comments" disabled="disabled">${survey.comments}</textarea></td>
						</tr>
						<tr>
							<td>Date:<input type="text" class="form-control" name="date"
								id="date" value="${survey.date}" disabled="disabled"></td>
							<td></td>
							<td align="center"><a
								href="/StudentSurveyServlet4/createsurvey"
								class="btn btn-default"> Create Another Survey </a></td>
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

	<script src="/StudentSurveyServlet4/resources/js/jquery.js"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="/StudentSurveyServlet4/resources/js/displaysurvey.js"></script>
</body>

</html>