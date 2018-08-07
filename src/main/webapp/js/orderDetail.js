$(function() {
	$("#submit").click(function() {
		alert("2");
		var order = {};
		order.id = $("#id").val();
		order.name = $("#name").val();
		order.totalPrice = $("#price").val();
		order.date = $("#date").val();
		var str = JSON.stringify(order);
		$.ajax({
			url : '/order/doadd',
			type : 'POST',
			dataType : 'text',
			data : {
				obj : str
			},
		}).done(function(e) {
		}).fail(function(e) {
		});
	});
});

function add() {
	alert("2");
	var order = {};
	order.id = $("#id").val();
	order.name = $("name").val();
	order.price = $("price").val();
	order.price = $("date").val();

	$.ajax({
		url : '/order/add',
		type : 'POST',
		dataType : 'json',
		data : {
			"order" : order
		},
	}).done(function(e) {

	}).fail(function(e) {

	});
}