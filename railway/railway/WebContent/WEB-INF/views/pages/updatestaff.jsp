<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div style="margin-left: 15%" class="limiter">
	<div class="container-login100"
		style="background-image: url('<c:url value="/static/loginstyle/images/bg-01.jpg"></c:url>');">
		<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54" style="width:80%">
			<span class="login100-form-title p-b-49"> Update Staff Information </span>

			<table class="table table-striped" border="1" >
				<tr>
					<th>Staff Id</th>
					<th>Staff Name</th>
					<th>Phone</th>
					<th>Salary</th>
					<th>Options</th>
					
				</tr>
				
				
				<c:forEach var="row" items="${staffList}">
					<tr>
						<td><c:out value="${row.sid}"></c:out></td>
						<td><c:out value="${row.sname}"></c:out></td>
						<td><c:out value="${row.phone}"></c:out></td>
						<td><c:out value="${row.salary}"></c:out></td>
						
						<td><a
							href="${pageContext.request.contextPath}/remove?sid=${row.sid}" onclick="return confirm('Are you sure you want to delete this item?');">Remove |</a><a
							href="${pageContext.request.contextPath}/update?sid=${row.sid}"> Update</a></td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</div>
</div>





