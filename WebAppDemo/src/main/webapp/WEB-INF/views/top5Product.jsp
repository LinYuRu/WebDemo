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
    <li><a href="index">Home</a> <span class="divider">/</span></li>
    <li><a href="products">Items</a> <span class="divider">/</span></li>
    <li class="active">Preview</li>
    </ul>	
	<div class="well well-small">
	<div class="row-fluid">
			<div class="span5">
			<div id="myCarousel" class="carousel slide cntr">
                <div class="carousel-inner">
                  <div class="item active">
                   <a href="#"> <img src="<c:url value='/getTop5Picture/${top5.top5Id}'/>" alt="" style="width:100%"></a>
                  </div>
                  <div class="item">
                     <a href="#"> <img src="<c:url value='/getTop5Picture/${top5.top5Id}'/>" alt="" style="width:100%"></a>
                  </div>
                  <div class="item">
                    <a href="#"> <img src="<c:url value='/getTop5Picture/${top5.top5Id}'/>" alt="" style="width:100%"></a>
                  </div>
                </div>
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">‹</a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">›</a>
            </div>
			</div>
			<div class="span7">
				<h3>${top5.top5Name}</h3>
				<hr class="soft"/>
				
				<form class="form-horizontal qtyFrm">
<!-- 				  <div class="control-group"> -->
<!-- 					<label class="control-label"><span> 加入購物車 </span></label> -->
<!-- 					<div class="controls"> -->
<!-- 					<input type="number" class="span6" placeholder="數量"> -->
<!-- 					</div> -->
<!-- 					<button type="submit" class="shopBtn"><span class=" icon-shopping-cart"></span> Add to cart</button> -->
					
<!-- 				  </div> -->
				  
				  <h4> 價格 </h4>
				  <p>  $ ${top5.top5Price}  
				  </p><br>
				  
				  <h4> 品規 </h4>
				  <p>  ${top5.classDefualt}  
				  </p><br>

				  <h4> 數量 </h4>
				  <p>還剩 ${top5.top5Quantity} 件
				  </p>
				  <div class="control-group">
				  <div class="controls">
					<input type="number" class="span6" placeholder="數量">
					</div>
					<button type="submit" class="shopBtn"><span class=" icon-shopping-cart"></span> Add to cart</button>
					</div>
				  				</form>
			</div>
			</div>
				<hr class="softn clr"/>


<!--             <ul id="productDetail" class="nav nav-tabs"> -->
<!--               <li class="active"><a href="#home" data-toggle="tab">Product Details</a></li> -->
<!--               <li class=""><a href="#profile" data-toggle="tab">Related Products </a></li> -->
<!--               <li class="dropdown"> -->
<!--                 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Acceseries <b class="caret"></b></a> -->
<!--                 <ul class="dropdown-menu"> -->
<!--                   <li><a href="#cat1" data-toggle="tab">Category one</a></li> -->
<!--                   <li><a href="#cat2" data-toggle="tab">Category two</a></li> -->
<!--                 </ul> -->
<!--               </li> -->
<!--             </ul> -->
            <div id="myTabContent" class="tab-content tabWrapper">
            <div class="tab-pane fade active in" id="home">
			  <h4> 產品詳情 </h4>
                <table class="table table-striped">
				<tbody>
				<tr class="techSpecRow"><td class="techSpecTD1"> 顏色:</td><td class="techSpecTD2"> ${product.classDefualt}</td></tr>
				<tr class="techSpecRow"><td class="techSpecTD1"> 樣式:</td><td class="techSpecTD2"> ${product.productCategory}</td></tr>
				<tr class="techSpecRow"><td class="techSpecTD1"> 重量:</td><td class="techSpecTD2"> ${product.productWeight} </td></tr>
				<tr class="techSpecRow"><td class="techSpecTD1"> 狀態:</td><td class="techSpecTD2"> ${product.productStatus} </td></tr>
				<tr class="techSpecRow"><td class="techSpecTD1"> 評價:</td><td class="techSpecTD2"> ${product.productValue} </td></tr>
				</tbody>
				</table>
				<p>${top5.top5Info}</p>
			</div>
			<div class="tab-pane fade" id="profile">
			<div class="row-fluid">	  
			<div class="span2">
				<img src="${pageContext.request.contextPath}/img/d.jpg" alt="">
			</div>

			<hr class="soften"/>
			
				</div>
            </div>

</div>
</div>
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
	<script src="${pageContext.request.contextPath}/js/jquery.easing-1.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.scrollTo-1.4.3.1-min.js"></script>
    <script src="${pageContext.request.contextPath}/js/shop.js"></script>
  </body>
</html>