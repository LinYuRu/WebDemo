
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet"/>
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
	<div class="well well-small">
	<h3>Our Products </h3>
		<div class="row-fluid">
		  <ul class="thumbnails">
		  <c:forEach var='product' items='${products}'>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/a.jpg" alt=""></a>
				<div class="caption cntr">
					<p>${product.productName}</p>
					<p><strong>${product.productPrice}</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			</c:forEach>
		  </ul>
		</div>
	<div class="row-fluid">
		  <ul class="thumbnails">
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/d.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/e.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/f.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
		  </ul>
		</div>
	<div class="row-fluid">
		  <ul class="thumbnails">
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/g.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/h.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/i.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
		  </ul>
		</div>
	<div class="row-fluid">
		  <ul class="thumbnails">
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/a.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/b.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
			<li class="span4">
			  <div class="thumbnail">
				<a href="productdetails" class="overlay"></a>
				<a class="zoomTool" href="productdetails" title="add to cart"><span class="icon-search"></span> QUICK VIEW</a>
				<a href="productdetails"><img src="${pageContext.request.contextPath}/img/c.jpg" alt=""></a>
				<div class="caption cntr">
					<p>Manicure & Pedicure</p>
					<p><strong> $22.00</strong></p>
					<h4><a class="shopBtn" href="#" title="add to cart"> Add to cart </a></h4>
					<div class="actionList">
						<a class="pull-left" href="#">Add to Wish List </a> 
						<a class="pull-left" href="#"> Add to Compare </a>
					</div> 
					<br class="clr">
				</div>
			  </div>
			</li>
		  </ul>
		</div>
	
	</div>
	</div>
	</div>
<!-- 
Clients 
-->
	<tr>
		<td><c:import url="/WEB-INF/views/footer.jsp" /></td>
	</tr>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="${pageContext.request.contextPath}/js/shop.js"></script>
  </body>
</html>