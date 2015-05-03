//Lakshmi Venkataiah
var now = new Date();
var hour = now.getHours();
var name;

if (hour < 12)
	document.getElementById("greeting1").innerHTML = "<h1> Good Morning ";
else {
	hour = hour - 12;
	if (hour < 6)
		document.getElementById("greeting1").innerHTML = "<h1> Good Afternoon ";
	else
		document.getElementById("greeting1").innerHTML = "<h1> Good Evening ";
}
if (document.cookie) {
	var myCookie = unescape(document.cookie);
	var cookieTokens = myCookie.split("=");
	name = cookieTokens[1];
} else {
	name = window.prompt("Please enter your name", +name);
	document.cookie = "name" + escape(name);
}
document.getElementById("greeting2").innerHTML = (name + ", Welcome to CS Department's Survey </h1>");
document.getElementById("greeting3").innerHTML = "<a href='#' onClick='wrongPerson()'>"
		+ "Click here if you are not " + name + "</a>";

function wrongPerson() {
	document.cookie = "name-null;" + "expires=Thu, 01-Jan-95 00:00:01 GMT";
	window.location.reload();
	return false;
}

function nameValidate() {
	var value = $("#name").val();
	if (!textValidate(value)) {
		$("#error").append("<p>Name should only contain alphabets!</p>");
		$("#name").val("");
	}
}

function textValidate(value) {
	var letters = /^[A-Za-z]+$/;
	if (!value.match(letters)) {
		return false;
	}
	return true;
}

function addressValidate() {

	var value = $("#address").val();
	var alphaNumericSpecPat = /^[A-Za-z0-9.,#]+$/;
	if (!value.match(alphaNumericSpecPat)) {
		$("#error")
				.append(
						"<p>Address should only contain alphabets, numerics and  special characters (.#,) !</p>");
		$("#address").val("");
	}

	var zip = $("#zip").val();
	var numericPat = /^[0-9]+$/;
	if (!zip.match(numericPat)) {
		$("#error").append("<p>Zip should only contain numerics!</p>");
		$("#zip").val("");
	}

	if (!textValidate($("#city").val())) {
		$("#error").append("<p>City should only contain alphabets!</p>");
		$("#city").text("");
	}

	if (!textValidate($("#state").val())) {
		$("#error").append("<p>State should only contain alphabets!</p>");
		$("#state").text("");
	}

}

function emailValidate() {
	var value = $("#email").val();
	var emailPat = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!value.match(emailPat)) {
		$("#error").append("<p>Email is not valid!</p>");
		$("#email").val("");
	}
}

function checkBoxValidate() {
	var count = 0;
	$('input[type=checkbox][name=campusliking]').each(function() {
		if (this.checked) {
			count++;
		}
	});

	if (count < 2) {
		$("#error").append(
				"<p>Atleast 2 campus liking need to be selected!</p>");
	}
}

function radioButtonValidate() {

	var bool = false;
	$('input[type=radio][name=intersteduniv]').each(function() {
		if (this.checked) {
			bool = true;
		}
	});
	if (!bool) {
		$("#error").append("<p>Please select university interest!</p>");
	}
}

$("#surveyform").submit(function(event) {
	event.preventDefault();
	$("#error").html("");
	//nameValidate();
	//addressValidate();
	//emailValidate();
	//checkBoxValidate();
	//radioButtonValidate();
	if ($("#error").is(':empty')) {
		this.submit();
	} else {
		$("#error").dialog();
	}
});

var xhr = new XMLHttpRequest();

$("#zip")
		.change(
				function() {

					var zip = $("#zip").val();
					var numericPat = /^[0-9]+$/;
					if (zip.match(numericPat)) {

						xhr.onreadystatechange = zipSuccess;
						xhr
								.open(
										'GET',
										"http://mason.gmu.edu/~lvenkat2/testaccess/assign3/zipcodes.json",
										true);
						xhr.send(null);

					}

				});

function zipSuccess() {
	if (xhr.readyState == 4 && xhr.status == 200) {
		var data = JSON.parse(xhr.responseText);
		var length = data.zipcodes.length;
		var exists = false;
		var zip = $("#zip").val();

		for (var i = 0; i < length; i++) {
			var zipcode = data.zipcodes[i];
			if (zip == zipcode.zip) {
				$("#city").val(zipcode.city);
				$("#state").val(zipcode.state);
				exists = true;
				$("#error").html("");
			}
		}

		if (!exists) {
			$("#error").html("");
			$("#city").val("");
			$("#state").val("");
			$("#error").append("<p>Zip code is invalid!</p>");
		}
	}
}

$(".imgdiv").tooltip();