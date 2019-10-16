<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

				
					<div id="myCarousel" class="carousel slide homCar">
						<div class="carousel-inner">
							<div class="item">
							<a href="#"> <img src="<c:url value='/getPicture/{top5.top5Id}'/>" alt="促銷折扣" title="促銷折扣" style="width:100%"></a>
								
								<div class="carousel-caption">
									<h4> 促銷折扣 </h4>
									<p>
										<span> 今日最便宜 </span>
									</p>
								</div>
							</div>
<!-- 							<div class="item"> -->
<%-- 								<img style="width: 100%" src="${pageContext.request.contextPath}/img/IPHONE12.png" --%>
<!-- 									alt="IPHONE11 PRO" title="IPHONE11 PRO"> -->
<!-- 								<div class="carousel-caption"> -->
<!-- 									<h4> IPHONE11 PRO</h4> -->
<!-- 									<p> -->
<!-- 										<span> 搶先預定 </span> -->
<!-- 									</p> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="item active"> -->
<%-- 								<img style="width: 100%" src="${pageContext.request.contextPath}/img/carouse3.png" --%>
<!-- 									alt="bootstrap ecommerce templates"> -->
<!-- 								<div class="carousel-caption"> -->
<!-- 									<h4> 居家百貨周年慶 </h4> -->
<!-- 									<p> -->
<!-- 										<span> 封館優惠 </span> -->
<!-- 									</p> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="item"> -->
<!-- 								<img style="width: 100%" -->
<%-- 									src="${pageContext.request.contextPath}/img/bootstrap-templates.png" --%>
<!-- 									alt="bootstrap templates"> -->
<!-- 								<div class="carousel-caption"> -->
<!-- 									<h4>每日特價</h4> -->
<!-- 									<p> -->
<!-- 										<span>今天最便宜</span> -->
<!-- 									</p> -->
<!-- 								</div> -->
<!-- 							</div> -->
						</div>
						<a class="left carousel-control" href="#myCarousel"
							data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
							href="#myCarousel" data-slide="next">&rsaquo;</a>
					</div>
			