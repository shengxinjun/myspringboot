$(function() {
	$("#login").click(function() {
		var telephone = $("#telephone").val();
		var password = $("#password").val();
		var remember = $("#remember").val();;
		if(!telephone){
			alert("请输入手机号码");
			return;
		}
		if(!password){
			alert("请输入密码");
			return;
		}
		//if(remember)
	});
	
});