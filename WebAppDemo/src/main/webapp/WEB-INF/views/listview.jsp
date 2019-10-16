<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>  
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>ListView</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap styles -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet"/>
    <!-- Customize styles -->
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet"/>
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
Body Section 
-->
	
<div class="span9">
<div class="well well-small">

		
	<c:forEach var='product' items='${products}'>
	  	<div class="row-fluid">
	  	<div class="span2">
			<a href="<spring:url value='product?productId=${product.productId}' />">
			<img src="<c:url value='/getPicture/${product.productId}'/>" alt=""></a>
		</div>
		<div class="span6">
			<h5>${product.productName} </h5>
			<p>
			${product.productInfo}
			</p>
		</div>
		<div class="span4 alignR">
		<form class="form-horizontal qtyFrm">
		<h3>$ ${product.productPrice}</h3>
		<h4> ${product.categoryDefualt} </h4>
		<label class="checkbox">
			<input type="checkbox">  加入清單
		</label><br>
		<div class="btn-group">
		  <a href="#" class="defaultBtn"><span class=" icon-shopping-cart"></span> 加入購物車</a>
		  <a href="<spring:url value='product?productId=${product.productId}' />" class="shopBtn">VIEW</a>
		 </div>
			</form>
		</div>
		
	</div>
	<hr class="soften">
	</c:forEach>
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