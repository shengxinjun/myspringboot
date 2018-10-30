<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/order/order.css" />
<title>ace admin</title>
<%@ include file="../model/css.jsp"%>
</head>
<body class="no-skin">
	<%@ include file="../model/menu.jsp"%>
	

	<!-- 中部内容 -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state col-md-12" id="breadcrumbs">
				<div class="widget-box widget-color-dark ui-sortable-handle"
					id="widget-box-11">
					<div class="widget-header">
						<h6 class="widget-title">订单详情</h6>
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
							<div class="scroll-content col-sm-8 col-md-8" style="height: 500px;">
								<input type="hidden" id="id" value="${order.id }" />
								<div class="col-sm-4 col-md-4">
								<div class="col-sm-12 col-md-12">
									名称：<input type="text" id="name"
										class="form-control ui-autocomplete-input"
										value="${order.name}"></input>
								</div>
								<div class="col-sm-12 col-md-12">
									总价：<input type="text" id="totalPrice" name="value"
										class="form-control ui-autocomplete-input"
										value="${order.totalPrice}"></input>
								</div>
								<div class="col-sm-12 col-md-12">
									用户编号：<input type="text" id="userId"
										class="form-control ui-autocomplete-input"
										value="${order.userId}"></input>
								</div>
								<div class="col-sm-12 col-md-12">
									日期：
									<div class="input-group input-group-sm">
										<input type="text" id="date" class="form-control"
											value="<fmt:formatDate value='${order.date}' type='date' pattern='yyyy-MM-dd'/>" />
										<span class="input-group-addon"> <i
											class="ace-icon fa fa-calendar"></i>
										</span>
									</div>
								</div>
								</div>
								<div  class="col-sm-4 col-md-4">

									<div class="col-sm-12 col-md-12">
										附件：<a class="upload-btn">上传文件 <input
										type="file" name="file" id="newEditPUpload"></input>
									</a> <input type="hidden" id="fileName"></input>
									</div>
									<div class="put-evidence col-sm-12 col-md-12" id="box">
										<c:forEach items="${order.files}" var="item" varStatus="status">
											<a id = "${item.id }"  href="${item.fileUrl }" value="${item.fileName }" target="_Blank">${item.fileName }</a><br>
										</c:forEach>
										
									</div>
								</div>
								<div  class="col-sm-4 col-md-4">
									<table class="table  table-bordered table-hover">
										<tr>
											<td>商品名称</td>
											<td>商品价格</td>
											<td>商品描述</td>
											<td>商品类型</td>
										</tr>
										<c:forEach items="${order.items}" var="item" varStatus="status">
											<tr>
												<td>${item.name }</td>
												<td>${item.price }</td>
												<td>${item.description }</td>
												<td>${item.type }</td>
											</tr>
										</c:forEach>
									</table>
								</div>
								</div>
								
							</div>
							
						</div>
					</div>
				</div>
				<div  class="col-sm-12 col-md-12">
									<div class="col-sm-6 col-md-6">
									<c:if test="${not empty order.id }">
										<a class="btn btn-info btn-sm" href="/order/addPro?orderId=${order.id}">添加商品</a>
									</c:if>
									<a class="btn btn-info btn-sm" id="submit">提交</a>
								</div>
								</div>
								
			</div>
		</div>



	<!-- 中部内容 -->
	
	<%@ include file="../model/buttom.jsp"%>
	
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery-ui.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/product/ajaxfileupload.js"></script>
	<script src="${pageContext.request.contextPath }/js/order/json.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/order/orderDetail.js"></script>
	<script type="text/javascript">
			jQuery(function($) {
			
				$( "#date").datepicker({
					showOtherMonths: true,
					selectOtherMonths: false,
					dateFormat:"yy-mm-dd"
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