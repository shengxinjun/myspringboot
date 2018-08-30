$(function() {
	$("#submit").click(function() {
		var order = {};
		
		order.name = $("#name").val();
		order.totalPrice = $("#totalPrice").val();
		order.desc = $("#desc").val();
		order.date = $("#date").val();
		var str = JSON.stringify(order);
		var urls = "/order/doAdd";
		if($("#id").val() != ""){
			urls = "/order/doUpdate";
			order.id = $("#id").val();
		}
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
