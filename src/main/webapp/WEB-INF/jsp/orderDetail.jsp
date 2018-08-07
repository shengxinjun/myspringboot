<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/orderDetail.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/json.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detail</title>
</head>
<body>
name:<input id = "name" value="${order.name}"></input><br>
price:<input id = "price" value="${order.totalPrice}"></input><br>
date:<input id = "date" value="${order.date}"></input><br>
<input id="id" type="hidden" value="${order.id}"></input><br>
<button id = "submit">提交</button>

</body>
</html>