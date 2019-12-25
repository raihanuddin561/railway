<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div style="margin-left:15%" class="limiter">
		<div class="container-login100"
			style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
		<sf:form class="form-horizontal" method="post"
				action="${pageContext.request.contextPath }/addroute" commandName = "diparture">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Add Route Information </legend>
	
				<div class="form-group">
					<label class="col-md-8 control-label" for="trainNo">Train NO</label>
					<div class="col-md-8">
						<sf:input id="trainNo" path="trainNo" name="trainNo" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="trainNo" cssClass="alert-danger"></sf:errors>
						<%-- <sf:select path="trainName">
							<sf:option value="${trainNo }">${trainName }</sf:option>
						</sf:select> --%>
						
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-8 control-label" for="fromStation">From Station</label>
					<div class="col-md-8">
						<sf:input id="fromStation" path="fromStation" name="fromStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="fromStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="toStation">To Station</label>
					<div class="col-md-8">
						<sf:input id="toStation" path="toStation" name="toStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="toStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="startTime">Start time </label>
					<div class="col-md-8">
						<sf:input id="startTime" path="startTime" name="startTime" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="fromStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				;
				<div class="form-group">
					<label class="col-md-8 control-label" for="reachTime">Reach time </label>
					<div class="col-md-8">
						<sf:input id="reachTime" path="reachTime" name="reachTime" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="reachTime" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<!-- Text input-->
					
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Add Route</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





