<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
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
<body style="background-image:url(img/white_leather.png)">
	<!-- 
	Upper Header Section 
-->
	<!-- 
	Upper Header Section 
-->
	<tr>
		<td><c:import url="/WEB-INF/views/header.jsp" /></td>
	</tr>



	<!-- 		側邊類別欄位 -->
	<div class="row">
		<tr>
			<td><c:import url="/WEB-INF/views/sidebar.jsp" /></td>
		</tr>


		<!-- 
New Products
-->
		<!-- 
Body Section 
-->
		<div class="span9">
			<ul class="breadcrumb">
				<h3>個人頁面</h3>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> 
										<!--<img src="<c:url value='/getPicture/${product.productId}'/>" alt="" 
										style="width: 100%">-->
									    <img src = "https://ppt.cc/fTn5Fx"  alt="" style=" border:1.5px black solid; width:80%;" /> 
									</a> 
										
								</div>
							</div>
						</div>
					</div>
					<div class="span7">
						
						<hr class="soft" />

						<form class="form-horizontal qtyFrm">
							<div class="control-group">
								<label class="control-label"><span></span></label>
								<div class="controls">
									<input type="button" value="買家資訊" style="width:120px;height:40px;font-size:20px;">
								</div>
							</div>

							<div class="control-group">
								<label class="control-label"><span></span></label>
								<div class="controls">
									<input type="button" value="賣家資訊" style="width:120px;height:40px;font-size:20px;">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label"><span></span></label>
								<div class="controls">
									<input type="button" value="UNDEFINED" style="width:120px;height:40px;font-size:20px;">
								</div>
							</div>


								
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">買家資料</a></li>
					<li class=""><a href="#profile" data-toggle="tab">更改資料 </a></li>
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						<h4>Product Information</h4>
						<table class="table table-striped">
							<tbody>
								<tr class="techSpecRow">
									<td class="techSpecTD1">姓名:</td>
									<td class="techSpecTD2">Black</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">e-mail:</td>
									<td class="techSpecTD2">Apparel,Sports</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">帳號:</td>
									<td class="techSpecTD2">spring/summer</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Usage:</td>
									<td class="techSpecTD2">fitness</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Sport:</td>
									<td class="techSpecTD2">122855031</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Brand:</td>
									<td class="techSpecTD2">Shock Absorber</td>
								</tr>
							</tbody>
						</table>


					</div>
					<div class="tab-pane fade" id="profile">
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft">
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soft" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="tab-pane fade" id="cat1">
						<p>Etsy mixtape wayfarers, ethical wes anderson tofu before
							they sold out mcsweeney's organic lomo retro fanny pack lo-fi
							farm-to-table readymade. Messenger bag gentrify pitchfork
							tattooed craft beer, iphone skateboard locavore carles etsy
							salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
							Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh
							mi whatever gluten-free, carles pitchfork biodiesel fixie etsy
							retro mlkshk vice blog. Scenester cred you probably haven't heard
							of them, vinyl craft beer blog stumptown. Pitchfork sustainable
							tofu synth chambray yr.</p>
						<br> <br>
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/b.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/a.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
					</div>
					<div class="tab-pane fade" id="cat2">

						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="productdetails" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="productdetails" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />

					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- Body wrapper -->
	<!-- 		   </div>  -->
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
	<script
		src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
	<script src="${pageContext.request.contextPath}/js/shop.js"></script>
</body>
</html>