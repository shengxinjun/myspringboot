<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../model/header.jsp"%>


</head>
<body class="no-skin">
	<%@ include file="../model/menu.jsp"%>

	<!-- 中部内容 -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<table class="table">
					<caption>订单列表</caption>
					<div class="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input placeholder="Search ..."
								type="text" class="nav-search-input"></input> <i
								class="ace-icon fa fa-search nav-search-icon" id="search"></i>
							</span>
						</form>
					</div>

					<thead>
						<tr>
							<td><input type="checkbox" id="selectAll"></td>
							<td>名称</td>
							<td>总价</td>
							<td>用户编号</td>
							<td>日期</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${paging.list}" var="item" varStatus="status">
							<input class="choose" type="hidden" value="${item.name}" />
							<tr>
								<td><input type="checkbox" name="order" value="${item.id}"></td>
								<td>${item.name}</td>
								<td>${item.totalPrice}</td>
								<td>${item.userId}</td>
								<td><fmt:formatDate value="${item.date}"
										pattern="yyyy-MM-dd" /></td>
								<td>
									<button class="btn btn-xs btn-info"
										onclick="location.href='/order/findOrderById/${item.id}'">
										<i class="ace-icon fa fa-pencil bigger-120"></i>
									</button>
									<button class="btn btn-xs btn-danger"
										onclick="location.href='/order/deleteOrderById/${item.id}'">
										<i class="ace-icon fa fa-trash-o bigger-120"></i>
									</button>
								</td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
				<div class="ui-pg-div">
					<button class="btn" onclick="location.href='/order/turnToAdd'">
						<i class="ace-icon fa fa-plus-circle bigger-200 green"></i>
					</button>
					<button class="btn" id="delBtn">
						<i class="ace-icon fa fa-trash-o bigger-200"></i>
					</button>
					<button class="btn" onclick="location.href='/order/export'">
						<i class="ace-icon fa fa-share bigger-200"></i>
					</button>
					<div class="btn-group btn-corner" id="pages">
						<input type="hidden" value="${paging.totalCount }" id="totalCount" />
						<input type="hidden" value="${pageNumber }" id="pageNumber" />
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- 中部内容 -->

	<%@ include file="../model/buttom.jsp"%>

	<script src="${pageContext.request.contextPath }/js/order/orderList.js"></script>

</body>
</html>