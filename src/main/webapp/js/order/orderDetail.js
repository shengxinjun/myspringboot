$(function() {
	/**
	 * 表单校验
	 */
	$("#totalPrice").blur(function(){
		var totalPrice=$("#totalPrice").val();
		var reg=/^[-+]?\d*$/;
		if(!reg.test(totalPrice)){ 
			$("#totalPrice").val("");
		}
	});
	$("#userId").blur(function(){
		var userId=$("#userId").val();
		var reg=/^[-+]?\d*$/;
		if(!reg.test(userId)){ 
			$("#userId").val("");
		}
	});
	
	/**
	 * 新增和更新
	 */
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
