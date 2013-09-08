<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<jsp:include page="alert.jsp"></jsp:include>
	<div class="row">
		<h3 class="text-center">Users List</h3>
		<c:if test="${users != null}">
		<table id="userTable" class="table table-hover table-bordered table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th><input type="checkbox" /></th>
					<th>用户名</th>
					<th>服务名称</th>
					<th>账户到期</th>
					<th>下载限制</th>
					<th>上传限制</th>
					<th>合计限制</th>
					<th>上线时间限制</th>
					<th>静态IP</th>
					<th>姓</th>
					<th>名</th>
					<th>地址</th>
					<th>固话</th>
					<th>手机</th>
					<th>Email</th>
					<th>注册日期</th>
					<th>注解</th>
				</tr>
			</thead>
			<tbody>
				
				<c:forEach var="user" items="${users }" varStatus="item">
				<tr>
					<td>${item.index }</td>
					<td><input type="checkbox" /></td>
					<td>
						<a href="/radius/admin/user/edit/${user.username }">${user.username}</a> 
					</td>
					<td>
						<a href="/radius/admin/plan/edit/${user.srvid }">${user.service.srvname}</a>
					</td>
					<td>${user.expiration}</td>		
					<td>${user.downlimit}</td>
					<td>${user.uplimit}</td>
					<td>${user.comblimit}</td>
					<td>${user.uptimelimit}</td>
					<td>${user.staticip}</td>
					<td>${user.firstname}</td>
					<td>${user.lastname}</td>
					<td>${user.address}</td>
					<td>${user.phone}</td>
					<td>${user.mobile}</td>
					<td>${user.email}</td>
					<td>${user.createdon}</td>
					<td>${user.comment}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</c:if>
		<c:if test="${users == null}">
			there are no users.
		</c:if>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>