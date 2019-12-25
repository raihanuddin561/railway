<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div style="margin-left: 15%" class="limiter">
	<div class="container-login100"
		style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54"
			style="width: 80%">



			<form class="login100-form validate-form"
				action='${pageContext.request.contextPath }/userlist' method='POST'>
				<span class="login100-form-title p-b-49"> Search Others </span>

				<div class="wrap-input100 validate-input m-b-23"
					data-validate="bookname is reauired">
					<span class="label-input100">Name</span> <input class="input100"
						type="text" name='firstname' placeholder="Type any name">
					<span class="focus-input100" data-symbol="&#xf206;"></span>
				</div>


				<div class="container-login100-form-btn">
					<div class="wrap-login100-form-btn">
						<div class="login100-form-bgbtn"></div>
						<button class="login100-form-btn">Search</button>
					</div>
				</div>
				<div>
					<input name="${_csrf.parameterName}" type="hidden"
						value="${_csrf.token}" />
				</div>
			</form>
			<br>
			<hr>

			<c:choose>
				<c:when test="${ searchClicked}">
					<c:choose>
						<c:when test="${hasUserList }">
							<table class="table table-striped" border="1">
								<tr>
									<th>Profile</th>
									<th>Name</th>
									<th>Email</th>

								</tr>
								<c:forEach var="row" items="${userlist}">
									<tr>
										<td><img class="rounded-circle" height="50px"
											width="50px" alt=""
											src="<c:url value='/locationimages/${row.username }/profile/${row.profilePic}'></c:url>"></td>
										<td><c:out value="${row.firstname}"></c:out> <c:out
												value="${row.lastname}"></c:out></td>
										<td><c:out value="${row.email}"></c:out></td>
									</tr>
								</c:forEach>
							</table>
						</c:when>
						<c:otherwise>
							<p>This name is not available</p>
						</c:otherwise>
					</c:choose>
				</c:when>
				<c:otherwise>Enter name 
				</c:otherwise>
			</c:choose>


		</div>
	</div>
</div>





