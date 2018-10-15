<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<title>ace admin</title>
<!-- page specific plugin styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/colorbox.min.css" />
<%@ include file="../model/css.jsp"%>


<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/product/product.css" />

</head>
<body class="no-skin">
	<%@ include file="../model/menu.jsp"%>


	<!-- 中部内容 -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state col-md-9" id="breadcrumbs">
				<div class="widget-box widget-color-dark ui-sortable-handle"
					id="widget-box-11">
					<div class="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input placeholder="Search ..."
								type="text" class="nav-search-input"></input> <i
								class="ace-icon fa fa-search nav-search-icon" id="search"></i>
							</span>
						</form>
					</div>
					<ul class="ace-thumbnails clearfix">

						<c:forEach items="${paging.list}" var="item" varStatus="status">

							<li class="detail"><a
								href="${pageContext.request.contextPath }/assets/images/gallery/thumb-1.jpg"
								title="${item.name}" data-rel="colorbox"> <img width="150"
									height="150" alt="150x150"
									src="${pageContext.request.contextPath }/assets/images/gallery/thumb-1.jpg" />
							</a>

								<div class="tags">
									<span class="label-holder"> <span
										class="label label-info">名称：${item.name}</span>
									</span> <span class="label-holder"> <span
										class="label label-danger">价格：${item.price}</span>
									</span> <span class="label-holder"> <span
										class="label label-success">类别：${item.type}</span>
									</span> <span class="label-holder"> <span
										class="label label-warning arrowed-in">描述：${item.description}</span>
									</span>
								</div>

								<div class="tools">
									<a href="#"> <i class="ace-icon fa fa-link"></i>
									</a> <a> <i class="ace-icon fa fa-paperclip"></i>
									</a> <a href="/product/detail?id=${item.id}"> <i
										class="ace-icon fa fa-pencil"></i>
									</a> <a href="/product/delete/${item.id}"> <i
										class="ace-icon fa fa-times red"></i>
									</a>
								</div></li>
						</c:forEach>


					</ul>
					<div class="ui-pg-div">
						<button class="btn" onclick="location.href='/product/turnToAdd'">
							<i class="ace-icon fa fa-plus-circle bigger-200 green"></i>
						</button>
						<button class="btn" id="delBtn">
							<i class="ace-icon fa fa-trash-o bigger-200"></i>
						</button>
						<button class="btn"
							onclick="location.href='/product/export?keyword=${paging.keyword}&pageNumber=${paging.pageNumber}'">
							<i class="ace-icon fa fa-share bigger-200"></i>
						</button>

						<div class="btn-group btn-corner" id="pages">
							<input type="hidden" value="${paging.totalCount }"
								id="totalCount" /> <input type="hidden"
								value="${paging.pageNumber }" id="pageNumber" />
						</div>
					</div>
					<div class="col-sm-7 col-md-7">

									<div class="col-sm-7 col-md-7">
										图片：<a class="upload-btn">上传文件<input
										type="file" name="file" id="newEditPUpload"></input>
									</a> <input type="hidden" id="fileName"></input>
									</div>
									<div class="put-evidence col-sm-5 col-md-5" id="box">
									</div>
								</div>
			</div>
		</div>
	</div>
	<!-- 中部内容 -->

	<%@ include file="../model/buttom.jsp"%>

	<!-- page specific plugin scripts -->
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.colorbox.min.js"></script>
	<!-- inline scripts related to this page -->
	<script type="text/javascript">
		jQuery(function($) {
			var $overflow = '';
			var colorbox_params = {
				rel : 'colorbox',
				reposition : true,
				scalePhotos : true,
				scrolling : false,
				previous : '<i class="ace-icon fa fa-arrow-left"></i>',
				next : '<i class="ace-icon fa fa-arrow-right"></i>',
				close : '&times;',
				current : '{current} of {total}',
				maxWidth : '100%',
				maxHeight : '100%',
				onOpen : function() {
					$overflow = document.body.style.overflow;
					document.body.style.overflow = 'hidden';
				},
				onClosed : function() {
					document.body.style.overflow = $overflow;
				},
				onComplete : function() {
					$.colorbox.resize();
				}
			};

			$('[data-rel="colorbox"]').colorbox(colorbox_params);
			$("#cboxLoadingGraphic").html(
					"<i class='ace-icon fa fa-spinner orange fa-spin'></i>");//let's add a custom loading icon

			$(document).one('ajaxloadstart.page', function(e) {
				$('#colorbox, #cboxOverlay').remove();
			});
		})
	</script>
	
	<script
		src="${pageContext.request.contextPath }/js/product/ajaxfileupload.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/product/productList.js"></script>
</body>
</html>