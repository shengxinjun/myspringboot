<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<!-- 底部 -->
		<div class="footer">
			<div class="footer-inner">
				<div class="footer-content">
					<span class="bigger-120"> <span class="blue bolder">my
							admin</span> Application &copy; 2018
					</span> &nbsp; &nbsp; <span class="action-buttons"> <a href="#">
							<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
					</a> <a href="#"> <i
							class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
					</a> <a href="#"> <i
							class="ace-icon fa fa-rss-square orange bigger-150"></i>
					</a>
					</span>
				</div>
			</div>
		</div>

		<!-- 底部 -->

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- 封装一个bootstrap的弹框   start
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel">tip</h4>
				</div>
				<div id="alert">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
					</button>
				</div>
			</div>
		</div>
	</div>
	
		js	$("#alert").text("alert的内容");
			$('#myModal').modal();
	
	 封装一个bootstrap的弹框    end-->
	<!--[if !IE]> -->
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='${pageContext.request.contextPath }/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script
		src="${pageContext.request.contextPath }/assets/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath }/assets/js/ace.min.js"></script>
	<script type="text/javascript">
		$(function() {
			var nickname=getCookie("nickname");
			$('#nickname').html(nickname);
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
	</script>

	