<%@ page language="java" import="com.telnet.radius.model.*,java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
	<jsp:include page="alert.jsp"></jsp:include>
	<div class="row">
		<%
			String reportDate =(String)request.getAttribute("reportDate");
			
		%>
		<h3 class="text-center">Traffic Report from Whole <%=reportDate %></h3>
		
		<%
			List<Radacct> accts = (List<Radacct>) request.getAttribute("report");
			if (accts != null && accts.size() > 0) {
		%>
		<table id="usertrafficTable" class="table table-hover table-bordered table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>UserName</th>
					<th>Start Time</th>
					<th>End Time</th>
					<th>Total Time Spent Online</th>
					<th>Total Download</th>
					<th>Total Upload</th>
					<th>Total</th>
					<th>IP</th>
					<th>Calling ID</th>
					<th>NAS</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0, len = accts.size(); i < len; i++) {
							Radacct acct = accts.get(i);
				%>
				<tr>
					
					<td><%=i+1 %></td>
					<td><%=acct.getUsername() %></td>
					<td><%=acct.getAcctstarttime() %></td>
					<td><%=acct.getAcctstoptime() %></td>
					<td><%=acct.getOnlineTime() %></td>
					<td><%=acct.getDownloadMB() %>&nbsp;MB</td>
					<td><%=acct.getUploadMB() %>&nbsp;MB</td>
					<td><%=acct.getDownloadMB().add(acct.getUploadMB()) %>&nbsp;MB</td>
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
		<div class="alert">No Traffic Report.</div>
		<%
			}
		%>
		
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>