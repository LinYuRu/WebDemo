<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>註冊畫面</title>
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
		<!-- 			<ul class="breadcrumb"> -->
		<!-- 				<li><a href="index">首頁</a> <span class="divider">/</span></li> -->
		<!-- 				<li class="register"> 買家註冊 </li> -->
		<!-- 			</ul> -->
		<h3>註冊</h3>
		<hr class="soft" />
		<div class="well">
			<form:form method='POST' modelAttribute="PersonalMemberBean"
				class="bs-docs-example form-horizontal"
				enctype="multipart/form-data">
				<h3>您的個人資料</h3>

				<div class="control-group">
					<label class="control-label" for='memberEmail'> Email <sup>*</sup></label>
					<div class="controls">
						<form:input id="memberEmail" path="memberEmail"
							placeholder=" Email " type='text' />
					</div>
				</div>

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

				<!-- 		<div class="control-group"> -->
				<!-- 			<label class="control-label">稱謂 <sup>*</sup></label> -->
				<!-- 			<div class="controls"> -->
				<!-- 				<select class="span1" name="days"> -->
				<!-- 					<option value="">-</option> -->
				<!-- 					<option value="1">先生</option> -->
				<!-- 					<option value="2">小姐</option> -->
				<!-- 					<option value="3">Miss</option> -->
				<!-- 				</select> -->
				<!-- 			</div> -->
				<!-- 		</div> -->
				<div class="control-group">
					<label class="control-label" for='memberName'> 姓名 <sup>*</sup></label>
					<div class="controls">
						<form:input id="memberName" path="memberName" placeholder=" 姓名 "
							type='text' />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for='memberBirth'> 生日 <sup>*</sup></label>
					<div class="controls">
						<form:input id="memberBirth" path="memberBirth"
							placeholder=" 2019-10-10 " type='text' />
					</div>
				</div>
				<!--  <div class="control-group info">
					<label class="control-label" for="memberImage"><spring:message
							code='spring.register.form.image.label' /></label>
					<div class="controls">
						<form:input id="memberImage" path="memberImage" type='file'
							class='form:input-large' />
						<span class="help-inline"></span>
					</div>
				</div>-->
				<div class="control-group">
					<div class="controls">
						<input type="submit" id="btnReg" value="送出"
							class="shopBtn exclusive">
					</div>
				</div>
			</form:form>
		</div>
	</div>
	<!-- 	foots  	-->
	<div style="clear:both;">
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
