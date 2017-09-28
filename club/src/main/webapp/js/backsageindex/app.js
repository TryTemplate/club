$(function() {
	$(".navbar-expand-toggle").click(function() {
		var dbw = document.body.clientWidth;
		if ($(this).attr("class") == "navbar-expand-toggle fa-rotate-90") {
			var newwidth = dbw-60;
			$("#bacontiframe").animate({
				width : newwidth+"px",
				marginLeft : "60px"
			},
			115, 
			'linear' 
			);
			$(".app-container").toggleClass("expanded");
		} else if ($(this).attr("class") == "navbar-expand-toggle") {
			$(".app-container").toggleClass("expanded");
			
			var newwidth = dbw-250;
			$("#bacontiframe").animate({
				marginLeft : "250px",
				width : newwidth+"px"
			});
		}
		return $(".navbar-expand-toggle").toggleClass("fa-rotate-90");
	});
	return $(".navbar-right-expand-toggle").click(function() {
		$(".navbar-right").toggleClass("expanded");
		$("#iframediv").animate({
			marginLeft : "60px"
		});
		return $(".navbar-right-expand-toggle").toggleClass("fa-rotate-90");
	});
});

$(function() {
	return $('select').select2();
});

$(function() {
	return $('.toggle-checkbox').bootstrapSwitch({
		size : "small"
	});
});

$(function() {
	return $('.match-height').matchHeight();
});

$(function() {
	return $('.datatable').DataTable({
		"dom" : '<"top"fl<"clear">>rt<"bottom"ip<"clear">>'
	});
});

$(function() {
	return $(".side-menu .nav .dropdown").on('show.bs.collapse', function() {
		return $(".side-menu .nav .dropdown .collapse").collapse('hide');
	});
});
