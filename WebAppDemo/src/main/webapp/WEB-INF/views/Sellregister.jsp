<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>賣家註冊</title>
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
	<%
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);
%>
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


		<!-- 
New Products
-->
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index">首頁</a> <span class="divider">/</span></li>
				<li class="Sellregister"> 賣家註冊 </li>
			</ul>
			<h3> 賣家註冊  </h3>
			<hr class="soft" />


			<div class="well">
				<form:form method='POST' modelAttribute="ShopFinanceBean"
					class="bs-docs-example form-horizontal"
					enctype="multipart/form-data">
					<h3>新增銀行帳號</h3>
					<sup>*</sup>
					<div class="control-group">
						<label class="control-label" for='shopBank'>銀行 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 銀行名稱"> -->
							<form:input id="shopBank" path="shopBank" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='shopCountry'>地區 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 地區"> -->
							<form:input id="shopCountry" path="shopCountry" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='shopDBankName'>行名 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 分行名稱"> -->
							<form:input id="shopDBankName" path="shopDBankName" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='shopBankName'>戶名 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 請填入銀行戶名或公司帳戶名稱"> -->
							<form:input id="shopBankName" path="shopBankName"
								placeholder=" 請填入銀行戶名或公司帳戶名稱" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='shopBankAccount'>銀行帳號 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 例如123456789"> -->
							<form:input id="shopBankAccount" path="shopBankAccount"
								placeholder=" 例如123456789" type='text' />
						</div>
					</div>
					<h3>使用者資訊</h3>
					<div class="control-group">
						<label class="control-label" for='sellerName'>這裡要連動會員姓名 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder="  資策會"> -->
							<form:input id="sellerName" path="sellerName" placeholder="  資策會"
								type='text' />
						</div>
					</div>
<!-- 					<div class="control-group"> -->
<!-- 						<label class="control-label" for='sellerId'>身分證字號 <sup>*</sup></label> -->
<!-- 						<div class="controls"> -->
<!-- 										  <input type="text" placeholder=" 身分證字號/公司統編/統一證號"> -->
<%-- 							<form:input id="sellerId" path="sellerId" type='text' /> --%>
<!-- 						</div> -->
<!-- 					</div> -->
					<div class="control-group">
						<label class="control-label" for='shopAccount'>帳號 <sup>*</sup></label>
						<div class="controls">
							<form:input id="shopAccount" path="shopAccount" placeholder=" 例如123456789" type='text' />
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for='shopPassword'>密碼 <sup>*</sup></label>
						<div class="controls">
							<form:input id="shopPassword" path="shopPassword" placeholder=" 例如123456789" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='sellerBirth'>會員生日 <sup>*</sup></label>
						<div class="controls">
							<form:input id="sellerBirth" path="sellerBirth"
								placeholder="公司註冊日/會員生日" type='text' />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for='sellerAddr'>地址 <sup>*</sup></label>
						<div class="controls">
							<!-- 			  <input type="text" placeholder=" 台北市"> -->
							<form:input id="sellerAddr" path="sellerAddr"
								placeholder=" 戶籍地址/公司地址" type='text' />
						</div>
					</div>

					<div class="control-group">
						<div class="controls">
							<input type="submit" id="btnReg" value="送出"
								class="shopBtn exclusive">
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
<!-- 
Clients 
-->



<section class="our_client">
	<hr class="soften"/>
	<h4 class="title cntr"><span class="text">Manufactures</span></h4>
	<hr class="soften"/>
	<div class="row">
		<div class="span2">
			<a href="#"><img alt="" src="img/1.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="img/2.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="img/3.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="img/4.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="img/5.png"></a>
		</div>
		<div class="span2">
			<a href="#"><img alt="" src="img/6.png"></a>
		</div>
	</div>
</section>
		<!-- 
footer 
-->
<!-- 		<footer class="footer">	 -->

<footer class="footer">
		<c:import url="/WEB-INF/views/footer.jsp"/>

</footer>
</div>

<!-- /container -->

<div class="copyright">
<div class="container">
<!-- <span>Copyright &copy; 2013<br> bootstrap ecommerce shopping template</span> -->
	<p class="pull-right">
		<a href="#"><img src="${pageContext.request.contextPath}/img/maestro.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/mc.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/pp.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/visa.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/disc.png" alt="payment"></a>
	</p>
	
</div>
</div>
<a href="#" class="gotop"><i class="icon-double-angle-up"></i></a>
<!-- 	 </footer> -->
		<!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="${pageContext.request.contextPath}/js/shop.js"></script>
  </body>
</html>
