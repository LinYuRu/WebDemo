<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index">Home</a> <span class="divider">/</span></li>
				<li class="active">Page Title</li>
			</ul>
			<div class="well well-small">
				<h1>Title of the page</h1>
				<h2>Title of the page</h2>
				<h3>Title of the page</h3>
				<h4>Title of the page</h4>
				<h5>Title of the page</h5>
				<h6>Title of the page</h6>
				<hr class="soft" />
				<h2>List of the text</h2>

				<h3>Unordered List</h3>
				<br />
				<ul>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta felis .</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta felis at
						sollicitudin.</li>
				</ul>
				<h3>Ordered List</h3>
				<br />
				<ol>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta.</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta felis .</li>
					<li>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Nam elementum varius dapibus. Sed hendrerit porta felis at
						sollicitudin.</li>
				</ol>
				<hr class="soft" />
				<h2>Paragraph</h2>
				<p>Sed at nunc ac neque semper fermentum. Proin diam sem, semper
					fermentum eleifend nec, viverra ac est. Sed ultricies, lectus et
					vehicula imperdiet, felis tortor vehicula turpis, non fermentum
					enim est et sapien. Nam justo mi, dignissim a euismod ut, pretium
					sed leo. Cum sociis natoque penatibus et magnis dis parturient
					montes, nascetur ridiculus mus. In viverra porta est, consequat
					elementum metus tristique a. Mauris tempus tellus a metus dapibus
					faucibus egestas lectus consectetur. Integer libero dolor, luctus
					non congue vitae, tempus ut neque. Nunc eleifend lorem quis diam
					pharetra sagittis. Aliquam ut dolor dui. Fusce dictum facilisis
					ipsum eu porttitor. In ultricies rhoncus tortor vitae tincidunt.</p>

				<h5>Lorem ipsum dolor sit amet</h5>
				<br />
				<p>Nullam a vulputate leo. Nulla tristique metus eros. Curabitur
					ultrices commodo mauris, sit amet faucibus lectus fermentum in.
					Nulla eleifend, augue hendrerit tempus faucibus, diam lacus aliquet
					urna, eget facilisis turpis risus quis arcu. Cras placerat suscipit
					sem, ac consequat dui iaculis eu. Cras elit enim, adipiscing
					lobortis rutrum ac, vehicula nec massa. Praesent pharetra ligula ac
					erat venenatis feugiat. Quisque id nulla mi. Mauris at orci nec
					nisi eleifend auctor.</p>

				<hr class="soft" />
				<h2>Table</h2>
				<table class="table table-condensed">
					<thead>
						<tr>
							<th>#</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<td>2</td>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<td>3</td>
							<td colspan="2">Larry the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
				<br> <br>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>#</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td rowspan="2">1</td>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
							<td>Mark</td>
							<td>Otto</td>
							<td>@TwBootstrap</td>
						</tr>
						<tr>
							<td>2</td>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<td>3</td>
							<td colspan="2">Larry the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
				<hr />
				<h2>Form with validation states</h2>
				<br />

				<form class="bs-docs-example form-horizontal">
					<div class="control-group warning">
						<label class="control-label" for="inputWarning">Input with
							warning</label>
						<div class="controls">
							<input type="text" id="inputWarning"> <span
								class="help-inline">Something may have gone wrong</span>
						</div>
					</div>
					<div class="control-group error">
						<label class="control-label" for="inputError">Input with
							error</label>
						<div class="controls">
							<input type="text" id="inputError"> <span
								class="help-inline">Please correct the error</span>
						</div>
					</div>
					<div class="control-group info">
						<label class="control-label" for="inputInfo">Input with
							info</label>
						<div class="controls">
							<input type="text" id="inputInfo"> <span
								class="help-inline">Username is taken</span>
						</div>
					</div>
					<div class="control-group success">
						<label class="control-label" for="inputSuccess">Input with
							success</label>
						<div class="controls">
							<input type="text" id="inputSuccess"> <span
								class="help-inline">Woohoo!</span>
						</div>
					</div>
				</form>

				<h5>Lorem ipsum dolor sit amet</h5>
				<br />
				<p>Aliquam interdum, ipsum a posuere dictum, tellus risus
					blandit dolor, at tristique sapien urna vel purus. Pellentesque in
					dictum urna. Sed feugiat libero sit amet arcu malesuada eu
					convallis dui convallis. Donec facilisis massa a ipsum aliquam
					lobortis. Praesent ac lectus sed leo aliquam egestas. Sed ante
					neque, volutpat ac tempor et, bibendum at ligula. Nunc porta
					vestibulum sodales.</p>
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
