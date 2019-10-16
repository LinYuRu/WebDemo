<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
	<!-- Favicons -->
<!--     <link rel="shortcut icon" href="ico/favicon.ico"> -->

<!-- 
	Upper Header Section 
-->
<div class="navbar navbar-inverse navbar-fixed-top">
<!-- 	<div class="topNav"> -->
<!-- 		<div class="container"> -->
<!-- 			<div class="alignR"> -->
<!-- 				<div class="pull-left socialNw"> -->
<!-- 					<a href="#"><span class="icon-twitter"></span></a> -->
<!-- 					<a href="#"><span class="icon-facebook"></span></a> -->
<!-- 					<a href="#"><span class="icon-youtube"></span></a> -->
<!-- 					<a href="#"><span class="icon-tumblr"></span></a> -->
<!-- 				</div> -->
<!-- 				<a class="active" href="index.jsp"> <span class="icon-home"></span> Home</a>  -->
<!-- 				<a href="#"><span class="icon-user"></span> My Account</a>  -->
<!-- 				<a href="register.jsp"><span class="icon-edit"></span> Free Register </a>  -->
<!-- 				<a href="contact.jsp"><span class="icon-envelope"></span> Contact us</a> -->
<!-- 				<a href="cart.jsp"><span class="icon-shopping-cart"></span> 2 Item(s) - <span class="badge badge-warning"> $448.42</span></a> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->

<div class="navbar">
	  <div class="navbar-inner">
		<div class="container">
		  <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		  </a>
		  <div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="index">首頁 </a></li>
						<li class=""><a href="listview">產品清單</a></li>
						<li class=""><a href="products">顯示產品</a></li>
						<li class=""><a href="threecol">三欄表示</a></li>
						<li class=""><a href="fourcol">四欄表示</a></li>						
					</ul>
					<form action="#" class="navbar-search pull-left">
			  <input type="text" placeholder="Search" class="search-query span2">
			</form>
			<%-- <ul class="nav pull-right">
			<li class="dropdown">
				<a data-toggle="dropdown" class="dropdown-toggle" href="#"><span class="icon-lock"></span> Login <b class="caret"></b></a>
				<div class="dropdown-menu">
				
				<form:form method='POST' modelAttribute="LoginBean"
					class="control-group"
						enctype="multipart/form-data">
			
				  <div class="control-group">
					<form:input type="text" class="span2" path="memberAccount" placeholder="Email" />
				  </div>
				  <div class="control-group">
					<form:input type="password" class="span2" path="memberPassword" placeholder="Password" />
				  </div>
				  <font color="red">${sessionScope.loginerr}</font>
				  <div class="control-group">
					<button type="submit" class="shopBtn btn-block">Sign in</button>
				  </div>
				</form:form>
				
				</div>
			</li>
			</ul>
			--%>
					  
			<ul class="nav">
			     <li><a href="index/member">${sessionScope.username}</a></li>
			     <li><a href="index/logout">${sessionScope.logout}</a></li>
			     <li><a href="index/login"  style="display:${sessionScope.style}">Login</a></li>
			</ul>
		  </div>
		</div>
	  </div>
	</div>
</div>

<!--
Lower Header Section 
-->
<div class="container">
<div id="gototop"> </div>
<div class="row">
	<div class="span4">
<!-- 	<h1> -->
<!-- 	<a class="logo" href="index.jsp"><span>Twitter Bootstrap ecommerce template</span>  -->
<!-- 		<img src="assets/img/logo-bootstrap-shoping-cart.png" alt="bootstrap sexy shop"> -->
<!-- 	</a> -->
<!-- 	</h1> -->
<!-- 	</div> -->
<!-- 	<div class="span4"> -->
<!-- 	<div class="offerNoteWrapper"> -->
<!-- 	<h1 class="dotmark"> -->
<!-- 	<i class="icon-cut"></i> -->
<!-- 	Twitter Bootstrap shopping cart jsp template is available @ $14 -->
<!-- 	</h1> -->
	</div>
	</div>
<!-- 	<div class="span4 alignR"> -->
<!-- 	<p><br> <strong> Support (24/7) :  0800 1234 678 </strong><br><br></p> -->
<!-- 	<span class="btn btn-mini">[ 2 ] <span class="icon-shopping-cart"></span></span> -->
<!-- 	<span class="btn btn-warning btn-mini">$</span> -->
<!-- 	<span class="btn btn-mini">&pound;</span> -->
<!-- 	<span class="btn btn-mini">&euro;</span> -->
	</div>
</div>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	  <div class="navbar-inner">
<!-- 		<div class="container"> -->
<!-- 		  <a data-target=".nav-collapse" data-toggle="collapse" class="btn btn-navbar"> -->
<!-- 			<span class="icon-bar"></span> -->
<!-- 			<span class="icon-bar"></span> -->
<!-- 			<span class="icon-bar"></span> -->
<!-- 		  </a> -->
<!-- 		  <div class="nav-collapse"> -->
<!-- 					<ul class="nav"> -->
<!-- 						<li class="active"><a href="index">首頁 </a></li> -->
<!-- 						<li class=""><a href="listview">產品清單</a></li> -->
<!-- 						<li class=""><a href="products">顯示產品</a></li> -->
<!-- 						<li class=""><a href="threecol">三欄表示</a></li> -->
<!-- 						<li class=""><a href="fourcol">四欄表示</a></li> -->
<!-- 						<li class=""><a href="general">General Content</a></li> -->
<!-- 					</ul> -->
<!-- 					<form action="#" class="navbar-search pull-left"> -->
<!-- 			  <input type="text" placeholder="Search" class="search-query span2"> -->
<!-- 			</form> -->
<!-- 			<ul class="nav pull-right"> -->
<!-- 			<li class="dropdown"> -->
<!-- 				<a data-toggle="dropdown" class="dropdown-toggle" href="#"><span class="icon-lock"></span> Login <b class="caret"></b></a> -->
<!-- 				<div class="dropdown-menu"> -->
<!-- 				<form class="form-horizontal loginFrm"> -->
<!-- 				  <div class="control-group"> -->
<!-- 					<input type="text" class="span2" id="inputEmail" placeholder="Email"> -->
<!-- 				  </div> -->
<!-- 				  <div class="control-group"> -->
<!-- 					<input type="password" class="span2" id="inputPassword" placeholder="Password"> -->
<!-- 				  </div> -->
<!-- 				  <div class="control-group"> -->
<!-- 					<label class="checkbox"> -->
<!-- 					<input type="checkbox"> Remember me -->
<!-- 					</label> -->
<!-- 					<button type="submit" class="shopBtn btn-block">Sign in</button> -->
<!-- 				  </div> -->
<!-- 				</form> -->
<!-- 				</div> -->
<!-- 			</li> -->
<!-- 			</ul> -->
<!-- 		  </div> -->
<!-- 		</div> -->
	  </div>
	</div>
<!-- 
Body Section 
-->