$(function(){
	
	/**
	 * 页面加载时，初始化分页
	 */
	var totalCount = $("#totalCount").val();
	var totalPage = totalCount%20>0?(totalCount-totalCount%20)/20+1:(totalCount-totalCount%20)/20;
	var keyword = $(".nav-search-input").val();
	var pageNumber = $("#pageNumber").val();
	var before=parseInt(pageNumber)-parseInt(1);
	var next=parseInt(pageNumber)+parseInt(1);
	var str ="";
	if(pageNumber!="" && pageNumber>1)
		str = "<a  href='/product/list?keyword="+keyword+"&pageNumber="+before+"'><button class='btn btn-light'>上一页</button></a> ";
	for(var i=1;i<=totalPage;i++){
		str+="<a  href='/product/list?keyword="+keyword+"&pageNumber="+i+"'><button class='btn btn-light'>"+i+"</button></a> ";
	}
	if(pageNumber<totalPage)
		str+="<a  href='/product/list?keyword="+keyword+"&pageNumber="+next+"'><button class='btn btn-light'>下一页</button></a> ";
	$("#pages").html(str);
	/**
	 * 搜索功能
	 */
	$("#search").click(function() {
		var keyword = $(".nav-search-input").val();
		window.location.href="/product/list?keyword="+keyword;
	});
	
	/*$("#delete").click(function() {
		
		$.ajax({
			url : "/product/delete",
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
		
	});*/
})