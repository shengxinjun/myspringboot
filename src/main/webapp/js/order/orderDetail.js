$(function() {
	$("#submit").click(function() {
		var order = {};
		order.id = $("#id").val();
		order.name = $("#name").val();
		order.totalPrice = $("#totalPrice").val();
		order.desc = $("#desc").val();
		order.date = $("#date").val();
		var str = JSON.stringify(order);
		$.ajax({
			url : '/order/doUpdate',
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
