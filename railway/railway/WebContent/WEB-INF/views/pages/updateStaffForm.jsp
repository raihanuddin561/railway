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
				action="${pageContext.request.contextPath }/addstaff" commandName = "staffInfo">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Update Staff Information</legend>
	
				<div class="form-group">
					
					<div class="col-md-8">
						<sf:input id="sid" path="sid" name="sid" type="hidden" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-8 control-label" for="sname">Staff name</label>
					<div class="col-md-8">
						<sf:input id="sname" path="sname" name="sname" type="text" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-8 control-label" for="phone">Phone</label>
					<div class="col-md-8">
						<sf:input id="phone" path="phone" name="phone" type="text" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="col-md-8 control-label" for="salary">Salary</label>
					<div class="col-md-8">
						<sf:input id="salary" path="salary" name="salary" type="text" placeholder=""
							class="form-control input-md" />
						
					</div>
				</div>
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Update Staff</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





