<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<title>ace admin</title>
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
			<div class="breadcrumbs ace-save-state col-md-12" id="breadcrumbs">
				<div class="widget-box widget-color-dark ui-sortable-handle col-md-12"
					id="widget-box-11">
					<div class="col-md-2"  style="top:167px">
						<button class="btn btn-success btn-next" data-last="Finish" id="prev">
							<i class="ace-icon fa fa-arrow-left"></i> prev
						</button>
					</div>
					<div  class="col-md-7">
						<input type="hidden" value="${orderId }" id="orderId"/>
						<c:forEach items="${paging.list}" var="item" varStatus="status">

							<div class="pricing-span">
								<div class="widget-box pricing-box-small widget-color-red3">
									<div class="widget-header">
										<h5 class="widget-title bigger lighter">${item.name }</h5>
									</div>

									<div class="widget-body">
										<div class="widget-main no-padding">
											<ul class="list-unstyled list-striped pricing-table">
												<li><c:if test="${not empty item.type}">${item.type}</c:if>
													<c:if test="${empty item.type}">暂无</c:if></li>
												<li><c:if test="${not empty item.description}">${item.description}</c:if>
													<c:if test="${empty item.description}">暂无</c:if></li>
												<li><c:if test="${not empty item.updateDate}">
														<fmt:formatDate type="time" value="${item.updateDate}"
															pattern="yyyy-MM-dd" />
													</c:if> <c:if test="${empty item.updateDate}">暂无</c:if></li>
												<li><c:if test="${not empty item.createDate}">
														<fmt:formatDate type="time" value="${item.createDate}"
															pattern="yyyy-MM-dd" />
													</c:if> <c:if test="${empty item.createDate}">暂无</c:if></li>

											</ul>

											<div class="price">
												<span
													class="label label-lg label-inverse arrowed-in arrowed-in-right">
													￥${item.price} </span>
											</div>
										</div>

										<div>
											<a href="#" class="btn btn-block btn-sm btn-danger" onclick="addPro(${item.id})"> <span>Buy</span>
											</a>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
					<div  class="col-md-2"  style="top:167px">
						<button class="btn btn-success btn-next" data-last="Finish" id="next">next
							<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
						</button>
					</div>
					
					<div class="ui-pg-div">
						<div class="btn-group btn-corner" id="pages">
							<input type="hidden" value="${paging.totalCount }"
								id="totalCount" /> <input type="hidden"
								value="${paging.pageNumber }" id="pageNumber" />
						</div>
					</div>

				</div>
				<a class="btn btn-info btn-sm" href="/order/findOrderById/${orderId }">返回订单</a>
			</div>
		</div>
		<!-- 中部内容 -->

		<%@ include file="../model/buttom.jsp"%>
			<script
		src="${pageContext.request.contextPath }/js/order/addProduct.js"></script>
</body>
</html>