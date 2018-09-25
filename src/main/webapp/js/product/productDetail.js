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
		product.imgs = $("#fileName").val();
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
});