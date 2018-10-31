$(function() {
	/**
	 * 页面加载时，初始化分页
	 */
	var totalCount = $("#totalCount").val();
	var totalPage = totalCount%5>0?(totalCount-totalCount%5)/5+1:(totalCount-totalCount%5)/5;
	var pageNumber = $("#pageNumber").val();
	var before=parseInt(pageNumber)-parseInt(1);
	var next=parseInt(pageNumber)+parseInt(1);
	var orderId=$("#orderId").val();
	if(pageNumber==1){
		document.getElementById("prev").setAttribute("style","display:none");
	}
	if(pageNumber==totalPage){
		document.getElementById("next").setAttribute("style","display:none");
	}
	document.getElementById("prev").setAttribute("onclick","window.location.href='/order/addPro?orderId="+orderId+"&pageNumber="+before+"'");
	document.getElementById("next").setAttribute("onclick","window.location.href='/order/addPro?orderId="+orderId+"&pageNumber="+next+"'");
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