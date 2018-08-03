<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GOD</title>
</head>
<body>
	<table>
		<tr>
			<th>name</th>
			<th>totalPrice</th>
			<th>desc</th>
			<th>date</th>
		</tr>
		<c:forEach items="${paging.list}" var="item" varStatus="status">
			<tr>
				<td class="center"><span class="center">${item.name}</span></td>
				<td class="center"><span class="center">${item.totalPrice}</span></td>
				<td class="center"><span class="center">${item.desc}</span></td>
				<td class="center"><span class="center">${item.date}</span></td>
			</tr>
			<br>
		</c:forEach>
	</table>
	${name.name}
</body>
</html>