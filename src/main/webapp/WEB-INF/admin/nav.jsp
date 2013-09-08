<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="brand" href="#">Radius</a>
			
			<c:if test="${manager != null }">
			<div class="nav-collapse collapse">
				<ul class="nav" id="topnav">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Users<b class="caret"></b>
						</a>
						<ul class="dropdown-menu">
							
							<li><a href="/radius/admin/user/list">User List</a></li>
							<li><a href="/radius/admin/user/create">Create New User</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Services<b class="caret"></b>
						</a>
						<ul class="dropdown-menu">
							<li><a href="/radius/admin/plan/list">Service List</a></li>
							<li><a href="/radius/admin/plan/create">Create New Service</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							NAS<b class="caret"></b>
						</a>
						<ul class="dropdown-menu">
							
							<li><a href="#">NAS List</a></li>
							<li><a href="#">Create New NAS</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Report<b class="caret"></b>
						</a>
						<ul class="dropdown-menu">
							<li><a href="/radius/admin/report/onlineuser">Online Users Report</a></li>
							<li><a href="/radius/admin/report/trafficreport">User Traffic Report</a></li>
							<li><a href="/radius/admin/report/querytrafficreport">Search Traffic Data</a></li>
						</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							Card<b class="caret"></b>
						</a>
						<ul class="dropdown-menu">
							
							<li><a href="#">Card List</a></li>
							<li><a href="#">Create New Card</a></li>
						</ul>
					</li>
				</ul>
				<p class="navbar-text pull-right">
					Logged in as <a href="#" class="navbar-link">${manager.managername}</a>
					<a href="/radius/admin/logout" class="navbar-link">Logout</a>
				</p>
			</div>
			</c:if>
		</div>
	</div>
</div>