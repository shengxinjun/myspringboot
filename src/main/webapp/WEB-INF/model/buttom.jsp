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

	<!-- <![endif]-->

	<!--[if IE]>
<script src="${pageContext.request.contextPath }/assets/js/jquery-1.11.3.min.js"></script>
<![endif]-->
	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='${pageContext.request.contextPath }/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script
		src="${pageContext.request.contextPath }/assets/js/bootstrap.min.js"></script><%-- 
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery-ui.custom.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.ui.touch-punch.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.easypiechart.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.sparkline.index.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.flot.resize.min.js"></script>
 --%>
	<!-- ace scripts -->
	<script
		src="${pageContext.request.contextPath }/assets/js/ace-elements.min.js"></script>
	<script src="${pageContext.request.contextPath }/assets/js/ace.min.js"></script>


	