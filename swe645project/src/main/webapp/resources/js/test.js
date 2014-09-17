$(document).ready(function() {

	$("#submit").click(function() {
		var input = $('#name').val();
		if (!input) {
			alert('Please enter a name!');
		}
	});

});