$(function() {
	/**
	 * 页面加载初始化
	 */
	var telephone=getCookie("telephone");
	var password=getCookie("password");
	var remember=getCookie("remember");
	if(remember && remember==1){
		$('#remember').prop('checked',true);
        $('#telephone').val(telephone);
        $('#password').val(password);
	}
	/**
	 * 登录事件
	 */
	$("#login").click(function() {
		var telephone = $("#telephone").val();
		var password = $("#password").val();
		var remember;
		if ($("#remember").is(':checked')) {
			remember = 1;
		} else {
			remember = 0;
		}
		if (!telephone) {
			alert("请输入手机号码");
			return;
		}
		if (!password) {
			alert("请输入密码");
			return;
		}
		$.ajax({
			url : "/login",
			type : 'POST',
			dataType : 'json',
			data : {
				telephone : telephone,
				password : password,
				remember : remember
			},
		}).done(function(e) {
			if (e.code == 1) {
				location.href = '/order/list';
			} else {
				alert(e.message);
			}
		}).fail(function(e) {
		});
	});
	/**
	 * 注册事件
	 */
	$("#register").click(function() {
		var telephone = $("#reg_telephone").val();
		var email = $("#reg_email").val();
		var username = $("#reg_username").val();
		var password = $("#reg_password").val();
		var rpassword = $("#reg_rpassword").val();
		var user={};
		if(!(/^1[34578]\d{9}$/.test(telephone))){
			message("手机号码格式有误");
			return;
		}
		if(username==""){
			message("用户名格式有误");
			return;
		}
		if(password.length<5){
			message("密码长度太短");
			return;
		}
		if(password==rpassword){
			user.telephone=telephone;
			user.email=email;
			user.name=username;
			user.password=password;
		}else{
			message("两次输入密码不同");
			return;
		}
		var str = JSON.stringify(user);
		$.ajax({
			url : "/register",
			type : 'POST',
			dataType : 'json',
			data : {
				user:str
			},
		}).done(function(e) {
			if (e.code == 1) {
				location.href = '/';
			} else {
				alert(e.message);
			}
		}).fail(function(e) {
		});
	});
	
	/**
	 * 获取cookie方法
	 */
	function getCookie(cookieName) {
		var allcookies = document.cookie;
		var cookiePos = allcookies.indexOf(cookieName); // 索引的长度
		if (cookiePos != -1) {
			// 把cookie_pos放在值的开始，只要给值加1即可。
			cookiePos += cookieName.length + 1;
			var cookieEnd = allcookies.indexOf(";", cookiePos);

			if (cookieEnd == -1) {
				cookieEnd = allcookies.length;
			}
			var value = decodeURI(allcookies.substring(cookiePos, cookieEnd));
		}
		return value;
	}
	
	function message(message){
		bootbox.dialog({
			message: "<span class='bigger-110'>"+message+"</span>",
			buttons:
			{
				/*"success" :
				 {
					"label" : "<i class='ace-icon fa fa-check'></i> Success!",
					"className" : "btn-sm btn-success",
					"callback": function() {
						//Example.show("great success");
					}
				},*/
				"danger" :
				{
					"label" : "ok",
					"className" : "btn-sm btn-danger",
					"callback": function() {
						//Example.show("uh oh, look out!");
					}
				}, 
				/*"click" :
				{
					"label" : "Click ME!",
					"className" : "btn-sm btn-primary",
					"callback": function() {
						//Example.show("Primary button");
					}
				}, 
				"button" :
				{
					"label" : "Just a button...",
					"className" : "btn-sm"
				}*/
			}
		});
	}
});