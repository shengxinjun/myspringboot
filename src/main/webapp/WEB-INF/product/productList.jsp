<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<!-- page specific plugin styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/colorbox.min.css" />
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
					<ul class="ace-thumbnails clearfix">
					
					<c:forEach items="${paging.list}" var="item" varStatus="status">
						
						<div class="detail">
							${item.name}
							<li>
											<a title="Photo Title" data-rel="colorbox">
												<img width="150" height="150" alt="150x150" src="${pageContext.request.contextPath }/assets/images/gallery/thumb-1.jpg" />
											</a>

											<div class="tags">
												<span class="label-holder">
													<span class="label label-info">breakfast</span>
												</span>

												<span class="label-holder">
													<span class="label label-danger">fruits</span>
												</span>

												<span class="label-holder">
													<span class="label label-success">toast</span>
												</span>

												<span class="label-holder">
													<span class="label label-warning arrowed-in">diet</span>
												</span>
											</div>

											<div class="tools">
												<a href="#">
													<i class="ace-icon fa fa-link"></i>
												</a>

												<a href="#">
													<i class="ace-icon fa fa-paperclip"></i>
												</a>

												<a href="#">
													<i class="ace-icon fa fa-pencil"></i>
												</a>

												<a href="#">
													<i class="ace-icon fa fa-times red"></i>
												</a>
											</div>
										</li>
						</div>
					</c:forEach>
					
					
					</ul>
					<div class="ui-pg-div">
						<button class="btn" onclick="location.href='/product/turnToAdd'">
							<i class="ace-icon fa fa-plus-circle bigger-200 green"></i>
						</button>
						<button class="btn" id="delBtn">
							<i class="ace-icon fa fa-trash-o bigger-200"></i>
						</button>
						<button class="btn" onclick="location.href='/product/export'">
							<i class="ace-icon fa fa-share bigger-200"></i>
						</button>
						<div class="btn-group btn-corner" id="pages">
							<input type="hidden" value="${paging.totalCount }"
								id="totalCount" /> <input type="hidden" value="${paging.pageNumber }"
								id="pageNumber" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 中部内容 -->

	<%@ include file="../model/buttom.jsp"%>
	
		<!-- page specific plugin scripts -->
		<script src="${pageContext.request.contextPath }/assets/js/jquery.colorbox.min.js"></script>
	<script type="text/javascript">
			jQuery(function($) {
	var $overflow = '';
	var colorbox_params = {
		rel: 'colorbox',
		reposition:true,
		scalePhotos:true,
		scrolling:false,
		previous:'<i class="ace-icon fa fa-arrow-left"></i>',
		next:'<i class="ace-icon fa fa-arrow-right"></i>',
		close:'&times;',
		current:'{current} of {total}',
		maxWidth:'100%',
		maxHeight:'100%',
		onOpen:function(){
			$overflow = document.body.style.overflow;
			document.body.style.overflow = 'hidden';
		},
		onClosed:function(){
			document.body.style.overflow = $overflow;
		},
		onComplete:function(){
			$.colorbox.resize();
		}
	};

	$('.ace-thumbnails [data-rel="colorbox"]').colorbox(colorbox_params);
	$("#cboxLoadingGraphic").html("<i class='ace-icon fa fa-spinner orange fa-spin'></i>");//let's add a custom loading icon
	
	
	$(document).one('ajaxloadstart.page', function(e) {
		$('#colorbox, #cboxOverlay').remove();
   });
})
		</script>
	<script
		src="${pageContext.request.contextPath }/js/product/productList.js"></script>
</body>
</html>