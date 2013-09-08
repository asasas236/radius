<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="company" content="telnet.co.nz" />
<title>Radius Control Platform</title>
<link rel="shortcut icon" type="image/ico" />
<link href="/radius/public/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="screen" />
<link href="/radius/public/css/main.css" rel="stylesheet" type="text/css" />
<link href="/radius/public/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container">
		<div class="row">
			<jsp:include page="alert.jsp"></jsp:include>
			<div class="span12">
				<form class="form-horizontal" method="post"
					action="/radius/admin/login">
					<fieldset>
						<div id="legend">
							<legend>Web Login</legend>
						</div>
						<div class="control-group">
							<label class="control-label" for="managername">Moblie Number</label>
							<div class="controls">
								<input type="text" placeholder="Phone Number"
									class="input-xlarge" required name="phonenumber" id="phonenumber"/>
								<p class="help-block">Please input your mobile number</p>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="password">Password</label>
							<div class="controls">
								<input type="password" placeholder="Password" class="input-xlarge" required name="password" />
								
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" ></label>
							<div class="controls">
								<button id="getpwd" class="btn btn-large btn-primary" >Click here to get the password by SMS</button>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label"></label>
							<div class="controls">
								<input type="submit" class="btn btn-large btn-primary" value="Login" />
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<div class="container">
		<hr>
		<footer>
			<p>&copy; Telnet Company 2013</p>
		</footer>
	</div>
	<script type="text/javascript" src="/radius/public/js/jquery-1.10.js"></script>
	<script type="text/javascript" src="/radius/public/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/radius/public/js/admin-app.js"></script>
	<script type="text/javascript">
	$(function(){
		var getpwd = $('#getpwd');
		var getpwdClick = function (){
			var phonenumber = $('#phonenumber');
			var number = phonenumber.val();
			if (number == "") {
				alert("Please input your correct mobile number.");
				return;
			}
			
			getpwd.addClass("disabled");
			getpwd.off("click", '**');
			
			$.get('/radius/sms', {mobileNumber: number}, function(data){
				console.log(data);
			}, "json");
			
			setTimeout(function(){
				getpwd.removeClass("disabled");
				getpwd.on("click", getpwdClick);
			}, 20000);
		}
		
		getpwd.on("click", getpwdClick);
	});
	</script>
</body>
</html>