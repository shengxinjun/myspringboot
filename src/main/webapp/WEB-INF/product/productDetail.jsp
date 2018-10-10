<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<title>ace admin</title>
<%@ include file="../model/css.jsp"%>

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/product/product.css" />

<link rel="stylesheet" href="${pageContext.request.contextPath }/multi_upload/control/css/zyUpload.css" type="text/css"/>

</head>
<body class="no-skin">
	<%@ include file="../model/menu.jsp"%>


	<!-- 中部内容 -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state col-md-9" id="breadcrumbs">
				<div class="widget-box widget-color-dark ui-sortable-handle"
					id="widget-box-11">
					<div class="widget-header">
						<h6 class="widget-title">商品详情</h6>
						<div class="widget-toolbar">
							<a data-action="reload"> <i class="ace-icon fa fa-refresh"></i>
							</a> <a data-action="fullscreen"> <i
								class="ace-icon fa fa-expand"></i>
							</a>
						</div>
					</div>
					<div class="widget-body">
						<div class="widget-main padding-4 scrollable ace-scroll"
							data-size="125" style="position: relative;">
							<div class="scroll-content" style="min-height: 500px;">
								<input type="hidden" id="id" value="${product.id }" />
								<div class="col-sm-7 col-md-7">
									名称：<input type="text" id="name"
										class="form-control ui-autocomplete-input"
										value="${product.name}"></input>
								</div>
								<div class="col-sm-7 col-md-7">
									单价：<input type="text" id="price" name="value"
										class="form-control ui-autocomplete-input"
										value="${product.price}"></input>
								</div>
								<div class="col-sm-7 col-md-7">
									产品类别：<input type="text" id="type"
										class="form-control ui-autocomplete-input"
										value="${product.type}"></input>
								</div>
								<div class="col-sm-7 col-md-7">
									描述：<input type="text" id=description
										class="form-control ui-autocomplete-input"
										value="${product.description}"></input>
								</div>
								<div class="col-sm-7 col-md-7">

									<div class="col-sm-7 col-md-7">
										图片：<a class="upload-btn">上传文件(上传方式一，暂时不用) <input
										type="file" name="file" id="newEditPUpload"></input>
									</a> <input type="hidden" id="fileName"></input>
									</div>
									<div class="put-evidence col-sm-5 col-md-5" id="box">
									</div>
								</div>
								<div class="col-sm-7 col-md-7">
									<div class="col-md-12">
										<input class="form-control" id = "fileUrl" type="hidden" name="fileUrl" />
										<label class="col-md-2 control-label">附件</label>
										<div  class="col-md-10"><div class="picture_img">
										<ul id="deviceImageList_div">
										<c:if test="${not empty product.imgs}">
										<c:set var="deviceFormUrls" value="${fn:split(product.imgs,';')}"></c:set>
												<c:forEach items="${deviceFormUrls}" var="url" varStatus="loop">
												<li id="deviceImageList_remove_image_${loop.index}" class="img_tu">
													<div class="pc_img" >
														<button class="image_delete" title="删除" onclick="removeImage(${loop.index},'deviceImageList')"><i class="fa fa-close" ></i></button>
														<c:choose>
														<c:when test="${fn:endsWith(url,'jpg')||fn:endsWith(url,'jpeg')||fn:endsWith(url,'bmp')
														||fn:endsWith(url,'png')||fn:endsWith(url,'gif')}">
														  <img id="appForm_device_image${loop.index}" style="height:180px;width:180px;" src="<%=request.getContextPath()%>${url}" />
														</c:when>
														<c:otherwise>
														 <a href="<%=request.getContextPath()%>${url}" title="${url}" style="height:178px;width:178px;display:block"></a>
														</c:otherwise>
														</c:choose>
														<input type="hidden" value="${url}" name="deviceImageList[${loop.index}]">
													</div>
												</li>
												</c:forEach> 
										  </c:if>
										  <c:if test="${empty product.imgs}">
												<span id="empty_url_span" style="display:block;line-height:34px;padding-top:  3px;color: #999;">暂无附件</span>
										  </c:if>
										</ul>
										</div>
										</div>
										<input type="hidden" name="deviceFormUrl" /> 
										<div class="col-md-2"></div>
										<button type="button" class="btn blue" onclick="showUploadConf('deviceImageList')" style="margin-left:15px;">
											<i class="fa fa-plus"></i>
											<span>上传附件(上传方式二)</span>
										</button>
									</div>
									
								<div class="col-sm-7 col-md-7">
									<a class="btn btn-info btn-sm" id="submit">提交</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--上传文件start-->
	<div id="light_examine_upload_div"   class="modal fade">
	   <div class="modal-dialog">
        <div class="modal-content">
	       <div class="modal-header">
		    <a class="close" data-dismiss="modal" onclick="cancelUploadImage()">&times;</a>
		    <h4 class="modal-title">上传图片</h4>
			<div class="clear"></div>
		   </div>
		   <div class="modal-body">
		    <input id="uploadType" type="hidden"/>
		    <div id="demo" class="demo1"></div>
		   </div>
		    <div class="modal-footer">
		    	<a class="btn default" data-dismiss="modal" aria-hidden="true">取消</a>
			    <a id="submit-button" type="submit" class="btn blue"  onclick="showImages()">保存</a>
		    </div>
		    <input type="hidden" id="after_sale_view_type"/>
	      </div>
	    </div>
	 </div>
	<!--上传文件end-->

	<!-- 中部内容 -->

	<%@ include file="../model/buttom.jsp"%>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery-ui.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/product/ajaxfileupload.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/product/productDetail.js"></script>
	<!-- 引用核心层插件 -->
	<script src="${pageContext.request.contextPath }/multi_upload/core/zyFile.js"></script>
	<!-- 引用控制层插件 -->
	<script src="${pageContext.request.contextPath }/multi_upload/control/js/zyUpload.js"></script>
	<!-- 引用初始化JS -->
	<script src="${pageContext.request.contextPath }/multi_upload/core/jq22.js"></script> 
	
	<script src="${pageContext.request.contextPath }/multi_upload/jquery.museum.js"></script> 
	<script type="text/javascript">
		
		jQuery(function($) {

			$("#date").datepicker({
				showOtherMonths : true,
				selectOtherMonths : false,
				dateFormat : "yy-mm-dd"
			//isRTL:true,

			/*
			changeMonth: true,
			changeYear: true,
			
			showButtonPanel: true,
			beforeShow: function() {
				//change button colors
				var datepicker = $(this).datepicker( "widget" );
				setTimeout(function(){
					var buttons = datepicker.find('.ui-datepicker-buttonpane')
					.find('button');
					buttons.eq(0).addClass('btn btn-xs');
					buttons.eq(1).addClass('btn btn-xs btn-success');
					buttons.wrapInner('<span class="bigger-110" />');
				}, 0);
			}
			 */
			});

		});
	</script>

</body>
</html>