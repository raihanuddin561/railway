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
				action="${pageContext.request.contextPath }/ticketBooking" commandName = "ticket">
			<fieldset>
	
				<!-- Form Name -->
				<legend> Ticket Booking </legend>
	
				<div class="form-group">
					<label class="col-md-8 control-label" for="fromStation">From</label>
					<div class="col-md-8">
						<sf:input id="fromStation" path="fromStation" name="fromStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="fromStation" cssClass="alert-danger"></sf:errors>
						<%-- <sf:select path="trainName">
							<sf:option value="${trainNo }">${trainName }</sf:option>
						</sf:select> --%>
						
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-8 control-label" for="toStation">To</label>
					<div class="col-md-8">
						<sf:input id="toStation" path="toStation" name="toStation" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="toStation" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-8 control-label" for="journeyDate">Journey Date</label>
					<div class="col-md-8">
						<sf:input id="journeyDate" path="journeyDate" name="journeyDate" type="date" placeholder=""
							class="form-control input-md" />
						<sf:errors path="journeyDate" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				<%-- <div class="form-group">
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
				</div> --%>
				<!-- Text input-->
					
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Submit</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





