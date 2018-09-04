$(function() {
	/**
	 * 页面加载时，初始化分页
	 */
	var totalCount = $("#totalCount").val();
	var totalPage = totalCount%10>0?(totalCount-totalCount%10)/10+1:(totalCount-totalCount%10)/10;
	var keyword = $(".nav-search-input").val();
	var pageNumber = $("#pageNumber").val();
	var before=parseInt(pageNumber)-parseInt(1);
	var next=parseInt(pageNumber)+parseInt(1);
	var str ="";
	if(pageNumber!="" && pageNumber>1)
		str = "<a  href='/order/list?keyword="+keyword+"&pageNumber="+before+"'><button class='btn btn-light'>上一页</button></a> ";
	for(var i=1;i<=totalPage;i++){
		str+="<a  href='/order/list?keyword="+keyword+"&pageNumber="+i+"'><button class='btn btn-light'>"+i+"</button></a> ";
	}
	if(pageNumber<totalPage)
		str+="<a  href='/order/list?keyword="+keyword+"&pageNumber="+next+"'><button class='btn btn-light'>下一页</button></a> ";
	$("#pages").html(str);
	/**
	 * 搜索功能
	 */
	$("#search").click(function() {
		var keyword = $(".nav-search-input").val();
		window.location.href="/order/list?keyword="+keyword;
	});
	
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
