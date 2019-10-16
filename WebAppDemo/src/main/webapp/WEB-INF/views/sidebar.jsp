<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/ico/favicon.ico">


<div id="sidebar" class="span3">
<div class="well well-small">
	<ul class="nav nav-list">

				<c:forEach var='categoryDefualt' items='${categoryList}'>
					<li><a href='products/${categoryDefualt}'>
					<span class="icon-chevron-right">
					${categoryDefualt}</span></a></li>
				</c:forEach>
				
				<li style="border: 0">&nbsp;</li>
<!-- 				<li><a class="totalInCart" href="#"><strong>Total Amount  -->
<!-- 				<span class="badge badge-warning pull-right" -->
<!-- 							style="line-height: 18px;">$448.42</span> -->
<!-- 					</strong></a></li> -->
			</ul>
		</div>

<!-- 		<div class="well well-small alert alert-warning cntr"> -->
<!-- 			<h2>50% Discount</h2> -->
<!-- 			<p> -->
<!-- 				only valid for online order. <br> -->
<!-- 				<br> -->
<!-- 				<a class="defaultBtn" href="#">Click here </a> -->
<!-- 			</p> -->
<!-- 		</div> -->
		<div class="well well-small">
			<a href="#"><img src="${pageContext.request.contextPath}/img/paypal.jpg"
				alt="payment method paypal"></a>
		<br> <br>

<!-- 		<a class="shopBtn btn-block" href="#">Upcoming products <br> -->
<!-- 		<small>Click to view</small></a>  -->
		<ul class="nav nav-list promowrapper">
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="#" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="${pageContext.request.contextPath}/img/bootstrap-ecommerce-templates.PNG"
						alt="bootstrap ecommerce templates">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="#">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
			<li style="border: 0">&nbsp;</li>
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="#" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="${pageContext.request.contextPath}/img/shopping-cart-template.PNG"
						alt="shopping cart template">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="#">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
			<li style="border: 0">&nbsp;</li>
			<li>
				<div class="thumbnail">
					<a class="zoomTool" href="#" title="add to cart"><span
						class="icon-search"></span> QUICK VIEW</a> <img
						src="${pageContext.request.contextPath}/img/bootstrap-template.png" alt="bootstrap template">
					<div class="caption">
						<h4>
							<a class="defaultBtn" href="#">VIEW</a> <span
								class="pull-right">$22.00</span>
						</h4>
					</div>
				</div>
			</li>
		</ul>
</div>
	</div>