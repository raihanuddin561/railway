<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<div style="margin-left: 15%" class="limiter">
	<div class="container-login100"
		style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54"
			style="width: 80%">

			<h2 class="mb-3" style="color: purple; text-align: center;">GALLERY</h2>
			<sec:authentication var="uid" property="principal.username" />
			<h3 class="mb-3">তোমার প্রোফাইল পিকচার</h3>


			<c:choose>
				<c:when test="${hasProfile}">
					<c:forEach var="row" items="${pic}">
						<div class="card mr-2">
							
							<div class="card-body"><img height="100px" width="100px" alt=""
							src="<c:url value='/locationimages/${uid }/profile/${row.profilePic}'></c:url>"></div>
							
						</div>
						
					</c:forEach>
				</c:when>

				<c:otherwise></c:otherwise>
			</c:choose>

			<br>
			



		</div>
	</div>
</div>





