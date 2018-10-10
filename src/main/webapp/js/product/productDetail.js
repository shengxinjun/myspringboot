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
		
		//附件url
		var imgDev = $("input[name^='deviceImageList']");
		var checkDev=checkImages(imgDev);
		$("#fileUrl").val(checkDev);
		product.imgs = $("#fileUrl").val();
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
	function showUploadConf(str){
		 $("#light_examine_upload_div").modal("show");
		 choosefileAndImage("demo",str,'576px','/upload2','<%=request.getContextPath()%>');
		 $("#uploadType").val(str);
	}
	function cancelUploadImage(){
		 $("#light_examine_upload_div").modal("hide");
		 $("body").attr({"class":"modal-open"});
		 $("body").attr({"style":"padding-right:17px"});
	}

	function showImages(){
		 var uploadType=$("#uploadType").val();
		 var html="";
		 var path="<%=request.getContextPath()%>";
		 var count = $("input[name^='"+uploadType+"']").size();
		 var i = 0;
		 $("input[id^='"+uploadType+"']").each(function(index,element){
			 i = i + 1;
			 count = count+1;
			 html+='<li class="img_tu" id="'+uploadType+'_remove_image_'+count
			 +'"><div class="pc_img" ><button class="image_delete" title="删除" onclick="removeImage('+count+',\''+uploadType+'\')"> <i class="fa fa-close"></i></button>';
			 if($(this).val().lastIndexOf(".jpg")>-1||$(this).val().lastIndexOf(".jpeg")>-1||$(this).val().lastIndexOf(".png")>-1
					 ||$(this).val().lastIndexOf(".bmp")>-1||$(this).val().lastIndexOf(".gif")>-1){
				 html+='<img id="appForm_device_image'+count+'" style="height:180px;width:180px;" src="'+path+$(this).val()+'" />';
			 }else{
				 html+='<a href="'+path+$(this).val()+'" title="'+$(this).val()+'" style="height:178px;width:178px;display:block"></a>';
			 }
			 
			 html+='<input type="hidden" value="'+$(this).val()+'" name='+uploadType+'['+count+']></div></li>';
		 });
		 /* if(i==0){
			 alert("请选择文件!");
			 return;
		 } */
		 $("#"+uploadType+"_div").append(html);
		 $("#empty_url_span").html("");
		 $.museum($('#light_examine_upload_div img'));
		 cancelUploadImage();
	}
	function removeImage(index,str){
		 $("#"+str+"_remove_image_"+index).remove();
	}
	function checkImages(imgs){
		var imgStr="";
		if(imgs.length>0){
			for(var i=0;i<imgs.length;i++){
				imgStr += imgs[i].value+";";
			}
		  return imgStr;
		}else{
			return "";
		}
	}
	
});

