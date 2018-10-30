$(function() {
	
	
});
/**
 * 添加到订单
 */
function addPro(proId) {
	var orderId = $("#orderId").val();
	$.ajax({
		url : "/product/addToOrder",
		type : 'POST',
		dataType : 'json',
		data : {
			orderId : orderId,
			proId :proId
		},
	}).done(function(e) {
		if(e.code==1){
			alert("success");
		}else{
			alert(e.message);
		}
	}).fail(function(e) {
	});
};