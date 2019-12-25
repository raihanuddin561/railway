<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div style="margin-left: 15%" class="limiter">
	<div class="container-login100"
		style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54" style="width:80%">
			<span class="login100-form-title p-b-49"> Contact with train admin </span>
			<form class="login100-form validate-form"
				action='${pageContext.request.contextPath }/searchTrainContact' method='POST'>
				<span class="login100-form-title p-b-49">  </span>

				<div class="wrap-input100 validate-input m-b-23"
					data-validate="name is reauired">
					<span class="label-input100">Trains</span> <input class="input100"
						type="text" name='stationname' placeholder="Type any name">
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

			<table class="table table-striped" border="1" >
				<tr>
					
					<th>Train No</th>
					<th>Train Name</th>
					<th>Option</th>
					
				</tr>
				
				
				<c:forEach var="row" items="${trainContact}">
					<tr>
						<td><c:out value="${row.trainNo}"></c:out></td>
						<td><c:out value="${row.trainName}"></c:out></td>
						<td>
							<a href="<c:url value='/reply?id=${row.trainNo}'></c:url>">Message</a>
						</td>
					
						</tr>
				</c:forEach>
			</table>

		</div>
	</div>
</div>





