<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>
<!-- **********************************************************************************************************************************
		**************************************************************个人css引入位置********************************************************
	  **********************************************************************************************************************************-->

</head>
<body class="no-skin">
	<%@ include file="../model/menu.jsp"%>


	<!-- 中部内容 -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state col-md-9" id="breadcrumbs">
				<div class="widget-box widget-color-dark ui-sortable-handle"
					id="widget-box-11">

					<c:forEach items="${paging.list}" var="item" varStatus="status">
						${item.name}
					
					</c:forEach>

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

	<script
		src="${pageContext.request.contextPath }/js/product/productList.js"></script>
</body>
</html>