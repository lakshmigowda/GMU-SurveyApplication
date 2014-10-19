// Lakshmi Venkataiah
// This page has the required javascript code for swe645 project. 
// This file has validations for the required fields on the Student Survey page.
$(document)
		.ready(
				function() {

					$("#ui-datepicker-div").remove();
					$('#surveydate').datepicker();

					$("#surveyform")
							.submit(
									function(e) {
										e.preventDefault();
										var allGood = true;

										$("#surveyform .input")
												.not("[type=submit]")
												.removeClass('error')
												.each(
														function() {
															if ($.trim($(this)
																	.val()).length == 0) {
																$(this)
																		.addClass(
																				'error');
																allGood = false;
															}
														});

										if (allGood) {
											alert("Form submitted successfully. Thank you !")
											window.location.href = '/swe645Assign1/studenthomepage';
										}

										return allGood;
									});
				});