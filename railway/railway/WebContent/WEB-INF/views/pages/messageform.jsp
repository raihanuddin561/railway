<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div style="margin-left:15%" class="limiter">
		<div class="container-login100"
			style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
		<sf:form class="form-horizontal" action="${pageContext.request.contextPath }/sendMessage" method="post"
				 commandName = "messages">
			<fieldset>
	
				<!-- Form Name -->
				<legend>Send Message</legend>
	
				
	
				<!-- Text input-->
				<%-- <div class="form-group">
					<label class="col-md-8 control-label" for="mid">Staff name</label>
					<div class="col-md-8">
						<sf:input id="mid" path="mid" name="mid" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="sname" cssClass="alert-danger"></sf:errors>
					</div>
				</div> --%>
				
				<%-- <input type ="hidden" name = "_flowExecutionKey" value = "${flowExecutionKey }" />
				<input type ="hidden" name = "_eventId" value = "send" />
				 --%>
				<div class="form-group">
					<label class="col-md-8 control-label" for="sender">Sender</label>
					<div class="col-md-8">
						<sf:input id="sender" path="sender" name="sender" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="sender" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="col-md-8 control-label" for="receiver">Receiver</label>
					<div class="col-md-8">
						<sf:input id="receiver" path="receiver" name="receiver" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="receiver" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-8 control-label" for="message">Message</label>
					<div class="col-md-8">
						<sf:input id="message" path="message" name="message" type="text" placeholder=""
							class="form-control input-md" />
						<sf:errors path="message" cssClass="alert-danger"></sf:errors>
					</div>
				</div>
				
				<!-- Button -->
				<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">Send</button>
						</div>
					</div>
	
			</fieldset>
		</sf:form>
	</div>
		</div>
	</div>





