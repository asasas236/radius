<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<jsp:include page="alert.jsp"></jsp:include>
	<div class="row">
		<h3 class="text-center">Services List</h3>
		
		<c:if test="${services != null}">
		<table id="serviceTable" class="table table-hover table-bordered table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th><input type="checkbox" /></th>
					<th>服务名称</th>
					<th>总计价格($)</th>
					<th>下载速率(kbps)</th>
					<th>上传速率(kbps)</th>
					<th>ip pool 名称</th>
					<th>限制合计流量</th>
					<th>限制到期</th>
					<th>限制在线时长</th>
					<th>下一服务</th>
					<th>日配额超限服务</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="service" items="${services }" varStatus="item">
				<tr>
					<td>${item.index }</td>
					<td><input type="checkbox" /></td>
					<td>
						<a href="/radius/admin/plan/edit/${service.srvid }">${service.srvname}</a>
					</td>
					<td>${service.unitprice}</td>
					<td>${service.downrate}</td>		
					<td>${service.uprate}</td>
					<td>${service.poolname}</td>
					<td>${service.limitcomb}</td>
					<td>${service.limitexpiration}</td>
					<td>${service.limituptime}</td>
					<td>${service.nextsrvid}</td>
					<td>${service.dailynextsrvid}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</c:if>
		<c:if test="${services == null}">
			<a></a>
		</c:if>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>