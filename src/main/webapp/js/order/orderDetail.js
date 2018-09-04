$(function() {
	$("#submit").click(function() {
		var order = {};
		
		order.name = $("#name").val();
		order.totalPrice = $("#totalPrice").val();
		order.userId = $("#userId").val();
		order.date = $("#date").val();
		var urls = "/order/doAdd";
		if($("#id").val() != ""){
			urls = "/order/doUpdate";
			order.id = $("#id").val();
		}
		var str = JSON.stringify(order);
		$.ajax({
			url : urls,
			type : 'POST',
			dataType : 'json',
			data : {
				obj : str
			},
		}).done(function(e) {
			if(e.code==1){
				location.href='/order/list';
			}
		}).fail(function(e) {
		});
	});
});
