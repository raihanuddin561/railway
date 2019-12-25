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
				action="${pageContext.request.contextPath }/addvenue" commandName = "venueInfo">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Update Staff Information</legend>
	
				<div class="form-group">
					
					<div class="col-md-8">
						<sf:input id="vid" path="vid" name="vid" type="hidden" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-8 control-label" for="state">Venue name/state</label>
					<div class="col-md-8">
						<sf:input id="state" path="state" name="state" type="text" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
				
				
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Update Venue</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





