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
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="style.css" rel="stylesheet"/>
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
	

<!-- 
New Products
-->
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index">Home</a> <span class="divider">/</span></li>
		<li class="active">Page Title</li>
    </ul>
<div class="well well-small">

<hr class="soft"/>
	
	<hr/>
	<h2>新增產品表單</h2><br/>

					<form:form method='POST' modelAttribute="ProductBean"
						class="bs-docs-example form-horizontal"
						enctype="multipart/form-data">
						<div class="control-group info">
							<label class="control-label" for="productName">產品名稱</label>
							<div class="controls">
								<form:input id="productName" path="productName" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="productInfo">產品敘述</label>
							<div class="controls">
								<form:input id="productInfo" path="productInfo" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						
						<div class="control-group info">
							<label class="control-label" for="productPrice">產品定價</label>
							<div class="controls">
								<form:input id="productPrice" path="productPrice" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="productQuantity">產品數量</label>
							<div class="controls">
								<form:input id="productQuantity" path="productQuantity"
									type='text' class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="classDefualt">產品樣式</label>
							<div class="controls">
								<form:input id="classDefualt" path="classDefualt" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="productWeight">產品重量</label>
							<div class="controls">
								<form:input id="productWeight" path="productWeight" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="productStatus">產品狀況</label>
							<div class="controls">
								<form:input id="productStatus" path="productStatus" type='text'
									class='form:input-large' />
								<span class="help-inline"></span>
							</div>
						</div>
<!-- 						<div class="control-group info"> -->
<!-- 							<label class="control-label" for="packageAddressList">運費</label> -->
<!-- 							<div class="controls"> -->
<%-- 								<form:input id="packageAddressList" path="packageAddressList" type='text' --%>
<%-- 									class='form:input-large' /> --%>
<!-- 								<span class="help-inline"></span> -->
<!-- 							</div> -->
<!-- 						</div> -->

						<div class="control-group info">
							<label class="control-label" for="categoryDefualt">類別</label>
							<div class="controls">

								<form:select path="categoryDefualt">
									<form:option value="-1" label="請挑選" />
									<form:options items="${categoryList}" />
								</form:select>
								<span class="help-inline"></span>
							</div>
						</div>

						<div class="control-group info">
							<label class="control-label" for="packageId">運費</label>
							<div class="controls">
							
							<form:select path="packageId">
							<form:option value="-1" label="請挑選"/>
							<form:options items="${deliveryList}" />
						</form:select>
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label" for="productImage"><spring:message
									code='spring.addProduct.form.image.label' /></label>
							<div class="controls">
								<form:input id="productImage" path="productImage"
							type='file' class='form:input-large' /> 
								<span class="help-inline"></span>
							</div>
						</div>
						<div class="control-group info">
							<label class="control-label"></label>
							<div class="controls">
								<input id="btnAdd" type='submit' class='btn btn-primary'
									value="送出" />
								<span class="help-inline"></span>
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
