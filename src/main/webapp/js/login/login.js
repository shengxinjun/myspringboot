$(function() {
	var telephone=getCookie("telephone");
	var password=getCookie("password");
	var remember=getCookie("remember");
	if(remember && remember==1){
		$('#remember').prop('checked',true);
        $('#telephone').val(telephone);
        $('#password').val(password);
	}
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
});