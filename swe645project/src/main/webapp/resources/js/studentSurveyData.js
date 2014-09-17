// Lakshmi Venkataiah
// This page has the required javascript code for swe645 project. 
// This file has validations for the required fields on the Student Survey page.
$(document).ready(function() {

	$("#ui-datepicker-div").remove();
	$('#surveydate').datepicker();

	$("#surveyform").submit(function(e) {
		e.preventDefault();
		var allGood = true;
		$(".input").each(function() {
			var val = $(this).val();
			if (!val) {
				$(this).css({
					border : '1px solid red'
				});
				allGood = false;
			}
		});

		if (allGood) {
			alert("Form submitted successfully. Thank you !")
			window.location.href = '/swe645project/studenthomepage';
		}

		return allGood;
	});
});