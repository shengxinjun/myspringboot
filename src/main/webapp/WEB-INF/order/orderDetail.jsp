<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>


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
							<div class="scroll-content" style="height: 500px;">
								<input type="hidden" id="id" value="${order.id }" />
								<div class="col-sm-8 col-md-7">
									名称：<input type="text" id="name"
										class="form-control ui-autocomplete-input"
										value="${order.name}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									总价：<input type="text" id="totalPrice" name="value"
										class="form-control ui-autocomplete-input"
										value="${order.totalPrice}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									用户编号：<input type="text" id="userId"
										class="form-control ui-autocomplete-input"
										value="${order.userId}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									日期：
									<div class="input-group input-group-sm">
										<input type="text" id="date" class="form-control"
											value="<fmt:formatDate value='${order.date}' type='date' pattern='yyyy-MM-dd'/>" />
										<span class="input-group-addon"> <i
											class="ace-icon fa fa-calendar"></i>
										</span>
									</div>
								</div>

								<div class="col-sm-8 col-md-7">
									<a class="btn btn-info btn-sm" id="submit">提交</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- 中部内容 -->
	
	<%@ include file="../model/buttom.jsp"%>

	<script src="${pageContext.request.contextPath }/js/order/json.js"></script>
	<script
		src="${pageContext.request.contextPath }/js/order/orderDetail.js"></script>
</body>
</html>