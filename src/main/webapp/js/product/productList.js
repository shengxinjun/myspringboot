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
	$(".upload-btn").change(function(){
		if (!(/(\.|\/)(xls||xlsx)$/i.test($("#newEditPUpload").val()))) { 
            alert("仅支持excel格式");
            return false;
        }
		$.ajaxFileUpload({
            url: '/product/batchImportProduct', //用于文件上传的服务器端请求地址
            secureuri: false, //是否需要安全协议，一般设置为false
            fileElementId: 'newEditPUpload', //文件上传域的ID
            dataType: 'json', //返回值类型 一般设置为json
            type: 'post',
            success: function (result) {
                if (result.code == 1) {
                	$("#fileName").val(result.data);
                	var start = result.data.lastIndexOf("/");
                	var name = result.data.substring(start+1);
                	$('#box').append('<span>'+ name +'<a href="javascript:;"></a></span>');
                	$("#newEditPUpload").hide();
                	alert("上传成功");
                  } else {
                    alert("上传文件出错");
                }
            }
        });
	});
})