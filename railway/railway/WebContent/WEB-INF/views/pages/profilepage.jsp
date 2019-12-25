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



			<h3></h3>
			<img class="rounded-circle" height="50px" width="50px"
				src="<c:url value='/locationimages/${username }/profile/${propic}'></c:url>" />
			<sec:authentication var="uid" property="principal.username" />
			<sf:form class="form-horizontal" method="post"
				action="${pageContext.request.contextPath }/profile?uid=${uid }&${_csrf.parameterName}=${_csrf.token}"
				commandName="user" enctype="multipart/form-data">
				<fieldset>

					<!-- Form Name -->
					<legend>Update profile pic </legend>

					<div class="form-group">
						<label class="col-md-8 control-label" for="username"></label>
						<div class="col-md-8">
							<sf:input id="username" path="username" value="${uid }"
								name="username" type="hidden" placeholder=""
								class="form-control input-md" />

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">

						<div class="col-md-8">
							<sf:input id="propic" path="propic" name="propic" type="file"
								placeholder="" class="form-control input-md" />
								
							<c:choose>
								<c:when test="${param.uploadfileempty}"><span style="color: red">Please select picture</span></c:when>
								
								<c:otherwise></c:otherwise>
							</c:choose>
							<%-- <c:choose>
								<c:when test="${uploadfileempty}"><span style="color: red">Please select picture</span></c:when>
								<c:otherwise>Select pic</c:otherwise>
							</c:choose> --%>
							
						</div>
					</div>


					<!-- Button -->
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Update</button>
						</div>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</fieldset>
			</sf:form>


			<br>
			<hr>



		</div>
	</div>
</div>





