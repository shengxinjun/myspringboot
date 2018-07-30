<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
username：<input id = "username"/>
password:<input id = "password"/>
<button id = "submit" onclick="submit()">submit</button>
<a href = "/login/select">select</a>

<script type="text/javascript">
function submit(){
	var name = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	location.href="/login/test?name="+name+"&amp;password="+password;
}
</script>
</body>
</html>