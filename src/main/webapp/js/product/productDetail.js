$(function(){
	
	/**
	 * 新增和更新
	 */
	$("#submit").click(function() {
		var product = {};
		
		product.name = $("#name").val();
		product.price = $("#price").val();
		product.type = $("#type").val();
		product.description = $("#description").val();
		product.createDate = $("#date").val();
		var urls = "/product/doAdd";
		if($("#id").val() != ""){
			urls = "/product/doUpdate";
			product.id = $("#id").val();
		}
		var str = JSON.stringify(product);
		$.ajax({
			url : urls,
			type : 'POST',
			dataType : 'json',
			data : {
				obj : str
			},
		}).done(function(e) {
			if(e.code==1){
				location.href='/product/list';
			}
		}).fail(function(e) {
		});
	});
});