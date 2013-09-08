<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="alertDiv">
	<%
		String success = (String)session.getAttribute("success");
		String error = (String)session.getAttribute("error");
	%>
	<% if (success != null) { %>
	<div class="alert alert-success">
		<%= success %>
	</div>
	
	<%
		session.removeAttribute("success");
	} %>
	<% if (error != null) { %>
	<div class="alert alert-error">
		<%= error %>
	</div>
	<%
		session.removeAttribute("error");
	} %>
</div>

