'use strict';

// radius admin js

$(function() {
	// alert('hello');

	// 顶部导航选项激活
	/*
	 * $('#topnav').delegate('a', 'click', function(e){
	 * 
	 * e.preventDefault();
	 * 
	 * $(this).closest("li").addClass('active').siblings().removeClass('active');
	 * 
	 * });
	 */

	$('#srvSelect').change(function() {
		var vals = $(this).val().split("@");
		$('#srvid').val(vals[0]);
		$('#srvname').val(vals[1]);
	});

	var val = $('#srvSelect').val();
	if (val && val.length > 0) {
		var vals = val.split("@");
		$('#srvid').val(vals[0]);
		$('#srvname').val(vals[1]);
	}
	
	var isUserExist = false;
	
	$('#username').on('blur', function() {
		var val = this.value;
		var $that = $(this);
		var cg = $('#cg-username');
		var help = $that.next('.help-block');
		
		$.get("/radius/admin/user/check", {
			username : val
		}, function(data) {
			
			if (data == 1) { 
				isUserExist = true;
				cg.addClass("error");
				help.text("UserName is existed, please change the other one.");
			} else {
				isUserExist = false;
				cg.removeClass('error');
				help.text("");
			}
			
		}, 'json');
	});
	
	
	var checkpwdsame = true;
	
	$('#password,#checkpwd').on('blur', function() {
		var pwd = $('#password').val();
		
		var $checkpwd = $('#checkpwd');
		var checkpwd = $checkpwd.val();
		var cg = $('#cg-checkpwd');
		var help = $checkpwd.next('.help-block');
		
		if (pwd != checkpwd) {
			checkpwdsame = false;
			cg.addClass("error");
			help.text("Please input same password.");
		} else {
			checkpwdsame = true;
			cg.removeClass("error");
			help.text("");
		}
	});

	// $("input,select,textarea").not("[type=submit]").jqBootstrapValidation();
	$('#createuserForm').on('submit', function(e) {
		e.preventDefault();
		
//		var pwd = $('#password').val();
//		var checkpwd = $('#checkpwd').val();
		
		if (!isUserExist && checkpwdsame) {
			this.submit();
		}
	});

});