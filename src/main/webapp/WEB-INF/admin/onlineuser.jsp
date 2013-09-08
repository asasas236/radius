<%@ page language="java" import="com.telnet.radius.model.*,java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
	<jsp:include page="alert.jsp"></jsp:include>
	<div class="row">
		<h3 class="text-center">Online Users</h3>
		
		<%
			List<Radacct> accts = (List<Radacct>) request.getAttribute("accts");
			if (accts != null && accts.size() > 0) {
		%>
		<table id="onlineTable" class="table table-hover table-bordered table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th><input type="checkbox" /></th>
					<th>用户名</th>
					<th>开始时间</th>
					<th>在线时间</th>
					<th>下载</th>
					<th>上传</th>
					<th>IP地址</th>
					<th>主叫地址</th>
					<th>NAS</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0, len = accts.size(); i < len; i++) {
							Radacct acct = accts.get(i);
				%>
				<tr>
					<td><%=i + 1%></td>
					<td><input type="checkbox" /></td>
					<td><%=acct.getUsername() %></td>
					<td><%=acct.getAcctstarttime() %></td>
					<td><%=acct.getOnlineTime() %></td>
					
					<td><%=acct.getDownloadKB() %>&nbsp;KB</td>
					<td><%=acct.getUploadKB() %>&nbsp;KB</td>
					<td><%=acct.getFramedipaddress() %></td>
					<td><%=acct.getCallingstationid() %></td>
					<td><%=acct.getNasipaddress() %></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
		<%
			} else {
		%>
		<div class="alert">No users is online.</div>
		<%
			}
		%>
		
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>