<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file="/common/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="trang chủ"/></title>

<link href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css" media="all" />
<!-- Custom styles for this template -->
<link href="<c:url value='template/web/css/style.css' />" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<!-- header -->
	<%@include file="/common/web/header.jsp"%>
	<!-- header -->


	<div class="container">
	  <dec:body />
	</div>


	<!-- footer -->
	<%@include file="/common/web/footer.jsp"%>
	<!-- footer -->


	
	<script type="text/javascript" src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>

</body>
</html>