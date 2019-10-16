<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Twitter Bootstrap shopping cart</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet"/>
<!--     Customize styles -->
<!--     <link href="style.css" rel="stylesheet"/> -->
    <!-- font awesome styles -->
	<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet">
	<!-- Favicons -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/ico/favicon.ico">
  </head>
<body style="background-image:url(img/white_leather.png)">
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
	<div class="row">
		<tr>
			<td><c:import url="/WEB-INF/views/sidebar.jsp" /></td>
		</tr>
	</div>

		<!-- 
New Products
-->
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="login">登入</a> <span class="divider">/</span></li>
		<li class="forget_password">FORGOT YOUR PASSWORD</li>
    </ul>
	<div class="well well-small">
	<h3> 忘記密碼</h3>	
	<hr class="soft"/>
	
	請輸入曾經登入的 e-mail，我們會寄給你一組新的密碼<br/><br/><br/>
	
	
	<form class="form-inline">
		<label class="control-label" for="inputEmail">E-mail </label>
		<input type="text" class="span4" placeholder="Email">			  
		<button type="submit" class="shopBtn block">重設密碼</button>
	</form>
</div>
</div>
</div>
<!-- 
Clients 
-->
<!-- 	Foots  	-->
	<div>
		<tr>
			<td><c:import url="/WEB-INF/views/footer.jsp" /></td>
		</tr>
	</div>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="${pageContext.request.contextPath}/js/shop.js"></script>
  </body>
</html>
