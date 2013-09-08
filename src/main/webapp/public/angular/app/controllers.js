'use strict';

/* Controllers */

// 控制用户信息的控制器

function UsersCtrl($scope, $http) {
	$scope.url = 'admin/adduser';

	$scope.user = {
		username: '',
		password: '',
		enableuser: true,
		comblimit: 0,
		uptimelimit: 0,
		credits: 0
	};

	$scope.submit = function() {
		var user = $scope.user;
		var user1 = {
			username: 'cook',
			password: '123'
		};
		console.log(user);
		console.log(user1);
		/*$http({
			method: 'POST',
			url: '/radius/admin/adduser',
			params: user
		}).success(function(data) {
			if (data > 0) {
				console.log(data);
				//$location.path('users');
			}

		}).error(function(data) {
			console.log(data);
		});*/
	};
}
UsersCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器

function NASCtrl($scope, $http) {
	$scope.url = 'nas/addnas.html';
}
NASCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器

function ReprotCtrl($scope, $http) {
	$scope.url = 'report/onlineuser.html';
}
ReprotCtrl.$inject = ['$scope', '$http'];

// 控制NAS信息的控制器

function CardCtrl($scope, $http) {
	$scope.url = 'card/addcard.html';
}
CardCtrl.$inject = ['$scope', '$http'];

//控制登入的控制器 

function LoginCtrl($scope, $http, $location) {

	$scope.login = {
		logname: '',
		logpwd: ''
	};

	$scope.submit = function() {

		var login = $scope.login;
		alert(login.logname + " " + login.logpwd);
		$http({
			method: 'POST',
			url: '/radius/admin/login',
			params: {
				username: login.logname,
				password: login.logpwd
			}
		}).success(function(data) {
			if (data > 0) {
				console.log(data);
				$location.path('users');
			}

		}).error(function(data) {
			console.log(data);
			$location.path('users');
		});
	};

}
CardCtrl.$inject = ['$scope', '$http', '$location'];
//'username=' + login.logname