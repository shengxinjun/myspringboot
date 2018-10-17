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

