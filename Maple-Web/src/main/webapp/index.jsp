<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8" />
<title>系统管理</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<%@ include file="resources/page.jsp"%>
<link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<!-- 页面顶部 -->
	<%@ include file="head.jsp"%>

	<!-- BEGIN HEADER & CONTENT DIVIDER 分隔-->
	<div class="clearfix"></div>
	<!-- END HEADER & CONTENT DIVIDER -->

	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<!-- 菜单 -->
			<%@ include file="menu.jsp"%>
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<!-- 主题等设置 -->
				<%-- <%@ include file="theme.jsp"%> --%>
				<!-- BEGIN PAGE BAR -->
				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><a href="index.html">首页</a> <i class="fa fa-circle"></i></li>
						<li><span>系统菜单</span></li>
					</ul>
				</div>
				<!-- END PAGE BAR -->
				<iframe name="mainFrame" id="mainFrame" frameborder="0"
					src="content.jsp"
					style="margin: 0 auto; width: 100%; height: 600px;"></iframe>
				<!-- END PAGE HEADER-->
			</div>
			<!-- END CONTENT BODY -->
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->
	<!-- 页面底部 -->
	<%@ include file="footer.jsp"%>
</body>
</html>