<div class="container">
	<div class="row">
		<jsp:include page="alert.jsp"></jsp:include>
		<div class="span12">
			<form class="form-horizontal" method="post" action="/radius/admin/login">
				<fieldset>
					<div id="legend">
						<legend>Radius Control Platform</legend>
					</div>
					<div class="control-group">
						<label class="control-label" for="managername">Administrator</label>
						<div class="controls">
							<input type="text" placeholder="Administrator" class="input-xlarge" required name="managername" />
							<p class="help-block">Please input your administrator account</p>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">Password</label>
						<div class="controls">
							<input type="password" placeholder="Password" class="input-xlarge" required name="password"/>
							<p class="help-block">Please input your administrator password</p>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" ></label>
						<div class="controls">
							<input type="submit" class="btn btn-large btn-primary" value="Login"/>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>