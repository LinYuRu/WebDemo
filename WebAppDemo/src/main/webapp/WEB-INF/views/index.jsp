<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Index</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/ico/favicon.ico">

<!-- <meta http-equiv="Pragma" content="no-cache"> -->
<!-- <meta http-equiv="Cache-Control" content="no-cache"> -->
<!-- <meta http-equiv="Expires" content="0"> -->

<%
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", 0);
%>
</head>
<body style="background-image:url(img/white_leather.png)">
<!-- 		檔頭欄位 -->
	<tr>
		<td><c:import url="/WEB-INF/views/header.jsp" /></td>
	</tr>
	
<!-- Body Section  -->

		
		
<!-- 		側邊類別欄位 -->
<div class="row">
		<tr>  
			<td><c:import url="/WEB-INF/views/sidebar.jsp" /></td>
		</tr>
<!-- 
New Products
-->		

			<div class="span9">
				<div class="well np">
					<div id="myCarousel" class="carousel slide homCar">
						<div class="carousel-inner">
							<div class="item">
								<img style="width: 100%"
									src="${pageContext.request.contextPath}/img/bootstrap_free-ecommerce.png"
									alt="bootstrap ecommerce templates">
								<div class="carousel-caption">
									<h4>Bootstrap shopping cart</h4>
									<p>
										<span>Very clean simple to use</span>
									</p>
								</div>
							</div>
							<div class="item">
								<img style="width: 100%" src="${pageContext.request.contextPath}/img/carouse1.png"
									alt="bootstrap ecommerce templates">
								<div class="carousel-caption">
									<h4>Bootstrap Ecommerce template</h4>
									<p>
										<span>Highly Google seo friendly</span>
									</p>
								</div>
							</div>
							<div class="item active">
								<img style="width: 100%" src="${pageContext.request.contextPath}/img/carouse3.png"
									alt="bootstrap ecommerce templates">
								<div class="carousel-caption">
									<h4>Twitter Bootstrap cart</h4>
									<p>
										<span>Very easy to integrate and expand.</span>
									</p>
								</div>
							</div>
							<div class="item">
								<img style="width: 100%"
									src="${pageContext.request.contextPath}/img/bootstrap-templates.png"
									alt="bootstrap templates">
								<div class="carousel-caption">
									<h4>Bootstrap templates integration</h4>
									<p>
										<span>Compitable to many more opensource cart</span>
									</p>
								</div>
							</div>
						</div>
						<a class="left carousel-control" href="#myCarousel"
							data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
							href="#myCarousel" data-slide="next">&rsaquo;</a>
					</div>
				</div>
				<!--
New Products
-->
				<div class="well well-small">
					<h3>New Products</h3>
					<hr class="soften" />
					<div class="row-fluid">
						<div id="newProductCar" class="carousel slide">
							<div class="carousel-inner">
								<div class="item active">
									<ul class="thumbnails">
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="#" class="tag"></a> <a
													href="productdetails"><img
													src="${pageContext.request.contextPath}/img/bootstrap-ring.png" alt="bootstrap-ring"></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="#" class="tag"></a> <a
													href="<spring:url value='product?productId=${product.productId}' />"><img src="${pageContext.request.contextPath}/img/i.jpg"
													alt=""></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="#" class="tag"></a> <a
													href="productdetails"><img src="${pageContext.request.contextPath}/img/g.jpg"
													alt=""></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="productdetails"><img
													src="${pageContext.request.contextPath}/img/s.png" alt=""></a>
											</div>
										</li>
									</ul>
								</div>
								<div class="item">
									<ul class="thumbnails">
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="productdetails"><img
													src="${pageContext.request.contextPath}/img/i.jpg" alt=""></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="productdetails"><img
													src="${pageContext.request.contextPath}/img/f.jpg" alt=""></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="productdetails"><img
													src="${pageContext.request.contextPath}/img/h.jpg" alt=""></a>
											</div>
										</li>
										<li class="span3">
											<div class="thumbnail">
												<a class="zoomTool" href="productdetails"
													title="add to cart"><span class="icon-search"></span>
													QUICK VIEW</a> <a href="productdetails"><img
													src="${pageContext.request.contextPath}/img/j.jpg" alt=""></a>
											</div>
										</li>
									</ul>
								</div>
							</div>
							<a class="left carousel-control" href="#newProductCar"
								data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
								href="#newProductCar" data-slide="next">&rsaquo;</a>
						</div>
					</div>
					
<!-- 					TOP5 -->

					<div class="row-fluid"><ul>
<%-- 					<c:if test="${vs.count%3==1}"> --%>
<%-- 						<% --%>
<!-- 							out.print("<ul class=\"thumbnails\">"); -->
<%-- 						%> --%>
<%-- 					</c:if> --%>
					<c:forEach var='top5' items='${top5}' varStatus="vs">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool"
										href="<spring:url value='top5Product?top5Id=${top5.top5Id}' />"
										title="add to cart"><span class="icon-search"></span> 快速瀏覽
									</a> 
										 <a href="<spring:url value='top5Product?top5Id=${top5.top5Id}' />"><img
										src="<c:url value='/getTop5Picture/${top5.top5Id}'/>" alt=""></a>
									<div class="caption cntr">
										<p> ${top5.top5Name}</p>
										<p>
											<strong> $ ${top5.top5Price}</strong>
										</p>
										<p>
											<strong> ${top5.classDefualt}</strong>
										</p>
										<h4>
											<a class="shopBtn" href="#" title="add to cart"> 加入購物車 </a>
										</h4>

										<br class="clr">
									</div>
								</div>
							</li>
							</c:forEach>
							</ul>
<%-- 					<c:if test="${vs.count%3==1}"> --%>
<%-- 						<% --%>
<!--  							out.print("<ul class=\"thumbnails\">"); -->
<%-- 						%> --%>
<%-- 					</c:if> --%>
				</div>
				</div>
				<!--
	Featured Products
	-->
				<div class="well well-small">
					<h3>
						<a class="btn btn-mini pull-right" href="products"
							title="View more">VIew More<span class="icon-plus"></span></a>
						Featured Products
					</h3>
					<hr class="soften" />
					<div class="row-fluid">
						<ul class="thumbnails">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="productdetails"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="productdetails"><img
										src="${pageContext.request.contextPath}/img/d.jpg" alt=""></a>
									<div class="caption">
										<h5>Manicure & Pedicure</h5>
										<h4>
											<a class="defaultBtn" href="productdetails"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
										</h4>
									</div>
								</div>
							</li>
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="productdetails"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="productdetails"><img
										src="${pageContext.request.contextPath}/img/e.jpg" alt=""></a>
									<div class="caption">
										<h5>Manicure & Pedicure</h5>
										<h4>
											<a class="defaultBtn" href="productdetails"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
										</h4>
									</div>
								</div>
							</li>
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="productdetails"
										title="add to cart"><span class="icon-search"></span>
										QUICK VIEW</a> <a href="productdetails"><img
										src="${pageContext.request.contextPath}/img/f.jpg" alt="" /></a>
									<div class="caption">
										<h5>Manicure & Pedicure</h5>
										<h4>
											<a class="defaultBtn" href="productdetails"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="#" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
										</h4>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>

<!-- 				<div class="well well-small"> -->
<!-- 					<a class="btn btn-mini pull-right" href="#">View more <span -->
<!-- 						class="icon-plus"></span></a> Popular Products -->
<!-- 				</div> -->
<!-- 				<hr> -->
<!-- 				<div class="well well-small"> -->
<!-- 					<a class="btn btn-mini pull-right" href="#">View more <span -->
<!-- 						class="icon-plus"></span></a> Best selling Products -->
<!-- 				</div> -->
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
	<p class="pull-right">
		<a href="#"><img src="${pageContext.request.contextPath}/img/maestro.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/mc.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/pp.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/visa.png" alt="payment"></a>
		<a href="#"><img src="${pageContext.request.contextPath}/img/disc.png" alt="payment"></a>
	</p>
<!-- 	<span>Copyright &copy; 2013<br> bootstrap ecommerce shopping template</span> -->
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