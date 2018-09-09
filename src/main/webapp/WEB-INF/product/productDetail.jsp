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
							<div class="scroll-content" style="height: 500px;">
								<input type="hidden" id="id" value="${product.id }" />
								<div class="col-sm-8 col-md-7">
									名称：<input type="text" id="name"
										class="form-control ui-autocomplete-input"
										value="${product.name}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									单价：<input type="text" id="price" name="value"
										class="form-control ui-autocomplete-input"
										value="${product.price}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									产品类别：<input type="text" id="type"
										class="form-control ui-autocomplete-input"
										value="${product.type}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									描述：<input type="text" id=description
										class="form-control ui-autocomplete-input"
										value="${product.description}"></input>
								</div>
								<div class="col-sm-8 col-md-7">
									创建日期：
									<div class="input-group input-group-sm">
										<input type="text" id="date" class="form-control"
											value="<fmt:formatDate value='${product.createDate}' type='date' pattern='yyyy-MM-dd'/>" />
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
	<script src="${pageContext.request.contextPath }/assets/js/jquery-ui.min.js"></script>
	
	<script src="${pageContext.request.contextPath }/js/product/productDetail.js"></script>
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