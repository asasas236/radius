<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<jsp:include page="alert.jsp"></jsp:include>
		<div class="span12">
			<form class="form-horizontal" method="post" action="trafficreport">
				<fieldset>
					<div id="legend">
						<legend>Search User Traffic Report</legend>
					</div>
					<div class="control-group">
						<label class="control-label" for="managername">User Name</label>
						<div class="controls">
							<input type="text" placeholder="User Name" class="input-xlarge" required name="username" />
							<p class="help-block">Please input user</p>
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" ></label>
						<div class="controls">
							<input type="submit" class="btn btn-large btn-primary" value="Search"/>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>