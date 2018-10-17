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
		order.files = new Array();
		$('#box a').each(function(){
			var file={};
			file.fileUrl=$(this).attr('href');
			file.fileName=$(this).attr('value');
			order.files.push(file);
		});
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
	$(".upload-btn").change(function(){
		if (!(/(\.|\/)(jpg|png|jpeg|bmp|doc|docx)$/i.test($("#newEditPUpload").val()))) { 
            alert("仅支持JPG,PNG,JPEG,BMP,DOC,DOCX格式");
            return false;
        }
		$.ajaxFileUpload({
            url: '/upload', //用于文件上传的服务器端请求地址
            secureuri: false, //是否需要安全协议，一般设置为false
            fileElementId: 'newEditPUpload', //文件上传域的ID
            dataType: 'json', //返回值类型 一般设置为json
            type: 'post',
            success: function (result) {
                if (result.code == 1) {
                	var start = result.data.lastIndexOf("/");
                	var name = result.data.substring(start+1);
                	$('#box').append('<a  href="'+result.data+'" value="'+name+'">'+name+'</a><br>');
                	alert("上传成功");
                  } else {
                    alert("上传文件出错");
                }
            }
        });
	});
});
