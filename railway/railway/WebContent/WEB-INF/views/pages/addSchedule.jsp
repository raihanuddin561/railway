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
				action="${pageContext.request.contextPath }/addSchedule" commandName = "scheduling">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Add Scheduling  </legend>
	
				<div class="form-group">
					<label class="col-md-8 control-label" for="trainNo">Train NO</label>
					<div class="col-md-8">
						<sf:input id="trainNo" path="trains.trainNo" name="trainNo" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="trains.trainNo" cssClass="alert-danger"></sf:errors>
						<%-- <sf:select path="trainName">
							<sf:option value="${trainNo }">${trainName }</sf:option>
						</sf:select> --%>
						
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-8 control-label" for="startingStation">Starting Station</label>
					<div class="col-md-8">
						<sf:input id="startingStation" path="startingStation" name="startingStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="startingStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="scheduleStation">Schedule Station</label>
					<div class="col-md-8">
						<sf:input id="scheduleStation" path="scheduleStation" name="scheduleStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="scheduleStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="schedule">Schedule Time</label>
					<div class="col-md-8">
						<sf:input id="schedule" path="schedule" name="schedule" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="schedule" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="destination">Destination(time) </label>
					<div class="col-md-8">
						<sf:input id="destination" path="destination" name="destination" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="destination" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				;
				<div class="form-group">
					<label class="col-md-8 control-label" for="offDay">Off Day </label>
					<div class="col-md-8">
						<sf:input id="offDay" path="offDay" name="offDay" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="offDay" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<!-- Text input-->
					
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Add Schedule</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





