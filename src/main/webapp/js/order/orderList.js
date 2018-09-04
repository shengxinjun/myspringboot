$(function() {
	/**
	 * 批量删除功能
	 */
	$("#delBtn").click(function() {
		obj = document.getElementsByName("order");
	    var check_val = "";
	    for(k in obj){
	        if(obj[k].checked)
	        	if(check_val=="")
	        		check_val=obj[k].value;
	        	else
	        		check_val=check_val+","+obj[k].value;
	    }
		$.ajax({
			url : "/order/deleteOrderList",
			type : 'POST',
			dataType : 'json',
			data : {
				list : check_val
			},
		}).done(function(e) {
			if(e.code==1){
				location.href='/order/list';
			}
		}).fail(function(e) {
		});
	});
	
	/**
	 * 全选功能
	 */
	$("#selectAll").click(function() {
		all = document.getElementById("selectAll");
		obj = document.getElementsByName("order");
		if(all.checked){
		    for(k in obj){
		    	obj[k].checked=true;	
		    }
		}else{
			for(k in obj){
		    	obj[k].checked=false;	
		    }
		}
	});
});
