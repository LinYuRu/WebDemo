<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Twitter Bootstrap shopping cart</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<!-- Bootstrap styles -->
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" />
<!--     Customize styles -->
<!--     <link href="style.css" rel="stylesheet"/> -->
<!-- font awesome styles -->
<link
	href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css"
	rel="stylesheet">
<!-- Favicons -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/ico/favicon.ico">
</head>
<body>
	<!-- 
	Upper Header Section 
-->
	<tr>
		<td><c:import url="/WEB-INF/views/header.jsp" /></td>
	</tr>

	<!-- 
Body Section 
-->

	<!-- 		側邊類別欄位 -->
	<div class="row" style="float:left;">
		<tr>
			<td><c:import url="/WEB-INF/views/sidebar.jsp" /></td>
		</tr>
	</div>

	<!-- 
New Products
-->
	<div class="span9">
		<ul class="breadcrumb">
			<li><a href="index.jsp">Home</a> <span class="divider">/</span></li>
			<li class="active">Login</li>
		</ul>
		<h3>Login</h3>
		<hr class="soft" />

		<div class="row">
			<div class="span1">&nbsp;</div>
			<div class="span4">
				<div class="well" style="margin:0px auto;">
					<h5>會員登入</h5>
					<form:form method='POST' modelAttribute="LoginBean"
						class="bs-docs-example form-horizontal"
						enctype="multipart/form-data">
						<div class="control-group">
							<label class="control-label" for='memberAccount'> 帳號 <sup>*</sup></label>
							<div class="controls">
								<form:input id="memberAccount" path="memberAccount"
									placeholder=" 帳號 " type='text' />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for='memberPassword'> 密碼 <sup>*</sup></label>
							<div class="controls">
								<form:input id="memberPassword" path="memberPassword"
									placeholder=" 密碼 " type='text' />
							</div>
						</div>
						<div><font color="red">${sessionScope.loginerr}</font></div>
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="defaultBtn">登入</button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>

	</div>
	</div>
	<!-- 
Clients 
-->
	<section class="our_client">
		<hr class="soften" />
		<h4 class="title cntr">
		</h4>
		<hr class="soften" />
		<div class="row">
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/1.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/2.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/3.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/4.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/5.png"></a>
			</div>
			<div class="span2">
				<a href="#"><img alt="" src="assets/img/6.png"></a>
			</div>
		</div>
	</section>


	<!-- 	Foots  	-->
	<div>
		<tr>
			<td><c:import url="/WEB-INF/views/footer.jsp" /></td>
		</tr>
	</div>
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
	<script src="${pageContext.request.contextPath}/js/shop.js"></script>
</body>
</html>
