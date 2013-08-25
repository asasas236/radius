'use strict';

// radius admin js

$(function(){
	// alert('hello');

	// 顶部导航选项激活
	$('#topnav').delegate('a', 'click', function(e){

		e.preventDefault();

		$(this).closest("li").addClass('active').siblings().removeClass('active');
		
	});

});